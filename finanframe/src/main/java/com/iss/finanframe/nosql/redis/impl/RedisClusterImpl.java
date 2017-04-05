//package com.wanda.osp.finanframe.nosql.redis.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//import javax.annotation.PostConstruct;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import com.alibaba.dubbo.common.utils.CollectionUtils;
//import com.google.gson.Gson;
//import com.wanda.finanframe.nosql.redis.RedisCache;
//import com.wanda.finanframe.nosql.redis.util.Redis;
//import com.wanda.uap.entity.cache.BaseCacheKey;
//
//import redis.clients.jedis.JedisPoolConfig;
//import redis.clients.jedis.JedisShardInfo;
//import redis.clients.jedis.ShardedJedis;
//import redis.clients.jedis.ShardedJedisPool;
//import redis.clients.util.Hashing;
//import redis.clients.util.Sharded;
//
//@Component("cluster")
//final class RedisClusterImpl implements RedisCache {
//
//	private static Gson gson = new Gson();
//
//	public <T> T get(BaseCacheKey key, Class<T> clazz) {
//		ShardedJedis jds = pool.getResource();
//		try {
//			return gson.fromJson(jds.get(encodeKey(key.getKey(), callerName)), clazz);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		} finally {
//			jds.close();
//		}
//
//	}
//
//	public <T> boolean put(final BaseCacheKey key, final T obj) {
//		return put(key, obj, 24 * 3600);
//	}
//
//	public <T> boolean put(BaseCacheKey key, T obj, int second) {
//		ShardedJedis jds = pool.getResource();
//		try {
//			String res = jds.setex(encodeKey(key.getKey(), callerName), second, gson.toJson(obj));
//			return OK.equals(res);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		} finally {
//			jds.close();
//		}
//	}
//
//	public <T> boolean putIfNotExist(final BaseCacheKey key, final T obj) {
//		return putIfNotExist(key, obj, 24 * 3600);
//	}
//
//	public <T> boolean putIfNotExist(BaseCacheKey key, T obj, int second) {
//		ShardedJedis jds = pool.getResource();
//		try {
//			String res = jds.set(encodeKey(key.getKey(), callerName), gson.toJson(obj), "NX", "EX", second);
//			return OK.equals(res);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		} finally {
//			jds.close();
//		}
//	}
//
//	public <T> boolean remove(BaseCacheKey key) {
//		ShardedJedis jds = pool.getResource();
//		try {
//			Long count = jds.del(encodeKey(key.getKey(), callerName));
//			return count > 0;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		} finally {
//			jds.close();
//		}
//	}
//
//	@Value("${redis.pool.maxActive}")
//	int maxActive;
//
//	@Value("${redis.pool.maxIdle}")
//	int maxIdle;
//
//	@Value("${redis.pool.minIdle}")
//	int minIdle;
//
//	@Value("${redis.pool.maxWait}")
//	int maxWait;
//
//	@Value("${redis.address}")
//	private String redisAddress;
//
//	@Value("${redis.caller}")
//	String callerName;
//
//	@Value("${default.expire.seconds}")
//	int defaultExpireSeconds;
//
//	private ShardedJedisPool pool;
//
//	@PostConstruct
//	public void init() {
//		try {
//			UapRedisConfig uapConfig = gson.fromJson(redisAddress, UapRedisConfig.class);
//			if (CollectionUtils.isNotEmpty(uapConfig.master) && uapConfig.master.size() > 1) {
//				JedisPoolConfig config = new JedisPoolConfig();
//				config.setMaxIdle(maxIdle);
//				config.setMaxTotal(maxActive);
//				config.setMinIdle(minIdle);
//				config.setMaxWaitMillis(maxWait);
//
//				List<JedisShardInfo> jdsInfoList = new ArrayList<JedisShardInfo>(uapConfig.master.size());
//				for (String add : uapConfig.master) {
//					String[] add_port = add.split(":");
//					jdsInfoList.add(new JedisShardInfo(add_port[0], Integer.parseInt(add_port[1])));
//				}
//				pool = new ShardedJedisPool(config, jdsInfoList, Hashing.MURMUR_HASH, Sharded.DEFAULT_KEY_TAG_PATTERN);
//
//				Redis.cache = this;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * 延续之前的缓存时间put
//	 * @see com.wanda.finanframe.nosql.redis.RedisCache#putContinue(com.wanda.uap.entity.cache.BaseCacheKey, Object)
//	 */
//	@Override
//	public <T> boolean putContinue(final BaseCacheKey key, final T obj) {
//
//		ShardedJedis jds = pool.getResource();
//		try {
//			Long ttl = jds.ttl(encodeKey(key.getKey(), callerName));
//			String res = jds.setex(encodeKey(key.getKey(), callerName), ttl.intValue(), gson.toJson(obj));
//			return OK.equals(res);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		} finally {
//			jds.close();
//		}
//
//	}
//
//	private static String encodeKey(String key, String caller) {
//		return String.format("%s:%s", caller, key);
//	}
//
//	@Override
//	public <T> long leftPut(BaseCacheKey key, T obj) {
//		ShardedJedis jds = pool.getResource();
//		try {
//			return jds.lpush(encodeKey(key.getKey(), callerName),  gson.toJson(obj));
//		} catch (Exception e) {
//			e.printStackTrace();
//			return 0;
//		} finally {
//			jds.close();
//		}
//	}
//
//	@Override
//	public <T> T leftPop(BaseCacheKey key, Class<T> clazz) {
//		ShardedJedis jds = pool.getResource();
//		try {
//			return gson.fromJson(jds.lpop(encodeKey(key.getKey(), callerName)), clazz);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		} finally {
//			jds.close();
//		}
//	}
//
//	@Override
//	public <T> long rightPut(BaseCacheKey key, T obj) {
//		ShardedJedis jds = pool.getResource();
//		try {
//			return jds.rpush(encodeKey(key.getKey(), callerName),  gson.toJson(obj));
//		} catch (Exception e) {
//			e.printStackTrace();
//			return 0;
//		} finally {
//			jds.close();
//		}
//	}
//
//	@Override
//	public <T> T rightPop(BaseCacheKey key, Class<T> clazz) {
//		ShardedJedis jds = pool.getResource();
//		try {
//			return gson.fromJson(jds.rpop(encodeKey(key.getKey(), callerName)), clazz);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		} finally {
//			jds.close();
//		}
//	}
//
//	@Override
//	public <T> T hashGet(String key, String field, Class<T> clazz) {
//		ShardedJedis jds = pool.getResource();
//		try {
//			return gson.fromJson(jds.hget(key, field), clazz);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		} finally {
//			jds.close();
//		}
//	}
//
//	@Override
//	public <T> boolean hashPut(String key, String field, T obj) {
//		ShardedJedis jds = pool.getResource();
//		try {
//			jds.hset(key, field, gson.toJson(obj));
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		} finally {
//			jds.close();
//		}
//	}
//
//	@Override
//	public long getListCount(BaseCacheKey key) {
//		ShardedJedis jds = pool.getResource();
//		try {
//			return jds.llen(encodeKey(key.getKey(), callerName));
//		} catch (Exception e) {
//			e.printStackTrace();
//			return 0;
//		} finally {
//			jds.close();
//		}
//	}
//
//	@Override
//	public long incr(BaseCacheKey key, final long count) {
//		ShardedJedis jds = pool.getResource();
//		try {
//			return jds.incrBy(encodeKey(key.getKey(), callerName),count);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return 0;
//		} finally {
//			jds.close();
//		}
//	}
//
//	@Override
//	public long ttl(final BaseCacheKey key) {
//		ShardedJedis jds = pool.getResource();
//		try {
//			return jds.ttl(encodeKey(key.getKey(), callerName));
//		} catch (Exception e) {
//			e.printStackTrace();
//			return 0;
//		} finally {
//			jds.close();
//		}
//	}
//
//	@Override
//	public List<String> hashKeys(final String key) {
//		ShardedJedis jds = pool.getResource();
//		try {
//			return new ArrayList<String>(jds.hkeys(encodeKey(key, callerName)));
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		} finally {
//			jds.close();
//		}
//	}
//}
