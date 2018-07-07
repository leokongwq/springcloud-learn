package com.leokongwq.springcloud.bookservice.dal.mongo.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author : kongwenqiang
 * DateTime: 2018/5/13 上午9:32
 * Mail:leokongwq@gmail.com   
 * Description: desc
 */
@XmlRootElement(name = "player")
public class Message {
    private String name;
    private String text;

    public Message() {
    }

    public Message(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public String getText() {
        return text;
    }
}
