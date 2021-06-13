package com.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

// @EnableZuulProxy：包含了 @EnableZuulServers 设置该类是网关的启动类
// @EnableAutoConfiguration：可以帮助springBoot将所有符合条件@Configuration配置加载到当前IOC容器中
@SpringBootApplication
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
