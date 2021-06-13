package com.example.eurekaConsumer.controller;

import com.example.eurekaConsumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer-user")
    public User getServiceUser() {
        // 通过 restTemplate.getForObject 调用注册中心的服务
        // 第一个参数是服务地址
        // 第二个参数是数据返回的接收类
        return restTemplate.getForObject("http://localhost:8010/user", User.class);
    }
}
