/*
package com.cn.eddy.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

*/
/**
 * Created By Eddy on ${Date}
 * 配置缓存管理器 for Redis
 *//*


@Configuration
@EnableCaching
public class CachingConfig {

    */
/**
     * redis缓存管理器Bean
     * @param redisTemplate
     * @return
     *//*

    @Bean
    public CacheManager cacheManager(RedisTemplate redisTemplate){
        return new RedisCacheManager(redisTemplate);
    }

    */
/**
     * Redis连接工厂Bean
     * @return
     *//*

    @Bean
    public JedisConnectionFactory redisConnectionFactory(){
        JedisConnectionFactory jedisConnectionFactory =
                new JedisConnectionFactory();
        jedisConnectionFactory.afterPropertiesSet();
        return jedisConnectionFactory;
    }

    */
/**
     * RedisTemplate Bean
     * @param redisCF
     * @return
     *//*

    @Bean
    public RedisTemplate<String,String> redisTemplate
            (RedisConnectionFactory redisCF){
        RedisTemplate<String,String> redisTemplate =
                new RedisTemplate<String, String>();
        redisTemplate.setConnectionFactory(redisCF);
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }



}
*/
