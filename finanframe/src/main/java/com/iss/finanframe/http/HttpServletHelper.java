package com.iss.finanframe.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.iss.finanframe.mvc.dto.AbstractResponse;

public class HttpServletHelper {
	static Logger logger = LogManager.getLogger(HttpServletHelper.class);

	/**
	 * 向Cookie中存放值
	 * 
	 * @param response
	 * @param cookeName
	 * @param cookieValue
	 * @param isHttpOnly
	 * @param isSecure
	 */
	public static void setCookie(HttpServletResponse response, String cookeName, String cookieValue, boolean isHttpOnly,
			boolean isSecure) {
		StringBuffer sb = new StringBuffer();
		sb = sb.append(cookeName).append("=").append(cookieValue).append(";path=/;");
		if (isHttpOnly) {
			sb = sb.append("HttpOnly;");
		}
		if (isSecure) {
			sb = sb.append("secure");
		}
		response.addHeader("Set-Cookie", sb.toString());
	}

	/**
	 * 返回网关请求结果 @param AbstractResponse 网关HttpServletResponse @throws
	 */
	public static void handleData(AbstractResponse responseBody, HttpServletResponse httpResponse) {
		String responseData = JSON.toJSONString(responseBody, SerializerFeature.DisableCircularReferenceDetect);
		outData(httpResponse, responseData);
	}
	
	public static void handleData(Object responseBody, HttpServletResponse httpResponse) {
		String responseData = JSON.toJSONString(responseBody, SerializerFeature.DisableCircularReferenceDetect);
		outData(httpResponse, responseData);
	}

	public static void outData(HttpServletResponse httpServletResponse, String jsonString) {
		try {
			httpServletResponse.setCharacterEncoding("utf-8");
			httpServletResponse.setHeader("Content-type", "application/json;charset=utf-8");
			PrintWriter writer = httpServletResponse.getWriter();
			writer.print(jsonString);
			httpServletResponse.flushBuffer();
			// 无需flush和close，Tomcat会帮我处理
		} catch (IOException e) {
			logger.error("返回数据结果IO异常", e);
		}
	}

	public static String getCookieByName(HttpServletRequest httpServletRequest,String cookieName) {
		String sessionId="";
		try {// 从Cookie中获取sessionId
			Cookie[] cookies = httpServletRequest.getCookies();
			if (cookies != null && cookies.length > 0) {
				for (Cookie cookie : cookies) {
					String name = cookie.getName();
					if (cookieName.equals(name)) {
						sessionId = cookie.getValue();
						logger.info("从Cookie获取"+cookieName+":" + sessionId);
					}
				}
			}

		} catch (Exception e) {
			sessionId = "";
			logger.error("查询Cookie失败" + e.getMessage(), e);
		}
		return sessionId;
	}

}
