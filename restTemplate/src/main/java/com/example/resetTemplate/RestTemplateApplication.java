package com.example.resetTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class, args);
    }

    // @Bean 注册到容器中，则在别的类中可以通过@AutoWired注入
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
