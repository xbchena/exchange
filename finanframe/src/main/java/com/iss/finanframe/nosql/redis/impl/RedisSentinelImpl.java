package com.iss.finanframe.nosql.redis.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.google.gson.Gson;
import com.iss.finanframe.nosql.redis.BaseCacheKey;
import com.iss.finanframe.nosql.redis.RedisCache;
import com.iss.finanframe.nosql.redis.util.Redis;

import redis.clients.jedis.JedisPoolConfig;

@Component("sentinel")
final class RedisSentinelImpl implements RedisCache {

	private static Gson gson = new Gson();

	public <T> T get(final BaseCacheKey key, final Class<T> clazz) {
		return template.execute(new RedisCallback<T>() {
			@Override
			public T doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] bytes = connection.get(encodeKey(key.getKey(), callerName));
				if (bytes != null) {
					try {
						return gson.fromJson(new String(bytes), clazz);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				return null;
			}
		});
	}

	public <T> boolean put(final BaseCacheKey key, final T obj) {
		return put(key, obj, 24 * 3600);
	}

	public <T> boolean put(final BaseCacheKey key, final T obj, final int second) {
		return template.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				try {
					connection.setEx(encodeKey(key.getKey(), callerName), second, gson.toJson(obj).getBytes());
					return true;
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
			}
		});
	}

	public <T> boolean putIfNotExist(final BaseCacheKey key, final T obj) {
		return putIfNotExist(key, obj, 24 * 3600);
	}

	public <T> boolean putIfNotExist(final BaseCacheKey key, final T obj, final int second) {
		return template.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				try {
					return connection.setNX(encodeKey(key.getKey(), callerName), gson.toJson(obj).getBytes());
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
			}
		});
	}

	public <T> boolean remove(final BaseCacheKey key) {
		return template.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				try {
					return connection.del(encodeKey(key.getKey(), callerName)) > 0;
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
			}
		});
	}

	private static byte[] encodeKey(String key, String caller) {
		return String.format("%s:%s", caller, key).getBytes();
	}

	@Value("${redis.caller}")
	String callerName;

	@Value("${redis.address}")
	private String redisAddress;

	@Value("${redis.pool.maxActive}")
	int maxActive;

	@Value("${redis.pool.maxIdle}")
	int maxIdle;

	@Value("${redis.pool.minIdle}")
	int minIdle;

	@Value("${redis.pool.maxWait}")
	int maxWait;

	@Value("${default.expire.seconds}")
	int defaultExpireSeconds;

	private RedisTemplate<String, String> template;

	@PostConstruct
	public void init() {
		try {
			UapRedisConfig uapConfig = gson.fromJson(redisAddress, UapRedisConfig.class);
			if (CollectionUtils.isNotEmpty(uapConfig.master) && uapConfig.master.size() == 1 && CollectionUtils.isNotEmpty(uapConfig.slave) && CollectionUtils.isNotEmpty(uapConfig.sentinel)) {
				String[] master_add_port = uapConfig.master.get(0).split(":");

				JedisPoolConfig pollConfig = new JedisPoolConfig();
				pollConfig.setMaxIdle(maxIdle);
				pollConfig.setMaxTotal(maxActive);
				pollConfig.setMinIdle(minIdle);
				pollConfig.setMaxWaitMillis(maxWait);

				JedisConnectionFactory fac = null;

				RedisSentinelConfiguration sentinelConfig = new RedisSentinelConfiguration();
				for (String sentinel : uapConfig.sentinel) {
					String[] slave_add_port = sentinel.split(":");
					sentinelConfig.addSentinel(new RedisNode(slave_add_port[0], Integer.parseInt(slave_add_port[1])));
				}
				sentinelConfig.setMaster("mymaster");

				fac = new JedisConnectionFactory(sentinelConfig, pollConfig);
				fac.setHostName(master_add_port[0]);
				fac.setPort(Integer.parseInt(master_add_port[1]));

				fac = new JedisConnectionFactory(pollConfig);
				fac.setHostName(master_add_port[0]);
				fac.setPort(Integer.parseInt(master_add_port[1]));
				fac.afterPropertiesSet();

				template = new StringRedisTemplate();
				template.setConnectionFactory(fac);
				template.setKeySerializer(new StringRedisSerializer());
				template.setValueSerializer(new StringRedisSerializer());
				template.afterPropertiesSet();

				Redis.cache = this;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 延续之前的缓存时间put
	 * @see com.wanda.finanframe.nosql.redis.RedisCache#putContinue(com.wanda.uap.entity.cache.BaseCacheKey, Object)
	 */
	@Override
	public <T> boolean putContinue(final BaseCacheKey key, final T obj) {

		return template.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				try {
					Long ttl = connection.ttl(encodeKey(key.getKey(), callerName));
					connection.setEx(encodeKey(key.getKey(), callerName), ttl, gson.toJson(obj).getBytes());
					return true;
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
			}
		});

	}

	@Override
	public <T> long leftPut(final BaseCacheKey key,final T obj) {
		return template.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection connection) throws DataAccessException {
				try {
					return connection.lPush(encodeKey(key.getKey(), callerName), gson.toJson(obj).getBytes());
				} catch (Exception e) {
					e.printStackTrace();
					return 0L;
				}
			}
		});
	}

	@Override
	public <T> T leftPop(final BaseCacheKey key, final Class<T> clazz) {
		return template.execute(new RedisCallback<T>() {
			@Override
			public T doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] bytes = connection.lPop(encodeKey(key.getKey(), callerName));
				if (bytes != null) {
					try {
						return gson.fromJson(new String(bytes), clazz);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				return null;
			}
		});
	}

	@Override
	public <T> long rightPut(final BaseCacheKey key, final T obj) {
		return template.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection connection) throws DataAccessException {
				try {
					return connection.rPush(encodeKey(key.getKey(), callerName), gson.toJson(obj).getBytes());
				} catch (Exception e) {
					e.printStackTrace();
					return 0L;
				}
			}
		});
	}

	@Override
	public <T> T rightPop(final BaseCacheKey key, final Class<T> clazz) {
		return template.execute(new RedisCallback<T>() {
			@Override
			public T doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] bytes = connection.rPop(encodeKey(key.getKey(), callerName));
				if (bytes != null) {
					try {
						return gson.fromJson(new String(bytes), clazz);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				return null;
			}
		});
	}

	@Override
	public <T> T hashGet(final String key, final String field, final Class<T> clazz) {
		return template.execute(new RedisCallback<T>() {
			@Override
			public T doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] bytes = connection.hGet(encodeKey(key, callerName), field.getBytes());
				if (bytes != null) {
					try {
						return gson.fromJson(new String(bytes), clazz);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				return null;
			}
		});
	}

	@Override
	public <T> boolean hashPut(final String key, final String field, final T obj) {
		return template.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				try {
					return connection.hSet(encodeKey(key, callerName), field.getBytes(), gson.toJson(obj).getBytes());
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
			}
		});
	}

	@Override
	public long getListCount(final BaseCacheKey key) {
		return template.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.lLen(encodeKey(key.getKey(), callerName));
			}
		});
	}

	@Override
	public long incr(final BaseCacheKey key, final long count) {
		return template.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.incrBy(encodeKey(key.getKey(), callerName), count);
			}
		});
	}

	@Override
	public long ttl(final BaseCacheKey key) {
		return template.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.ttl(encodeKey(key.getKey(), callerName));
			}
		});
	}

	@Override
	public List<String> hashKeys(final String key) {
		return template.execute(new RedisCallback<List<String>>() {
			@Override
			public List<String> doInRedis(RedisConnection connection) throws DataAccessException {
				try {
					Set<byte[]> keys = connection.hKeys(encodeKey(key, callerName));
					List<String> result = new ArrayList<String>(keys.size());
					for(byte[] key : keys){
						result.add(new String(key));
					}
					return result;
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
			}
		});
	}
}
