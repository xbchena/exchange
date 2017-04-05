package com.iss.finanframe.service.aop;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SMSToken {
//	@Value("${appid.token.sms.list}")
//	private String smsTokenList;
//
//	private static SMSToken thisObj;
//
//	private final Map<String, String> smsMap = new HashMap<String, String>();
//
//	@PostConstruct
//	public void init() {
//		String[] tokens = smsTokenList.split(",");
//		for (String token : tokens) {
//			String[] pair = token.split(":");
//			smsMap.put(pair[0], pair[1]);
//		}
//
//		thisObj = this;
//	}
//
//	public static boolean checkSmsToken(String appid, String token) {
//		String realToken = thisObj.smsMap.get(appid);
//		return token.equals(realToken);
//	}
}
