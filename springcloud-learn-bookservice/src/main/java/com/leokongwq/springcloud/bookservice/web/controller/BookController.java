package com.leokongwq.springcloud.bookservice.web.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * User: kongwenqiang
 * DateTime: 2017/4/15 下午12:03
 * Mail:kongwenqiang@qiyi.com
 * Description: desc
 */
@RestController
public class BookController {

    private final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Resource
    private DiscoveryClient client;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }
}
