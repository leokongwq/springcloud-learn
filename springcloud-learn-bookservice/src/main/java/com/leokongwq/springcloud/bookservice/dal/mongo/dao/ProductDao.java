package com.leokongwq.springcloud.bookservice.dal.mongo.dao;

import com.leokongwq.springcloud.bookservice.dal.mongo.domain.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author : kongwenqiang
 * DateTime: 2018/5/12 下午10:05
 * Mail:leokongwq@gmail.com   
 * Description: desc
 */
public interface ProductDao extends MongoRepository<Product, Long> {

    Product findById(Long id);

    List<Product> findByName(String name);
}
