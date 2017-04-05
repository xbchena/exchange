package com.iss.exchange.core.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
@Configuration
@EnableAutoConfiguration
public class RedisConfig {
	@Value("${spring.redis.host}")
	private String host;
	@Value("${spring.redis.port}")
	private int port;
	@Value("${spring.redis.timeout}")
	private int timeout;
	@Value("${spring.redis.database}")
	private int database;
	@Value("${spring.redis.pool.max-active}")
	private int maxActive;
	@Value("${spring.redis.pool.max-idle}")
	private int maxIdle;
	@Value("${spring.redis.pool.max-wait}")
	private int maxWait;
	@Value("${spring.redis.pool.min-idle}")
	private int minWait;

	@Bean
	public JedisConnectionFactory redisConnectionFactory() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		factory.setHostName(host);
		factory.setDatabase(database);
		factory.setPort(port);
		factory.setTimeout(timeout); 
		factory.setUsePool(true);
		factory.getPoolConfig().setMaxIdle(maxIdle);
		factory.getPoolConfig().setMaxWaitMillis(maxWait);
		factory.getPoolConfig().setMaxTotal(maxActive);
		factory.getPoolConfig().setMinIdle(minWait);
		return factory;
	}

	@Bean
	public StringRedisTemplate stringRedisTemplate() {
		return new StringRedisTemplate(redisConnectionFactory());
	}
}
