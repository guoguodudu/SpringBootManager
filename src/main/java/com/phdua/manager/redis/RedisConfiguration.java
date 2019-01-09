package com.phdua.manager.redis;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Optional;

import java.util.Optional;
import java.util.function.Consumer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@ConditionalOnProperty(
        name = {"spring.fanlai.redis.enabled"},
        havingValue = "true"
)
public class RedisConfiguration {
    public RedisConfiguration() {
    }

    @Primary
    @Bean
    public JedisPoolConfig jedisPoolConfig(RedisProperties properties) {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        Optional.ofNullable(properties.getMaxTotal()).ifPresent(jedisPoolConfig::setMaxTotal);
        Optional.ofNullable(properties.getMaxIdle()).ifPresent(jedisPoolConfig::setMaxIdle);
        Optional.ofNullable(properties.getMaxWaitMillis()).ifPresent(jedisPoolConfig::setMaxWaitMillis);
        Optional.ofNullable(properties.getMinIdle()).ifPresent(jedisPoolConfig::setMinIdle);
        Optional.ofNullable(properties.getTestOnBorrow()).ifPresent(jedisPoolConfig::setTestOnBorrow);
        Optional.ofNullable(properties.getTestOnReturn()).ifPresent(jedisPoolConfig::setTestOnReturn);
        return jedisPoolConfig;
    }

    @Primary
    @Bean
    public JedisConnectionFactory jedisConnectionFactory(JedisPoolConfig jedisPoolConfig, RedisProperties properties) {
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        Optional.ofNullable(properties.getHostname()).ifPresent(jedisConnectionFactory::setHostName);
        Optional.ofNullable(properties.getPort()).ifPresent(jedisConnectionFactory::setPort);
        Optional.ofNullable(properties.getPassword()).ifPresent(jedisConnectionFactory::setPassword);
        jedisConnectionFactory.setPoolConfig(jedisPoolConfig);
        return jedisConnectionFactory;
    }

    @Primary
    @Bean
    public RedisTemplate<String, ?> redisTemplate(JedisConnectionFactory jedisConnectionFactory, RedisProperties properties) {
        RedisTemplate<String, ?> redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(jedisConnectionFactory);
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringRedisSerializer);
        redisTemplate.setHashKeySerializer(stringRedisSerializer);
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }

    @Primary
    @Bean
    public RedisClient<?> redisClient(RedisTemplate<String, ?> redisTemplate) {
        return new RedisClient(redisTemplate);
    }
}
