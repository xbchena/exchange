package com.iss.finanframe.http.client;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLHandshakeException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSONObject;

public class HttpclientUtil {
	private static final String CHARSET_UTF8 = "UTF-8";
	private static final String CHARSET_GBK = "GBK";
	//private static final String CHARSET_GBK = "UTF-8";
	private static final String SSL_DEFAULT_SCHEME = "https";
	private static final int SSL_DEFAULT_PORT = 443;
	public static Logger logger = LogManager.getLogger(HttpclientUtil.class);

	// 异常自动恢复处理, 使用HttpRequestRetryHandler接口实现请求的异常恢复
	private static HttpRequestRetryHandler requestRetryHandler = new HttpRequestRetryHandler() {
		// 自定义的恢复策略
		public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
			// 设置恢复策略，在发生异常时候将自动重试3次
			if (executionCount >= 3) {
				// Do not retry if over max retry count
				return false;
			}
			if (exception instanceof NoHttpResponseException) {
				// Retry if the server dropped connection on us
				return true;
			}
			if (exception instanceof SSLHandshakeException) {
				// Do not retry on SSL handshake exception
				return false;
			}
			HttpRequest request = (HttpRequest) context.getAttribute(ExecutionContext.HTTP_REQUEST);
			boolean idempotent = (request instanceof HttpEntityEnclosingRequest);
			if (!idempotent) {
				// Retry if the request is considered idempotent
				return true;
			}
			return false;
		}
	};

	// 使用ResponseHandler接口处理响应，HttpClient使用ResponseHandler会自动管理连接的释放，解决了对连接的释放管理
	private static ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
		// 自定义响应处理
		public String handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				String charset = EntityUtils.getContentCharSet(entity) == null ? CHARSET_GBK
						: EntityUtils.getContentCharSet(entity);
				return new String(EntityUtils.toByteArray(entity), charset);
			} else {
				return null;
			}
		}
	};

	/**
	 * Get方式提交,URL中包含查询参数, 格式：http://www.g.cn?search=p&name=s.....
	 * 
	 * @param url
	 *            提交地址
	 * @return 响应消息
	 */
	public static String get(String url) {
		return get(url, null, null);
	}

	/**
	 * Get方式提交,URL中不包含查询参数, 格式：http://www.g.cn
	 * 
	 * @param url
	 *            提交地址
	 * @param params
	 *            查询参数集, 键/值对
	 * @return 响应消息
	 */
	public static String get(String url, Map<String, String> params) {
		return get(url, params, null);
	}

	/**
	 * Get方式提交,URL中不包含查询参数, 格式：http://www.g.cn
	 * 
	 * @param url
	 *            提交地址
	 * @param params
	 *            查询参数集, 键/值对
	 * @param charset
	 *            参数提交编码集
	 * @return 响应消息
	 */
	public static String get(String url, Map<String, String> params, String charset) {
		if (url == null || url.equals("")) {
			return null;
		}
		List<NameValuePair> qparams = getParamsList(params);
		if (qparams != null && qparams.size() > 0) {
			charset = (charset == null ? CHARSET_GBK : charset);
			String formatParams = URLEncodedUtils.format(qparams, charset);
			url = (url.indexOf("?")) < 0 ? (url + "?" + formatParams)
					: (url.substring(0, url.indexOf("?") + 1) + formatParams);
		}
		DefaultHttpClient httpclient = getDefaultHttpClient(charset);
		HttpGet hg = new HttpGet(url);
		// 发送请求，得到响应
		String responseStr = null;
		try {
			responseStr = httpclient.execute(hg, responseHandler);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			logger.error("occur ClientProtocolException" + e.getStackTrace());
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("occur IOException" + e.getStackTrace());
		} finally {
			abortConnection(hg, httpclient);
		}
		return responseStr;
	}

	/**
	 * Post方式提交,URL中不包含提交参数, 格式：http://www.g.cn
	 * 
	 * @param url
	 *            提交地址
	 * @param params
	 *            提交参数集, 键/值对
	 * @return 响应消息
	 */
	public static String post(String url, Map<String, String> params) throws Exception {
		return post(url, params, null, 0, null);
	}

	/**
	 * Post方式提交,URL中不包含提交参数, 格式：http://www.g.cn
	 * 
	 * @param url
	 *            提交地址
	 * @param params
	 *            提交参数集, 键/值对
	 * @param charset
	 *            参数提交编码集
	 * @return 响应消息
	 */
	public static String post(String url, Map<String, String> params, String charset, int timeout, String contentType)
			throws Exception {
		if (url == null || url.equals("")) {
			return null;
		}
		// 创建HttpClient实例
		DefaultHttpClient httpclient = getDefaultHttpClient(charset);
		UrlEncodedFormEntity formEntity = null;
		String responseStr = null;
		HttpPost hp = new HttpPost(url);
		try {
			if (charset == null || charset.equals("")) {
				formEntity = new UrlEncodedFormEntity(getParamsList(params));
			} else {
				formEntity = new UrlEncodedFormEntity(getParamsList(params), charset);
			}
			hp.setEntity(formEntity);
			// hp.setHeader("Content-type",
			// "application/x-www-form-urlencoded");
			if (contentType == null || contentType.equals("")) {
				hp.setHeader("Content-type", "Content-type: application/json");
			} else {
				hp.setHeader("Content-type", contentType);
			}

			// 发送请求，得到响应
			HttpParams hParams = httpclient.getParams();
			// 设置连接超时参数
			timeout = timeout;
			int connectTimeoutEnv = timeout * 1000;
			int soTimeoutEnv = timeout * 1000;
			HttpConnectionParams.setConnectionTimeout(hParams, connectTimeoutEnv);
			HttpConnectionParams.setSoTimeout(hParams, soTimeoutEnv);
			responseStr = httpclient.execute(hp, responseHandler);
		} catch (ClientProtocolException e) {
			logger.error("httpclient调用出错", e);
		} catch (IOException e) {
			logger.error("httpclient调用出错", e);
		} catch (Exception e) {
			logger.error("httpclient调用出错", e);
		} finally {
			abortConnection(hp, httpclient);
		}
		return responseStr;
	}

	/**
	 * Post方式提交,忽略URL中包含的参数,解决SSL双向数字证书认证
	 * 
	 * @param url
	 *            提交地址
	 * @param params
	 *            提交参数集, 键/值对
	 * @param charset
	 *            参数编码集
	 * @param keystoreUrl
	 *            密钥存储库路径
	 * @param keystorePassword
	 *            密钥存储库访问密码
	 * @param truststoreUrl
	 *            信任存储库绝路径
	 * @param truststorePassword
	 *            信任存储库访问密码, 可为null
	 * @return 响应消息
	 * @throws NetServiceException
	 */
	public static String post(String url, Map<String, String> params, String charset, final URL keystoreUrl,
			final String keystorePassword, final URL truststoreUrl, final String truststorePassword) {
		if (url == null || url.equals("")) {
			return null;
		}
		DefaultHttpClient httpclient = getDefaultHttpClient(charset);
		UrlEncodedFormEntity formEntity = null;
		try {
			if (charset == null || charset.equals("")) {
				formEntity = new UrlEncodedFormEntity(getParamsList(params));
			} else {
				formEntity = new UrlEncodedFormEntity(getParamsList(params), charset);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		HttpPost hp = null;
		String responseStr = null;
		try {
			KeyStore keyStore = createKeyStore(keystoreUrl, keystorePassword);
			KeyStore trustStore = createKeyStore(truststoreUrl, keystorePassword);
			SSLSocketFactory socketFactory = new SSLSocketFactory(keyStore, keystorePassword, trustStore);
			// Scheme scheme = new Scheme(SSL_DEFAULT_SCHEME, socketFactory,
			// SSL_DEFAULT_PORT);
			// httpclient.getConnectionManager().getSchemeRegistry()
			// .register(scheme);
			SchemeRegistry sr = httpclient.getConnectionManager().getSchemeRegistry();
			// 注册支持的http连接模式
			sr.register(new Scheme(SSL_DEFAULT_SCHEME, SSL_DEFAULT_PORT, socketFactory));
			sr.register(new Scheme("http", 80, PlainSocketFactory.getSocketFactory()));
			hp = new HttpPost(url);
			hp.setEntity(formEntity);

			HttpParams hParams = httpclient.getParams();
			// 设置连接超时参数
			int connectTimeoutEnv = 10000;
			int soTimeoutEnv = 10000;
			HttpConnectionParams.setConnectionTimeout(hParams, connectTimeoutEnv);
			HttpConnectionParams.setSoTimeout(hParams, soTimeoutEnv);

			responseStr = httpclient.execute(hp, responseHandler);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (KeyStoreException e) {
			e.printStackTrace();
		} catch (CertificateException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (UnrecoverableKeyException e) {
			e.printStackTrace();
		} catch (KeyManagementException e) {
			e.printStackTrace();
		} finally {
			abortConnection(hp, httpclient);
		}
		return responseStr;
	}

	/**
	 * Post方式提交,URL中不包含提交参数, 格式：http://www.g.cn
	 * 
	 * @param url
	 *            提交地址
	 * @param params
	 *            jsonObject
	 * @param charset
	 *            参数提交编码集
	 * @return 响应消息
	 */
	public static String post(String url, JSONObject params, String charset, int timeout,String contentType) throws Exception {
		if (url == null || url.equals("")) {
			return null;
		}
		// 创建HttpClient实例
		DefaultHttpClient httpclient = getDefaultHttpClient(charset);
		StringEntity formEntity = null;
		String responseStr = null;
		HttpPost hp = new HttpPost(url);
		try {
			formEntity = new StringEntity(params.toJSONString());
			hp.setEntity(formEntity);
			if (contentType == null || contentType.equals("")) {
				hp.setHeader("Content-type", "Content-type: application/json");
			} else {
				hp.setHeader("Content-type", contentType);
			}
			// 发送请求，得到响应
			HttpParams hParams = httpclient.getParams();
			// 设置连接超时参数
			timeout = timeout;
			int connectTimeoutEnv = timeout * 1000;
			int soTimeoutEnv = timeout * 1000;
			HttpConnectionParams.setConnectionTimeout(hParams, connectTimeoutEnv);
			HttpConnectionParams.setSoTimeout(hParams, soTimeoutEnv);
			responseStr = httpclient.execute(hp, responseHandler);
		} catch (ClientProtocolException e) {
			logger.error("httpclient调用出错", e);
		} catch (IOException e) {
			logger.error("httpclient调用出错", e);
		} catch (Exception e) {
			logger.error("httpclient调用出错", e);
		} finally {
			abortConnection(hp, httpclient);
		}
		return responseStr;
	}

	/**
	 * Post方式提交,为调用征信系统重写的方法
	 * 
	 * @param url
	 *            提交地址
	 * @param params
	 *            String
	 * @param charset
	 *            参数提交编码集
	 * @return 响应消息
	 */
	public static String post(String url, String params, String charset) throws Exception {
		if (url == null || url.equals("")) {
			return null;
		}
		// 创建HttpClient实例
		DefaultHttpClient httpclient = getDefaultHttpClient(charset);
		StringEntity formEntity = null;
		String responseStr = null;
		HttpPost hp = new HttpPost(url);
		try {
			formEntity = new StringEntity(params, "utf-8");
			hp.setEntity(formEntity);
			formEntity.setContentType("application/json");
			formEntity.setContentEncoding("utf-8");
			// 发送请求，得到响应
			HttpParams hParams = httpclient.getParams();
			// 设置连接超时参数
			int connectTimeoutEnv = 100000;
			int soTimeoutEnv = 200000;
			HttpConnectionParams.setConnectionTimeout(hParams, connectTimeoutEnv);
			HttpConnectionParams.setSoTimeout(hParams, soTimeoutEnv);
			responseStr = httpclient.execute(hp, responseHandler);
		} catch (ClientProtocolException e) {
			logger.error("httpclient调用出错", e);
		} catch (IOException e) {
			logger.error("httpclient调用出错", e);
		} catch (Exception e) {
			logger.error("httpclient调用出错", e);
		} finally {
			abortConnection(hp, httpclient);
		}
		return responseStr;
	}

	/**
	 * 获取DefaultHttpClient实例
	 * 
	 * @param charset
	 *            参数编码集, 可空
	 * @return DefaultHttpClient 对象
	 */
	private static DefaultHttpClient getDefaultHttpClient(final String charset) {
		DefaultHttpClient httpclient = new DefaultHttpClient();
		httpclient.getParams().setParameter(CoreProtocolPNames.PROTOCOL_VERSION, HttpVersion.HTTP_1_1);
		// 模拟浏览器，解决一些服务器程序只允许浏览器访问的问题
		httpclient.getParams().setParameter(CoreProtocolPNames.USER_AGENT,
				"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1)");
		httpclient.getParams().setParameter(CoreProtocolPNames.USE_EXPECT_CONTINUE, Boolean.FALSE);
		httpclient.getParams().setParameter(CoreProtocolPNames.HTTP_CONTENT_CHARSET,
				charset == null ? CHARSET_GBK : charset);
		httpclient.setHttpRequestRetryHandler(requestRetryHandler);
		return httpclient;
	}

	/**
	 * 释放HttpClient连接
	 * 
	 * @param hrb
	 *            请求对象
	 * @param httpclient
	 *            client对象
	 */
	private static void abortConnection(final HttpRequestBase hrb, final HttpClient httpclient) {
		if (hrb != null) {
			hrb.abort();
		}
		if (httpclient != null) {
			httpclient.getConnectionManager().shutdown();
		}
	}

	/**
	 * 从给定的路径中加载此 KeyStore
	 * 
	 * @param url
	 *            keystore URL路径
	 * @param password
	 *            keystore访问密钥
	 * @return keystore 对象
	 */
	private static KeyStore createKeyStore(final URL url, final String password)
			throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {
		if (url == null) {
			throw new IllegalArgumentException("Keystore url may not be null");
		}
		KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
		InputStream is = null;
		try {
			is = url.openStream();
			keystore.load(is, password != null ? password.toCharArray() : null);
		} finally {
			if (is != null) {
				is.close();
				is = null;
			}
		}
		return keystore;
	}

	/**
	 * 将传入的键/值对参数转换为NameValuePair参数集
	 * 
	 * @param paramsMap
	 *            参数集, 键/值对
	 * @return NameValuePair参数集
	 */
	private static List<NameValuePair> getParamsList(Map<String, String> paramsMap) {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		if (paramsMap == null || paramsMap.size() == 0) {
			return params;
		}
		for (Map.Entry<String, String> map : paramsMap.entrySet()) {
			params.add(new BasicNameValuePair(map.getKey(), map.getValue()));
		}
		return params;
	}

	public static void main(String[] args) {
		String url = "http://jiayuan.pingan.com/rest/gamelogs/randGameUser";
		Map<String, String> params = new HashMap<String, String>();
		params.put("num", " 2");
		String returnStr = get(url, params);
		System.out.println("returnStr:" + returnStr);
	}

}
