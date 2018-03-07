package com.leokongwq.springcloud.bookservice.dal.mongo;

import com.leokongwq.springcloud.bookservice.dal.mongo.domain.User;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * User: kongwenqiang
 * DateTime: 2017/5/17 下午5:18
 * Mail:kongwenqiang@qiyi.com
 * Description: desc
 */
@Component
public class MongoService {
}
