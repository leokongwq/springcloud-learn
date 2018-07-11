package com.leokongwq.springcloud.bookservice.web.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.annotation.Resource;

/**
 * @author : kongwenqiang
 * DateTime: 2018/5/13 上午9:32
 * Mail:leokongwq@gmail.com   
 * Description: desc
 */
@RestController
public class IndexController {

    @Resource
    private DiscoveryClient discoveryClient;

    public List<String> serviceUrl() {
        return discoveryClient.getServices();
    }

    @RequestMapping("/")
    public String welcome() {
        System.out.println(serviceUrl());
        return "Welcome to RestTemplate Example.";
    }
}
