package com.leokongwq.springcloud.bookservice;

import com.leokongwq.springcloud.bookservice.config.WebConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@EnableDiscoveryClient
@SpringBootApplication
@ServletComponentScan(basePackages = "com.leokongwq.springcloud.bookservice.web")
@EnableAutoConfiguration(exclude = {WebConfig.class, AopAutoConfiguration.class})
public class BookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}
}
