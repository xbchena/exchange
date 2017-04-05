/**
 * Project Name:finanframe
 * File Name:InfoDesensUtil.java
 * Package Name:com.wanda.finanframe.util
 * Date:2016年8月30日下午4:27:20
 * Copyright (c) 2016, wanda.cn All Rights Reserved.
 *
 */
package com.iss.finanframe.util;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfoDesensUtil {

	public static Logger logger = LoggerFactory.getLogger(InfoDesensUtil.class);

	private final static String COMMA = ",";
	private final static String COLON = ":";
	private final static String BRACES_LEFT = "{";
	private final static String BRACES_RIGHT = "}";
	private final static String SQUARE_BRACKETS_LEFT = "[";
	private final static String SQUARE_BRACKETS_RIGHT = "]";
	private final static String KEY_FORMAT_STRING = "\"%s\"";

	private static ThreadLocal<SimpleDateFormat> df = new ThreadLocal<SimpleDateFormat>() {
		protected synchronized SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}
	};
	private final static String EMAIL_REG = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
	private final static String MOBILE_REG = "^(1[3,4,5,7,8]\\d)(\\d{4})(\\d{4})$";
	private final static String IDCARD_REG = "^(\\d{6})(\\d{5}|\\d{8})(\\d{3}[0-9,x,X])$";
	private final static String BANKACCT_REG = "^(\\d{6})(\\d{6}|\\d{9})(\\d{4})$";
	private final static String MD5_PASSOWRD_REG = "^([a-zA-Z0-9]{32})$";
	private final static String RSA_PASSOWRD_REG = "^([a-zA-Z0-9]{64,})$";
	//hprivate final static String CHINESE_REG = "^([\u4E00-\u9FA5]{1,})$";

	private final static Pattern MOBILE_PATTERN = Pattern.compile(MOBILE_REG);
	private final static Pattern IDCARD_PATTERN = Pattern.compile(IDCARD_REG);
	private final static Pattern BANKACCT_PATTERN = Pattern.compile(BANKACCT_REG);
	private static final String STARS = "*****";

	public final static char STAR = '*';
	
	
	public static String hideCardNo(String cardNo) {
		return hideStrs(cardNo,STAR,4,4);
	}
	
	/**
	 * 将字符串str从开始到firstPos处的字符替换为replaceChar；并且将字符串str从reversefirstPos到末尾处的字符替换为replaceChar
	 * @param str
	 * @param replaceChar
	 * @param startPos
	 * @param endPos
	 * @return
	 */
	public static String hideStrs(String str, char replaceChar, int firstPos, int reversefirstPos) {
		try {
			if(str != null && str.length() > (firstPos + reversefirstPos + 2)){
				StringBuilder sb = new StringBuilder();
				sb.append(str.substring(0,firstPos));
				for (int i = 0; i < str.length() - reversefirstPos - firstPos; i++) {
					sb.append(replaceChar);
				}
				sb.append(str.substring(str.length() - reversefirstPos));
				return sb.toString();
			}else{
				return str;
			}
		} catch (RuntimeException e) {
			logger.warn(e.toString());
			return str;
		}
	}
	
	public static String hideEmail(String email) {
		StringBuilder sb = new StringBuilder(email);
		//邮箱账号名只显示前两位
		int at_position = sb.indexOf("@");
		if (at_position > 2) {
			sb.replace(2, at_position, StringUtils.repeat("*", at_position - 2));
		}
		//邮箱域名隐藏
		int period_position = sb.lastIndexOf(".");
		sb.replace(at_position + 1, period_position, StringUtils.repeat("*", period_position - at_position - 1));
		return sb.toString();
	}
	
	public static String formObject(final Object object) {
		final StringBuilder sb = new StringBuilder();
		try {
			if (object == null) {
				return null;
			}
			if (isArray(object)) {
				sb.append(_formArray(object));
			} else if (isMap(object)) {
				sb.append(_formMap(object));
			} else if (isCollection(object)) {
				sb.append(_formCollection(object));
			} else if (isNumber(object)) {
				sb.append(_formNumber(object));
			} else if (isBoolean(object)) {
				sb.append(_formBoolean(object));
			} else if (isString(object)) {
				sb.append(_formString(object));
			} else if (isDate(object)) {
				sb.append(_formDate(object));
			} else {
				sb.append(_formObject(object));
			}
		} catch (Exception e) {
			logger.warn("An error ocur when covert object to String!");
			return "An error ocur when covert object to String!";
		}
		return sb.toString();
	}

	private static Object _formDate(Object object) {
		return String.format(KEY_FORMAT_STRING, df.get().format(object));
	}

	private static Object _formBoolean(Object object) {
		return String.valueOf(object);
	}

	private static Object _formString(Object object) {
		return String.format(KEY_FORMAT_STRING, encryptSensiveInfo(String.valueOf(object)));
	}

	private static Object _formNumber(final Object object) {
		return encryptSensiveInfo(String.valueOf(object));
	}

	private static String _formArray(final Object object) {
		final StringBuilder sb = new StringBuilder(SQUARE_BRACKETS_LEFT);
		for (int i = 0; i < Array.getLength(object); i++) {
			sb.append(formObject(Array.get(object, i))).append(COMMA);
		}
		if (sb.indexOf(COMMA) > 0) {
			sb.deleteCharAt(sb.lastIndexOf(COMMA));
		}
		sb.append(SQUARE_BRACKETS_RIGHT);
		return sb.toString();
	}

	private static String _formObject(final Object object) {
		final StringBuilder sb = new StringBuilder(BRACES_LEFT);
		final Method[] methods = object.getClass().getMethods();
		for (Method method : methods) {
			String methodName = method.getName();
			if (methodName.startsWith("get") && !methodName.endsWith("Class")) {
				try {
					if (methodName.equalsIgnoreCase("getpwid") || methodName.equalsIgnoreCase("getreqId")) {
						sb.append(String.format(KEY_FORMAT_STRING, unCapitalise(methodName.substring(3)))).append(COLON)
								.append(method.invoke(object, new Object[] {})).append(COMMA);
					} else {
						sb.append(String.format(KEY_FORMAT_STRING, unCapitalise(methodName.substring(3)))).append(COLON)
								.append(formObject(method.invoke(object, new Object[] {}))).append(COMMA);
					}

				} catch (Exception e) {
					logger.warn("An error ocur when _formObject!" + e.toString());
				}
			}
		}
		if (sb.indexOf(COMMA) > 0) {
			sb.deleteCharAt(sb.lastIndexOf(COMMA));
		}
		sb.append(BRACES_RIGHT);
		return sb.toString();
	}

	@SuppressWarnings("rawtypes")
	private static String _formMap(final Object object) {
		final StringBuilder sb = new StringBuilder(BRACES_LEFT);
		final Map map = (Map) object;
		final Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			final Object key = it.next();
			sb.append(String.format(KEY_FORMAT_STRING, String.valueOf(key))).append(COLON)
					.append(formObject(map.get(key))).append(COMMA);
		}
		if (sb.indexOf(COMMA) > 0) {
			sb.deleteCharAt(sb.lastIndexOf(COMMA));
		}
		sb.append(BRACES_RIGHT);
		return sb.toString();
	}

	@SuppressWarnings("rawtypes")
	private static String _formCollection(final Object object) {
		final StringBuilder sb = new StringBuilder(SQUARE_BRACKETS_LEFT);
		final Collection c = (Collection) object;
		final Iterator it = c.iterator();
		while (it.hasNext()) {
			sb.append(formObject(it.next())).append(COMMA);
		}
		if (sb.indexOf(COMMA) > 0) {
			sb.deleteCharAt(sb.lastIndexOf(COMMA));
		}
		sb.append(SQUARE_BRACKETS_RIGHT);
		return sb.toString();
	}

	/**
	 * @param object
	 * @return 
	 * 判断对象是否为数字
	 */
	@SuppressWarnings("rawtypes")
	private static boolean isNumber(final Object object) {
		if (object == null) {
			return false;
		}
		final Class clazz = object.getClass();
		if (clazz == Byte.TYPE || clazz == Short.TYPE || clazz == Integer.TYPE || clazz == Long.TYPE
				|| clazz == Float.TYPE || clazz == Double.TYPE) {
			return true;
		}
		//Integer、Long、Byte、Double、Float、Short均是Number的子类
		return object instanceof Number;
	}

	/**
	 * @param object
	 * @return
	 * 对象是否为boolean类型
	 */
	private static boolean isBoolean(final Object object) {
		if (object == null) {
			return false;
		}
		return object instanceof Boolean || object.getClass() == Boolean.TYPE;
	}

	/**
	 * @param object
	 * @return
	 * 对象是否为String类型。String或者Char类型均认为是String类型
	 */
	@SuppressWarnings("rawtypes")
	private static boolean isString(final Object object) {
		if (object == null) {
			return false;
		}
		final Class clazz = object.getClass();
		return String.class.isAssignableFrom(clazz) || Character.TYPE.isAssignableFrom(clazz)
				|| Character.class.isAssignableFrom(clazz);
	}

	/**
	 * @param object
	 * @return
	 * 判断对象是否为数组
	 */
	private static boolean isArray(final Object object) {
		if (object == null) {
			return false;
		}
		return object.getClass().isArray();
	}

	/**
	 * @param object
	 * @return
	 * 判断对象是否为集合
	 */
	private static boolean isCollection(final Object object) {
		if (object == null) {
			return false;
		}
		return object instanceof Collection;
	}

	/**
	 * @param object
	 * @return
	 * 判断对象是否为时间类型
	 */
	private static boolean isDate(Object object) {
		if (object == null) {
			return false;
		}
		return object instanceof Date;
	}

	/**
	 * @param object
	 * @return
	 * 判断对象是否为Map类型
	 */
	private static boolean isMap(final Object object) {
		if (object == null) {
			return false;
		}
		return object instanceof Map;
	}

	/**
	 * @param str
	 * @return
	 *	首字母小写
	 */
	private static String unCapitalise(String str) {
		if (str != null && str.length() >= 0) {
			char capital = str.charAt(0);
			String temp = String.valueOf(capital);
			if (capital >= 'A' && capital <= 'Z') {
				return str.replaceFirst(temp, temp.toLowerCase());
			}
		}
		return str;
	}

	/**
	 * @param str
	 * @return
	 * 对邮箱、手机号、身份证、银行卡等信息进行机密显示
	 */
	public static String encryptSensiveInfo(String str) {
		try {
			if (str == null) {
				return str;
			}
			if (str.matches(EMAIL_REG)) {
				return hideEmail(str);
			} else if (str.matches(MOBILE_REG)) {
				return hideGroup(MOBILE_PATTERN, str, STAR, 2);
			} else if (str.matches(IDCARD_REG)) {
				return hideGroup(IDCARD_PATTERN, str, STAR, 2);
			} else if (str.matches(BANKACCT_REG)) {
				return hideGroup(BANKACCT_PATTERN, str, STAR, 2);
			} else if (str.matches(MD5_PASSOWRD_REG)) {
				return STARS;
			} else if (str.matches(RSA_PASSOWRD_REG)) {
				return STARS;
			} /*else {
				return encryptCommonStr(str);
				}*/
			return str;
		} catch (Exception e) {
			logger.warn("An error ocur when covert object to String!");
			return "An error ocur when covert object to String!";
		}
	}

	
//	public static void main(String[] args) {
//		System.out.println(hideStrs("6222198612457894",STAR,"6222198612457894222".length() - 4 - 8,4));
//	}
	
	/**
	 * @param regex
	 * @param str
	 * @return
	 * 利用正则表达式，隐藏中间字符。
	 */
	private static String hideGroup(Pattern pattern, String str, char replaceChar, int... position) {
		try {
			StringBuilder sb = new StringBuilder();
			Matcher matcher = pattern.matcher(str);
			if (matcher.matches()) {
				for (int i = 1; i <= matcher.groupCount(); i++) {
					if (contains(position, i)) {
						char[] temp = new char[matcher.group(i).length()];
						Arrays.fill(temp, replaceChar);
						sb.append(temp);
					} else {
						sb.append(matcher.group(i));
					}
				}
			} else {
				sb.append(str);
			}
			return sb.toString();
		} catch (RuntimeException e) {
			logger.warn(e.toString());
			return str;
		}
	}

	private static boolean contains(int[] ary, int element) {
		if (ary == null || ary.length == 0) {
			return false;
		}
		for (int i = 0; i < ary.length; i++) {
			if (element == ary[i]) {
				return true;
			}
		}
		return false;
	}

	private static String encryptCommonStr(String str) {
		if (null == str)
			return str;
		int strLength = str.length();
		if (strLength == 1) {
			return STARS;
		} else if (strLength == 2) {
			return str.substring(0, 1) + STARS;
		} else {
			return str.substring(0, 1) + STARS + str.substring(strLength - 1, strLength);
		}
	}
}
