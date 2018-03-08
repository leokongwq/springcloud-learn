package com.leokongwq.springcloud.bookservice.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : kongwenqiang
 * DateTime: 2018/3/7 下午2:35
 * Mail:leokongwq@gmail.com   
 * Description: desc
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(UranusConfigRegistrar.class)
public @interface EnableRedisCache {

    String host() default "127.0.0.1";

    int port() default 9527;
}
