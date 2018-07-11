package com.leokongwq.springcloud.bookservice.dal.mongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * User: kongwenqiang
 * DateTime: 2017/5/17 下午6:22
 * Mail:kongwenqiang@qiyi.com   
 * Description: desc
 */
@ToString
@Getter
@Setter
@Document(collection = "users")
public class User {
    @Id
    private Long id;
    private String name;
}
