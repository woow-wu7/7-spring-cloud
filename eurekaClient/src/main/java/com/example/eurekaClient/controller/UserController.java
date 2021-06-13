package com.example.eurekaClient.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserController {

    @GetMapping("/user")
    public HashMap<Object, Object> getUser() {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("name", "woow_wu7");
        objectObjectHashMap.put("age", "20");
        return objectObjectHashMap;
    }

    @GetMapping("/user2")
    public HashMap<Object, Object> getUser2() {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("address", "suzhou");
        return objectObjectHashMap;
    }
}
