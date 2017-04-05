/**
 * Project Name:finanframe
 * File Name:CommonValidator.java
 * Package Name:com.wanda.finanframe.util.check
 * Date:2016年9月21日下午6:24:43
 * Copyright (c) 2016, wanda.cn All Rights Reserved.
 *
 */
package com.iss.finanframe.util.check;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.util.Strings;

/**
 * @author jgh
 *
 */
public class CommonValidator {

	static int[] DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };  
	
	
	public static boolean isValidDateyyyyMMdd(String yyyyMMdd) {  
	    try {  
	    	if (StringUtils.isEmpty(yyyyMMdd)||StringUtils.isEmpty(yyyyMMdd.trim())) {
	    		return false;
			}
	    	if(yyyyMMdd.length() != 8){//过滤掉  像 2016092  这种七位数据 
	    		return false;
	    	}
	        int year = Integer.parseInt(yyyyMMdd.substring(0, 4));  
	        if (year <= 0)  
	            return false;  
	        int month = Integer.parseInt(yyyyMMdd.substring(4, 6));  
	        if (month <= 0 || month > 12)  
	            return false;  
	        int day = Integer.parseInt(yyyyMMdd.substring(6));  
	        if (day <= 0 || day > DAYS[month])  
	            return false;  
	        if (month == 2 && day == 29 && !isGregorianLeapYear(year)) {  
	            return false;  
	        }  
	    } catch (Exception e) {  
	        e.printStackTrace();  
	        return false;  
	    }  
	    return true;  
	} 
	
	/** 
	 * @param date yyyy-MM-dd HH:mm:ss 
	 * @return 
	 */  
	public static boolean isValidDate(String yyyyMMdd) {  
	    try {  
	    	
	    	if(yyyyMMdd.length()!=8){
	    		return false;
	    	}
	        int year = Integer.parseInt(yyyyMMdd.substring(0, 4));  
	        if (year <= 0)  
	            return false;  
	        int month = Integer.parseInt(yyyyMMdd.substring(4, 6));  
	        if (month <= 0 || month > 12)  
	            return false;  
	        int day = Integer.parseInt(yyyyMMdd.substring(6, 8));  
	        if (day <= 0 || day > DAYS[month])  
	            return false;  
	        if (month == 2 && day == 29 && !isGregorianLeapYear(year)) {  
	            return false;  
	        }  
//	        int hour = Integer.parseInt(yyyyMMdd.substring(11, 13));  
//	        if (hour < 0 || hour > 23)  
//	            return false;  
//	        int minute = Integer.parseInt(yyyyMMdd.substring(14, 16));  
//	        if (minute < 0 || minute > 59)  
//	            return false;  
//	        int second = Integer.parseInt(yyyyMMdd.substring(17, 19));  
//	        if (second < 0 || second > 59)  
//	            return false;  
	    } catch (Exception e) {  
	        e.printStackTrace();  
	        return false;  
	    }  
	    return true;  
	}  
	
	public static final boolean isGregorianLeapYear(int year) {  
	    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);  
	}  
	
	/**
	 * 校验大陆手机号码
	 * 手机号码: 13[0-9], 14[5,7], 15[0, 1, 2, 3, 5, 6, 7, 8, 9], 17[6, 7, 8],18[0-9], 170[0-9] 
	 * 移动号段: 134,135,136,137,138,139,150,151,152,157,158,159,182,183,184,187,188,147,178,1705 
	 * 联通号段: 130,131,132,155,156,185,186,145,176,1709 电信号段:133,153,180,181,189,177,1700
	 * 
	 */
	public static boolean isMobile(String mobile) {
		if (Strings.isBlank(mobile)) {
			return false;
		}
		return Pattern.matches("^((13[0-9])|(14[5,7,9])|(15[^4,\\D])|(17[0,1,3,5-8])|(18[0-9]))\\d{8}$", mobile);
	}
	
	/**  
     * 粗略验证手机号码（支持国际格式，+86135xxxx...（中国内地），+00852137xxxx...（中国香港））  
     * @param mobile 移动、联通、电信运营商的号码段  
     *<p>移动的号段：134(0-8)、135、136、137、138、139、147（预计用于TD上网卡）  
     *、150、151、152、157（TD专用）、158、159、187（未启用）、188（TD专用）</p>  
     *<p>联通的号段：130、131、132、155、156（世界风专用）、185（未启用）、186（3g）</p>  
     *<p>电信的号段：133、153、180（未启用）、189</p>  
     * @return 验证成功返回true，验证失败返回false  
     */    
    public static boolean isMobile1(String mobile){  
        String regex = "(\\+\\d+)?1[3458]\\d{9}$";    
        return Pattern.matches(regex, mobile);  
    }  

    /** 
     * 区号+座机号码+分机号码 
     * @param fixedPhone 
     * @return 
     */  
    public static boolean isFixedPhone(String fixedPhone){  
        String reg="(?:(\\(\\+?86\\))(0[0-9]{2,3}\\-?)?([2-9][0-9]{6,7})+(\\-[0-9]{1,4})?)|" +  
                "(?:(86-?)?(0[0-9]{2,3}\\-?)?([2-9][0-9]{6,7})+(\\-[0-9]{1,4})?)";  
        return Pattern.matches(reg, fixedPhone);  
    }  
    
    /**
     * 邮箱校验
     * @param email
     * @return
     */
	public static boolean isEmail(String email) {
		String str = "^([a-zA-Z0-9]*[-_.]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2,})?$";
		Pattern p = Pattern.compile(str);
		Matcher m = p.matcher(email);
		return m.matches();
	}

//	public static void main(String[] args) {
//		System.out.println(CommonValidator.isValidDateyyyyMMdd("20161302"));;
//	}
	
}
