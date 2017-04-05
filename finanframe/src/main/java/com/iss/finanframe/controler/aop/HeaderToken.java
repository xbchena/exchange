package com.iss.finanframe.controler.aop;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HeaderToken {
//	@Value("${appid.token.header.list}")
//	private String headerTokenList;
//
//	private static HeaderToken thisObj;
//
//	private final Map<String, String> headerMap = new HashMap<String, String>();
//
//	@PostConstruct
//	public void init() {
//		String[] tokens = headerTokenList.split(",");
//		for (String token : tokens) {
//			String[] pair = token.split(":");
//			headerMap.put(pair[0], pair[1]);
//		}
//
//		thisObj = this;
//	}
//
//	public static boolean checkHeaderToken(String appid, String token) {
//		String realToken = thisObj.headerMap.get(appid);
//		return token.equals(realToken);
//	}
}
