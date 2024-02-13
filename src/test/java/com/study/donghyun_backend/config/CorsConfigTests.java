package com.study.donghyun_backend.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class CorsConfigTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void prints() {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String bean : beanDefinitionNames) {
            System.out.println("bean :" + bean);
        }

    }
}