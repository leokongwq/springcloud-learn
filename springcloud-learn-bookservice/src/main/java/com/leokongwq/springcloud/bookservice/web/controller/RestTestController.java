package com.leokongwq.springcloud.bookservice.web.controller;

import com.leokongwq.springcloud.bookservice.dal.mongo.domain.Message;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : kongwenqiang
 * DateTime: 2018/5/13 上午9:31
 * Mail:leokongwq@gmail.com   
 * Description: desc
 */
@RestController
public class RestTestController {

    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player) {
        return new Message(player, "Hello " + player);
    }
}
