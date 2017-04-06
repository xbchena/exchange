package com.iss.finanframe.nosql.redis;

import java.util.List;

public interface RedisCache {

	public static final String OK = "OK";
	//追加2小时
	public static final int _expire_seconds_base_append = 7200;
	//追加2小时内随机
	public static final int _expire_seconds_random_append = 7200;

	public <T> T get(final BaseCacheKey key, final Class<T> clazz);

	public <T> boolean put(final BaseCacheKey key, final T obj, int second);

	public <T> boolean put(final BaseCacheKey key, final T obj);

	public <T> boolean putIfNotExist(final BaseCacheKey key, final T obj, int second);

	public <T> boolean putIfNotExist(final BaseCacheKey key, final T obj);

	public <T> boolean putContinue(final BaseCacheKey key, final T obj);

	public <T> boolean remove(final BaseCacheKey key);

	public <T> long leftPut(final BaseCacheKey key, final T obj);

	public <T> T leftPop(final BaseCacheKey key, final Class<T> clazz);

	public <T> long rightPut(final BaseCacheKey key, final T obj);

	public <T> T rightPop(final BaseCacheKey key, final Class<T> clazz);

	public <T> T hashGet(final String key, final String field, final Class<T> clazz);

	public <T> boolean hashPut(final String key, final String field, final T obj);

	public long getListCount(BaseCacheKey key);

	public long incr(BaseCacheKey key, long count);

	public long ttl(BaseCacheKey key);

	public List<String> hashKeys(String key);
}
