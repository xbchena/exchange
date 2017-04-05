/**
 * Project Name:finanframe
 * File Name:StringUtils.java
 * Package Name:com.wanda.finanframe.util
 * Date:2016年5月21日下午1:48:21
 * Copyright (c) 2016, wanda.cn All Rights Reserved.
 *
 */
package com.iss.finanframe.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;

import com.iss.finanframe.exception.FinanFrameException;

/**
 * @author jgh
 *
 */
public class StringUtilsExt {

	/**
	 * 
	 * @param str
	 *            - 要补充字符的字符串
	 * @param length
	 *            - 要补充到的总位数
	 * @param c
	 *            - 要补充的字符
	 * @return
	 */
	public static String addPreChars(String str, int length, char c) {
		if (str == null) {
			return str;
		} else if (str.length() >= length) {
			return str;
		} else {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < length - str.length(); i++) {
				sb.append(c);
			}
			sb.append(str);
			return sb.toString();
		}
	}

	/**
	 * 打亂字符串中字符的順序
	 * 
	 * @param str
	 * @return
	 */
	public static String randomCharsOrder(String str) {
		if (str == null || str.trim().length() == 0) {
			return str;
		}
		char[] chs = str.toCharArray();
		Random ran = new Random();
		for (int i = 0, k = chs.length * 2; i < k; i++) {
			int first = ran.nextInt(k) % chs.length;
			char t = chs[first];
			int second = ran.nextInt(k) % chs.length;
			chs[first] = chs[second];
			chs[second] = t;
		}
		return new String(chs);
	}

	public static String cutString(String str, int length) {
		if (StringUtils.isEmpty(str)) {
			return str;
		} else if (str.length() <= length) {
			return str;
		} else {
			return str.substring(0, length);
		}
	}

	public static String getRandomStringWithGavingChars(int length, String base) { // length表示生成字符串的长度
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}

	public static String getRandomString(int length) { // length表示生成字符串的长度
		String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}

	public static String convertStreamToString(InputStream is) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();
		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line + "/n");
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new FinanFrameException(e);
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
				throw new FinanFrameException(e);
			}
		}
		return sb.toString();
	}
}
