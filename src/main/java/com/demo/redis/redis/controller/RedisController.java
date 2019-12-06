package com.demo.redis.redis.controller;


import com.demo.redis.redis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/test")
    public void test(){
        Object value = redisUtil.get("1");
        System.out.println(value);

        redisUtil.set("string2","2222222222");
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        redisUtil.lSet("list",list);
        HashSet<String> strings = new HashSet<>();
        boolean a = strings.add("a");
        redisUtil.sSet("hashset",strings);
    }
}
