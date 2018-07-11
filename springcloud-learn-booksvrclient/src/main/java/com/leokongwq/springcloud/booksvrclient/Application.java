package com.leokongwq.springcloud.booksvrclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author : kongwenqiang
 * DateTime: 2018/5/13 上午9:32
 * Mail:leokongwq@gmail.com
 * Description: desc
 */
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class Application {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
