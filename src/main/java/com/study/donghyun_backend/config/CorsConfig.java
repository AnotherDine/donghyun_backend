package com.study.donghyun_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {
    public CorsConfig() {
        System.out.println("MyConfiguration bean is created.");
    }
    

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("GET")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .maxAge(3000)
                ;
    }
}
