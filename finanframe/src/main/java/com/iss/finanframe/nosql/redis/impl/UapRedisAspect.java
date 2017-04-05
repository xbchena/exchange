//package com.wanda.osp.finanframe.nosql.redis.impl;
//
//import java.lang.reflect.Method;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import com.google.gson.Gson;
//import com.wanda.finanframe.nosql.redis.Cacheable;
//import com.wanda.finanframe.nosql.redis.util.Redis;
//import com.wanda.uap.entity.cache.BaseCacheKey;
//
//@Aspect
//@Component
//class UapRedisAspect {
//
//	private static final Logger logger = LoggerFactory.getLogger(UapRedisAspect.class);
//
//	private static final Gson gson = new Gson();
//
//	@Pointcut("@annotation(com.wanda.finanframe.nosql.redis.Cacheable)")
//	public void _Cacheable() {}
//
//	@Around("_Cacheable()")
//	public Object __Cacheable_Around(ProceedingJoinPoint pjp) throws Throwable {
//		String className = pjp.getTarget().getClass().getSimpleName();
//		String methodName = pjp.getSignature().getName();
//
//		Method method = ((MethodSignature) pjp.getSignature()).getMethod();
//
//		Cacheable cacheable = method.getAnnotation(Cacheable.class);
//		Key key = new Key(className, methodName + cacheable.name(), gson.toJson(pjp.getArgs()));
//		try{
//
//			Object result = Redis.get(key, cacheable.clazz());
//			if(result != null){
//				return result;
//			}
//		}catch(Exception e){
//			logger.warn("Annotation Redis cache get error : %s", e.getMessage());
//		}
//
//		Object result = pjp.proceed();
//
//		try{
//			Redis.put(key, result, cacheable.expired());
//		}catch(Exception e){
//			logger.warn("Annotation Redis cache put error : %s", e.getMessage());
//		}
//
//		return result;
//	}
//
//	static class Key extends BaseCacheKey{
//
//		String className;
//		String methodName;
//		String param;
//
//		public Key(String className, String methodName, String param){
//			this.className = className;
//			this.methodName = methodName;
//			this.param = param;
//		}
//
//		@Override
//		public String getKey() {
//			return className + methodName + param.hashCode();
//		}
//	}
//}
