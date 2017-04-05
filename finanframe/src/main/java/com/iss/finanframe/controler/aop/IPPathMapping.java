package com.iss.finanframe.controler.aop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IPPathMapping {
//	@Value("${ip.path.mapping}")
//	private String mappingList;
//
//	@Value("${app.path.mapping}")
//	private String appid_pathList;
//
//	private static IPPathMapping thisObj;
//
//	private final List<Pattern[]> ipPathMapping = new ArrayList<Pattern[]>();
//	private final Map<String, Pattern> appidPathMapping = new HashMap<String, Pattern>();
//
//	@PostConstruct
//	public void init() {
//		String[] amaps = mappingList.split(",");
//		for (String amap : amaps) {
//			if(StringUtils.isNotBlank(amap)){
//				String temp[] = amap.split(":");
//				ipPathMapping.add(new Pattern[] { Pattern.compile(temp[0]), Pattern.compile(temp[1]) });
//			}
//			
//		}
//
//		String[] appidpaths = appid_pathList.split(",");
//		for (String amap : appidpaths) {
//			if(StringUtils.isNotBlank(amap)){
//				String temp[] = amap.split(":");
//				appidPathMapping.put(temp[0], Pattern.compile(temp[1]));
//			}
//		}
//
//		thisObj = this;
//	}
//
//	public static boolean ip_pathMatch(String ip, String path) {
//		if (thisObj.ipPathMapping.isEmpty()) {
//			return true;
//		}
//
//		for (Pattern[] ps : thisObj.ipPathMapping) {
//			if (ps[0].matcher(ip).find()) {
//				if (ps[1].matcher(path).find()) {
//					return true;
//				} else {
//					return false;
//				}
//			}
//		}
//		return false;
//	}
//
//	public static boolean appid_pathMatch(String appid, String path) {
//		if (thisObj.appidPathMapping.isEmpty()) {
//			return true;
//		}
//		Pattern pattern = thisObj.appidPathMapping.get(appid);
//		if (null == pattern)
//			return false;
//		return pattern.matcher(path).find();
//	}
}
