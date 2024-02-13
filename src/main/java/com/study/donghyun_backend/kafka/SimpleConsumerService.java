package com.study.donghyun_backend.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SimpleConsumerService {

    @KafkaListener(topics = "oing", groupId = "group-id-oing")
    public void consume(String message) {
        System.out.println("recevice message :" + message);
    }
}
