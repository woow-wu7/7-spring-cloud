package com.example.ribbon.controller;

import com.example.ribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/ribbon-user")
    public User getServiceUser() {
        // 通过 restTemplate.getForObject 调用注册中心的服务
        // 第一个参数是服务地址
        // 第二个参数是数据返回的接收类

        // 注意这里的写法和下面的等价，即可以使用注册中心的服务名代替服务提供的具体地址
        return restTemplate.getForObject("http://provider/user", User.class);
        // return restTemplate.getForObject("http://localhost:8010/user", User.class);
    }
}
