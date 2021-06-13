package com.example.feign.feign;

import com.example.feign.entity.User;
import com.example.feign.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider", fallback = FeignError.class) // feign需要访问的服务名
public interface FeignProviderClient {

    @GetMapping("/user")
    public User getUser();
}
