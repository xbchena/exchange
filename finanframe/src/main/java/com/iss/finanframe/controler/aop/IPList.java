package com.iss.finanframe.controler.aop;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IPList {
//	@Value("${ip.white.list}")
//	private String whiteList;
//	
//	@Value("${ip.black.list}")
//	private String blackList;
//	
//	private static IPList thisObj;
//	
//	private final List<Pattern> whites = new ArrayList<Pattern>();
//	private final List<Pattern> blacks = new ArrayList<Pattern>();
//	
//	@PostConstruct
//	public void init(){
//		String[] whiteips = whiteList.split(",");
//		for(String ip : whiteips){
//			if(StringUtils.isNotBlank(ip)){
//				whites.add(Pattern.compile(ip));
//			}
//			
//		}
//		
//		String[] blackips = blackList.split(",");
//		for(String ip : blackips){
//			if(StringUtils.isNotBlank(ip)){
//				blacks.add(Pattern.compile(ip));
//			}
//		}
//		
//		thisObj = this;
//	}
//	
//	public static boolean isIpInWhiteList(String ip){
//		if(thisObj.whites.isEmpty()){
//			return true;
//		}
//		
//		for(Pattern p : thisObj.whites){
//			if(p.matcher(ip).find()){
//				return true;
//			}
//		}
//		
//		return false;
//	}
//	
//	public static boolean isIpInBlackList(String ip){
//		for(Pattern p : thisObj.blacks){
//			if(p.matcher(ip).find()){
//				return true;
//			}
//		}
//		return false;
//	}
}
