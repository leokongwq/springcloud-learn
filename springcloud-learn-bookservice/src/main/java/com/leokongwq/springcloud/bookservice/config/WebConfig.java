package com.leokongwq.springcloud.bookservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : kongwenqiang
 * DateTime: 2018/3/7 下午2:11
 * Mail:leokongwq@gmail.com   
 * Description: desc
 */
@Configuration
@Import(UranusConfigRegistrar.class)
@EnableRedisCache
public class WebConfig {
}
