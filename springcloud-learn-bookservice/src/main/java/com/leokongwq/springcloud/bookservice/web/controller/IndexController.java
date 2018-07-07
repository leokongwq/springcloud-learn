package com.leokongwq.springcloud.bookservice.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : kongwenqiang
 * DateTime: 2018/5/13 上午9:32
 * Mail:leokongwq@gmail.com   
 * Description: desc
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }
}
