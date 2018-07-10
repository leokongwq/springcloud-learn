package com.leokongwq.springcloud.bookservice.dal.mongo;

import com.leokongwq.springcloud.bookservice.dal.mongo.dao.UserMongoDao;
import com.leokongwq.springcloud.bookservice.dal.mongo.domain.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(MongoTestConfiguration.class)
public class MongoTest {

    @Resource
    private MongoTemplate mongoTemplate;
    @Resource
    private MongoClient mongoClient;
    @Resource
    private UserMongoDao userMongoDao;


    @Test
    public void testMongoTemplate(){
        String collName = "users";
        DB db = mongoTemplate.getDb();
        System.out.println("db name is:" + db.getName());
        DBCollection userColl = mongoTemplate.getCollection(collName);
        if (null == userColl){
            mongoTemplate.createCollection(collName,null);
        }else {
            mongoTemplate.dropCollection(collName);
            userColl = mongoTemplate.createCollection(collName,null);
        }
        DBObject user = new BasicDBObject();
        user.put("id", 1);
        user.put("name", "tom");
        int n = userColl.insert(user).getN();
        List<User> users = mongoTemplate.find(Query.query(Criteria.where("id").is(1)), User.class, collName);
        System.out.println(users);
        Assert.assertTrue(users.size() > 0);
    }

    @Test
    public void operateMongo(){
        MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
        mongoDatabase.drop();
        mongoDatabase.createCollection("users");
        MongoCollection<Document> colUser = mongoDatabase.getCollection("users");
        colUser.insertOne(new Document());
    }

    @Test
    public void testUserMongoDao(){
        User user = userMongoDao.findById(Long.valueOf(1));
        Assert.assertTrue(null != user);
    }
}
