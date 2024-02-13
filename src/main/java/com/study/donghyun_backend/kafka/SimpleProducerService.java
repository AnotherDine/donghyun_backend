package com.study.donghyun_backend.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SimpleProducerService {

    @Autowired
    private KafkaTemplate<String, String> template;

    public void sendMessage(String message) {
        System.out.println("send Message :" + message);
        this.template.send("oing", message);
    }
}
