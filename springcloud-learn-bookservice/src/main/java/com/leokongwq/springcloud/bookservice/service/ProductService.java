package com.leokongwq.springcloud.bookservice.service;

import com.leokongwq.springcloud.bookservice.dal.mongo.dao.ProductDao;
import com.leokongwq.springcloud.bookservice.dal.mongo.domain.Product;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : kongwenqiang
 * DateTime: 2018/5/12 下午10:08
 * Mail:leokongwq@gmail.com   
 * Description: desc
 */
@Service
public class ProductService {

    @Resource
    private ProductDao productDao;

    @Cacheable(cacheNames = {"products"}, key = "#id")
    public Product getProductById(Long id) {
        return productDao.findById(id);
    }
}
