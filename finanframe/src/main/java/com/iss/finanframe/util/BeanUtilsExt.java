/**
 * Project Name:finanframe
 * File Name:BeanUtilsExt.java
 * Package Name:com.wanda.finanframe.util
 * Date:2016年8月29日下午3:45:49
 * Copyright (c) 2016, wanda.cn All Rights Reserved.
 *
 */
package com.iss.finanframe.util;

import org.springframework.cglib.beans.BeanCopier;

/**
 * @author jgh
 *
 */
public class BeanUtilsExt {
	
    public static void copy(Object source, Object target) {
        BeanCopier copier = BeanCopier.create(source.getClass(), target.getClass(), false);
        copier.copy(source, target, null);
    }
}
