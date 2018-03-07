package com.leokongwq.springcloud.booksvrclient.web.controller;

import com.leokongwq.springcloud.booksvrclient.service.BookService;

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
    private BookService bookService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return bookService.add();
    }
}
