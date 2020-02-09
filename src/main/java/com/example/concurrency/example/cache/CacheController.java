package com.example.concurrency.example.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class CacheController {

    @Autowired
    private RedisClient redisClient;

    @GetMapping("get")
    public String get(String key) throws Exception {
        return redisClient.get(key);
    }

    @GetMapping("set")
    public String set(String key, String value) throws Exception{
        redisClient.set(key, value);
        return "SUCCESS";
    }
}
