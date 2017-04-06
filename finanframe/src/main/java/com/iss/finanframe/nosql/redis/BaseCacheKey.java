package com.iss.finanframe.nosql.redis;

import java.io.Serializable;

public class BaseCacheKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5870903864825623321L;

	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
}
