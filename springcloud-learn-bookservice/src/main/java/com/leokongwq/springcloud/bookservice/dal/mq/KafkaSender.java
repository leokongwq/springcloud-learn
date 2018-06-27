package com.leokongwq.springcloud.bookservice.dal.mq;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

/**
 * kafka
 */
@Component
@Slf4j
public class KafkaSender {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send() {
        Map<String, Object> message = Maps.newHashMap();
        message.put("id", System.currentTimeMillis());
        kafkaTemplate.send("zhisheng", JSON.toJSONString(message));
    }
}