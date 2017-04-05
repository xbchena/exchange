package com.iss.finanframe.http.security;


/**
 * 从 request中做xss过滤
 * 
 */
public class XssRequestWrapper { 
   

    public static String cleanXSS(String value) {
    	if(value == null )return "";
        //You'll need to remove the spaces from the html entities below
        value = value.replaceAll("<", "& lt;").replaceAll(">", "& gt;");
        value = value.replaceAll("\\(", "& #40;").replaceAll("\\)", "& #41;");
        value = value.replaceAll("'", "& #39;");
        value = value.replaceAll("eval\\((.*)\\)", "");
        value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
        value = value.replaceAll("script", "");
        value = value.toLowerCase();//统一转为小写
        String badStr = "'|exec|truncate|" +
                "sitename|net user|xp_cmdshell|;|-|--|+|,|//|/|%|#";//过滤掉的sql关键字，可以手动添加
        String[] badStrs = badStr.split("\\|");
        for (int i = 0; i < badStrs.length; i++) {
            if (badStr.indexOf(badStrs[i]) >= 0) {
                return value.replaceAll(badStrs[i], "");
            }
        }
        return value;
    }
}