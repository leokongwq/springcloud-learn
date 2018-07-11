package com.leokongwq.springcloud.booksvrclient.web.controller;

import com.leokongwq.springcloud.booksvrclient.service.BookService;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * User: kongwenqiang
 * DateTime: 2017/4/15 下午12:36
 * Mail:kongwenqiang@qiyi.com   
 * Description: desc
 */
@RestController
public class BookController {

    @Resource
    private LoadBalancerClient loadBalancer;

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private BookService bookService;

    /**
     * 从所有服务中选择一个服务（轮询）
     */
    @RequestMapping("/discover")
    public Object discover() {
        return loadBalancer.choose("bookservice").getUri().toString();
    }

    /**
     * 获取所有服务
     */
    @RequestMapping("/services")
    public Object services() {
        return discoveryClient.getInstances("bookservice");
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return bookService.add();
    }
}
