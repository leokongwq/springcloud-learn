package com.leokongwq.springcloud.bookservice;

import com.leokongwq.springcloud.bookservice.config.WebConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude = {WebConfig.class, AopAutoConfiguration.class})
@ServletComponentScan(basePackages = "com.leokongwq.springcloud.bookservice.web")
public class BookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}
}
