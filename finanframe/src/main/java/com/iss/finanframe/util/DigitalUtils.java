/**
 * Project Name:finanframe
 * File Name:DigitalUtils.java
 * Package Name:com.wanda.finanframe.util
 * Date:2016年7月28日下午2:45:44
 * Copyright (c) 2016, wanda.cn All Rights Reserved.
 *
 */
package com.iss.finanframe.util;

import java.util.regex.Pattern;

/**
 * @author jgh
 *
 */
public class DigitalUtils {

	
	  public static final String pattern1 = "^\\d+$";				//非负整数（正整数   +   0）     
	  public static final String pattern2 = "^[0-9]*[1-9][0-9]*$";  //正整数     
	  public static final String pattern3 = "^((-\\d+)|(0+))$"; 	//非正整数（负整数   +   0）     
	  public static final String pattern4 = "^-[0-9]*[1-9][0-9]*$";	//负整数     
	  public static final String pattern5 = "^-?\\d+$";				//整数     
	  public static final String pattern6 = "^\\d+(\\.\\d+)?$";		//非负浮点数（正浮点数   +   0）     
	  public static final String pattern7 = "^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))$";		//正浮点数    
	  public static final String pattern8 = "^((-\\d+(\\.\\d+)?)|(0+(\\.0+)?))$";		//非正浮点数（负浮点数   +   0）     
	  public static final String pattern9 = "^(-(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*)))$";		//负浮点数    
	  public static final String pattern10 = "^(-?\\d+)(\\.\\d+)?$";		//浮点数
	
	
	/**
	 * 
	 * @param str - 校验的字符串
	 * @param totalBitMin - 字符串校验最少位数
	 * @param totalBitMax - 字符串校验最多位数
	 * @return
	 */
	public static boolean isInteger(String str,String ptn) {
		if(str == null){
			return false;
		}
		Pattern pattern = Pattern.compile(ptn);
		return pattern.matcher(str).matches();
	}
	
	/**
	 * 检查是否是整数，正负都可以
	 * @param str - 校验的字符串
	 * @return
	 */
	public static boolean isInteger(String str) {
		return isInteger(str,"^[\\-\\+]?[\\d]+$");
	}
	/**
	 * 判断是否是正整数
	 * @param str
	 * @return
	 */
	public static boolean isUnsignedInteger(String str) {
		if(str == null){
			return false;
		}
		Pattern pattern = Pattern.compile("^[\\d]+$");
		return pattern.matcher(str).matches();
	}
	/**
	 * 判断是否是正整数
	 * @param str
	 * @return
	 */
	public static boolean isPositiveInteger(String str) {
		if(str == null){
			return false;
		}
		Pattern pattern = Pattern.compile("^[\\+]?[\\d]+$");
		return pattern.matcher(str).matches();
	}
	/*
	 * 判断是否为浮点数，包括double和float
	 * @param str 传入的字符串
	 * @return 是浮点数返回true,否则返回false
	 */
	public static boolean isDouble(String str) {
		if(str == null){
			return false;
		}
		String regex = "^[\\-\\+]?[\\d]+(.[\\d]+)?$";
		if (str.matches(regex)) {
			return true;
		} else {
			return false;
		}
	}
	/*
	 * 判断是否为正浮点数，包括double和float
	 * @param str 传入的字符串
	 * @return 是浮点数返回true,否则返回false
	 */
	public static boolean isPositiveDouble(String str) {
		if(str == null){
			return false;
		}
		String regex = "^[\\+]?[\\d]+(.[\\d]+)?$";
		if (str.matches(regex)) {
			return true;
		} else {
			return false;
		}
	}	
	
	public static void main(String[] args) {
		System.out.println(isUnsignedInteger("123"));
	}
	
}
