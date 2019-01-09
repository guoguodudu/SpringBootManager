package com.phdua.manager.redis;


import java.util.concurrent.TimeUnit;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisClient<T> {

    private RedisTemplate<String, T> redisTemplate;

    public RedisClient(RedisTemplate<String, T> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public RedisTemplate<String, T> getRedisTemplate() {
        return this.redisTemplate;
    }

    public void set(String key, T value, Long time) {
        this.redisTemplate.opsForValue().set(key, value);
        this.redisTemplate.expire(key, time.longValue(), TimeUnit.MILLISECONDS);
    }

    public T get(String key) {
        return this.redisTemplate.opsForValue().get(key);
    }

    public boolean exists(String key) {
        return this.redisTemplate.hasKey(key).booleanValue();
    }

    public void remove(String key) {
        this.redisTemplate.delete(key);
    }

    public T getSet(String key, T value, long time) {
        T result = this.redisTemplate.opsForValue().getAndSet(key, value);
        this.redisTemplate.expire(key, time, TimeUnit.MILLISECONDS);
        return result;
    }

    public boolean setnx(String key, T value, long time) {
        boolean result = this.redisTemplate.opsForValue().setIfAbsent(key, value).booleanValue();
        this.redisTemplate.expire(key, time, TimeUnit.MILLISECONDS);
        return result;
    }

    public Long decrBy(String key, long decrement) {
        return this.redisTemplate.opsForValue().increment(key, -decrement);
    }

    public Long decr(String key) {
        return this.redisTemplate.opsForValue().increment(key, -1L);
    }

    public Long incrBy(String key, long increment) {
        return this.redisTemplate.opsForValue().increment(key, increment);
    }

    public Long incr(String key) {
        return this.redisTemplate.opsForValue().increment(key, 1L);
    }

    public void hset(String key, String field, T value, long time) {
        this.redisTemplate.opsForHash().put(key, field, value);
        this.redisTemplate.expire(key, time, TimeUnit.MILLISECONDS);
    }

    public T hget(String key, String field) {
        HashOperations<String, String, T> hashOperations = this.redisTemplate.opsForHash();
        return hashOperations.get(key, field);
    }

    public void hdel(String key, String field) {
        this.redisTemplate.opsForHash().entries(key).remove(field);
    }

    public Long lpush(String key, T value) {
        return this.redisTemplate.opsForList().leftPush(key, value);
    }

    public T lpop(String key) {
        return this.redisTemplate.opsForList().leftPop(key);
    }

    public Long rpush(String key, T value) {
        return this.redisTemplate.opsForList().rightPush(key, value);
    }

    public T rpop(String key) {
        return this.redisTemplate.opsForList().rightPop(key);
    }
}

