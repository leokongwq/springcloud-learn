package com.leokongwq.springcloud.booksvrclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * User: kongwenqiang
 * DateTime: 2017/4/15 下午12:59
 * Mail:kongwenqiang@qiyi.com   
 * Description: desc
 */
@Service
public class BookService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String add(){
        return restTemplate.getForEntity("http://bookservice/add?a=10&b=20", String.class).getBody();
    }

    public String addServiceFallback() {
        return "error";
    }
}
