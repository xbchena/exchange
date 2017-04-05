//package com.wanda.osp.finanframe.nosql.redis.util;
//
//import java.util.List;
//
//import com.wanda.finanframe.nosql.redis.RedisCache;
//import com.wanda.uap.entity.cache.BaseCacheKey;
//
//public class Redis {
//
//	public static RedisCache cache;
//
//	/**
//	 * 用clazz类反序列化结果，
//	 * @param key   键值
//	 * @param clazz  序列化类对象
//	 * @return
//	 */
//	public static <T> T get(final BaseCacheKey key, final Class<T> clazz) {
//		return cache.get(key, clazz);
//	}
//
//	/**
//	 * put一个新的缓存，
//	 * @param key  键值
//	 * @param obj  缓存对象
//	 * @param second  超时时间（秒）
//	 * @return
//	 */
//	public static <T> boolean put(final BaseCacheKey key, final T obj, int second) {
//		return cache.put(key, obj, second);
//	}
//
//	/**
//	 * put一个新的缓存，
//	 * @param key  键值
//	 * @param obj  缓存对象
//	 * @return
//	 */
//	public static <T> boolean put(final BaseCacheKey key, final T obj) {
//		return cache.put(key, obj);
//	}
//
//	/**
//	 * put一个新的缓存，当这个键值没有内容得时候。
//	 * @param key   键值
//	 * @param obj   缓存对象
//	 * @param second   超时时间（秒）
//	 * @return
//	 */
//	public static <T> boolean putIfNotExist(final BaseCacheKey key, final T obj, int second) {
//		return cache.putIfNotExist(key, obj, second);
//	}
//
//	/**
//	 * put一个新的缓存，当这个键值没有内容得时候。
//	 * @param key   键值
//	 * @param obj   缓存对象
//	 * @return
//	 */
//	public static <T> boolean putIfNotExist(final BaseCacheKey key, final T obj) {
//		return cache.putIfNotExist(key, obj);
//	}
//
//	/**
//	 * put一个缓存，延续之前的过期时间
//	 * @param key   键值
//	 * @param obj   缓存对象
//	 * @return
//	 */
//	public static <T> boolean putContinue(final BaseCacheKey key, final T obj) {
//		return cache.putContinue(key, obj);
//	}
//
//	/**
//	 * 移除一个缓存
//	 * @param key   键值
//	 * @return
//	 */
//	public static <T> boolean remove(final BaseCacheKey key) {
//		return cache.remove(key);
//	}
//
//	/**
//	 * 添加一个list，并把obj丢在队列的头部（左边）
//	 * @param key  键值
//	 * @param obj  缓存对象
//	 * @return 返回添加后，列表中有多少条数据
//	 */
//	public static <T> long leftPutList(final BaseCacheKey key, final T obj){
//		return cache.leftPut(key, obj);
//	}
//
//	/**
//	 * 移除并返回列表中的的头（左边）
//	 * @param key  键值
//	 * @param obj  缓存对象
//	 * @return
//	 */
//	public static <T> T leftPopList(final BaseCacheKey key, final Class<T> clazz){
//		return cache.leftPop(key, clazz);
//	}
//	/**
//	 * 添加一个list，并把obj丢在队列的尾部（右边）
//	 * @param key  键值
//	 * @param obj  缓存对象
//	 * @return 返回添加后，列表中有多少条数据
//	 */
//	public static <T> long rightPutList(final BaseCacheKey key, final T obj){
//		return cache.rightPut(key, obj);
//	}
//
//	/**
//	 * 移除并返回列表中的的尾（右边）
//	 * @param key  键值
//	 * @param obj  缓存对象
//	 * @return
//	 */
//	public static <T> T rightPopList(final BaseCacheKey key, final Class<T> clazz){
//		return cache.rightPop(key, clazz);
//	}
//
//	/**
//	 * 返回列表长度
//	 * @param key  键值
//	 * @param obj  缓存对象
//	 * @return
//	 */
//	public static long getListCount(final BaseCacheKey key){
//		return cache.getListCount(key);
//	}
//
//	/**
//	 * 从redis哈希表中取一个
//	 * @param key  键
//	 * @param field 域
//	 * @param clazz 反序列化的类
//	 * @return 缓存的对象
//	 */
//	public static <T> T hashGet(final String key, final String field, final Class<T> clazz){
//		return cache.hashGet(key, field, clazz);
//	}
//
//	/**
//	 * 向redis的哈希表插入一条数据，
//	 * @param key  键
//	 * @param field 域
//	 * @param obj 缓存数据
//	 * @return 是否set成功
//	 */
//	public static <T> boolean hashPut(final String key, final String field, final T obj){
//		return cache.hashPut(key, field, obj);
//	}
//
//	/**
//	 * 获取key下面的所有filed，一定是hash
//	 * @param key
//	 * @return
//	 */
//	public static List<String> hashKeys(final String key){
//		return cache.hashKeys(key);
//	}
//	/**
//	 * 自增incr
//	 * @param key  键值
//	 * @return
//	 */
//	public static long incr(final BaseCacheKey key, long count){
//		return cache.incr(key, count);
//	}
//
//	/**
//	 * 返回key的超时时间
//	 * @param key  键值
//	 * @return
//	 */
//	public static long ttl(final BaseCacheKey key){
//		return cache.ttl(key);
//	}
//}
