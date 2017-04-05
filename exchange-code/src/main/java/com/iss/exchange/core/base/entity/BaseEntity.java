/**
 * Project Name:upp-core
 * File Name:BaseEntity.java
 * Package Name:com.wanda.upp.core.common.entity
 * Date:2016年6月30日下午2:26:14
 * Copyright (c) 2016, wanda.cn All Rights Reserved.
 *
 */
package com.iss.exchange.core.base.entity;

import java.util.Date;

import lombok.Data;

@Data
public abstract class BaseEntity {

	private String creator;	//
	private String modifier;	//
	private Date createTime;	//
	private Date lastModifiTime;	//
	
	
}