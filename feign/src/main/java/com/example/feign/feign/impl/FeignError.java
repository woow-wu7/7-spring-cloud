package com.example.feign.feign.impl;

import com.example.feign.entity.User;
import com.example.feign.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public User getUser() {
        User user = new User();
        user.setName("0");
        user.setAge("0");
        return user;
    }
}
