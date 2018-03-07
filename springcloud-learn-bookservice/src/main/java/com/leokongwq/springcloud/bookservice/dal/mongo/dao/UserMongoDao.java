package com.leokongwq.springcloud.bookservice.dal.mongo.dao;

import com.leokongwq.springcloud.bookservice.dal.mongo.domain.User;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * User: kongwenqiang
 * DateTime: 2017/5/22 上午9:50
 * Mail:kongwenqiang@qiyi.com
 * Description: desc
 */
public interface UserMongoDao extends MongoRepository<User, Long> {

    public User findById(Long id);

    public List<User> findByName(String name);
}
