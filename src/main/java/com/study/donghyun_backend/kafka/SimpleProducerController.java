package com.study.donghyun_backend.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleProducerController {

    @Autowired
    private SimpleProducerService producerService;

    @PostMapping(value = "/sendMessage")
    public void sendMessage(String message) {
        producerService.sendMessage(message);
    }
}
