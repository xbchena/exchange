package com.iss.finanframe.nosql.redis;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 只能添加在类成员变量上。
 *
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Cacheable {
	
	/**
	 * cache的名字，用来区分
	 * @return
	 */
	String name() default "";
	
	/**
	 * 要塞进缓存里面的value的类型
	 * @return
	 */
	Class<?> clazz() ;
	
	/**
	 * 缓存时间(秒)
	 */
	int expired() default 7776000;
}
