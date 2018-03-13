/*
package com.cn.eddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.IOException;

*/
/**
 * Created By Eddy on ${Date}
 * Spring 上下文DispatcherServlet配置类
 *//*

@Configuration
@EnableWebMvc
@ComponentScan("controller")
public class WebConfig extends WebMvcConfigurerAdapter{

    */
/**
     * 配置JSP视图解析器
     * @return
     *//*

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    */
/**
     * 配置兼容servlet3.0的multipart请求
     * @return
     * @throws IOException
     *//*

    @Bean
    public MultipartResolver multipartResolver() throws IOException{
        return new StandardServletMultipartResolver();
    }

    */
/**
     * 配置静态资源的处理
     * @param configurer
     *//*

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        configurer.enable();
    }

    */
/**
     * 连接到redis :
     * 通过默认构造器创建的连接工厂会向localhost上的6379端口创建连接，并且没有密码
     * @return
     *//*

    @Bean
    public RedisConnectionFactory redisCF(){
        return new JedisConnectionFactory();
        //通过JedisConnectionFactory连接
        */
/*
        JedisConnectionFactory cf = JedisConnectionFactory();
        cf.setHostName("");
        cf.setPort("");
        cf.setPassword("");
        return cf;
        *//*

    }

    */
/**
     * 直接声明一个经常使用的RedisTemplate
     * @param cf
     * @return
     *//*

    @Bean
    public RedisTemplate<String,String> redisTemplate(RedisConnectionFactory cf){
        RedisTemplate<String,String> redis
                = new RedisTemplate<String, String>();
        redis.setConnectionFactory(cf);
        return redis;
    }


}
*/
