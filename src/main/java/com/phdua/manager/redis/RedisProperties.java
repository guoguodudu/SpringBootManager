package com.phdua.manager.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
@Configuration
public class RedisProperties {

    @Value("${redis.hostName}")
    private String hostname;

    @Value("${redis.port}")
    private Integer port;

    @Value("${redis.password}")
    private String password;

    @Value("${redis.maxTotal}")
    private Integer maxTotal;

    @Value("${redis.maxIdle}")
    private Integer maxIdle;

    @Value("${redis.maxWaitMillis}")
    private Integer maxWaitMillis;

    @Value("${redis.minIdle}")
    private Integer minIdle;

    @Value("${redis.testOnBorrow}")
    private Boolean testOnBorrow;

    @Value("${redis.testOnReturn}")
    private Boolean testOnReturn;

    @Value("${redis.accept}")
    private String accept;

    public RedisProperties() {
    }

    public String getHostname() {
        return this.hostname;
    }


    public Integer getPort() {
        return this.port;
    }

    public String getPassword() {
        return this.password;
    }


    public Integer getMaxTotal() {
        return this.maxTotal;
    }

    public Integer getMaxIdle() {
        return this.maxIdle;
    }


    public Integer getMaxWaitMillis() {
        return this.maxWaitMillis;
    }

    public Integer getMinIdle() {
        return this.minIdle;
    }

    public Boolean getTestOnBorrow() {
        return this.testOnBorrow;
    }

    public Boolean getTestOnReturn() {
        return this.testOnReturn;
    }


    public String getAccept() {
        return this.accept;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMaxTotal(Integer maxTotal) {
        this.maxTotal = maxTotal;
    }

    public void setMaxIdle(Integer maxIdle) {
        this.maxIdle = maxIdle;
    }

    public void setMaxWaitMillis(Integer maxWaitMillis) {
        this.maxWaitMillis = maxWaitMillis;
    }

    public void setMinIdle(Integer minIdle) {
        this.minIdle = minIdle;
    }

    public void setTestOnBorrow(Boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public void setTestOnReturn(Boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }
}
