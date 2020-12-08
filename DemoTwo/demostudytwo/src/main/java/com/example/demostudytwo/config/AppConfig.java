package com.example.demostudytwo.config;


import com.example.demostudytwo.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


@Configuration//做一些配置的工作，配置类，启动的时候做配置性工作
public class AppConfig {

    @Bean//配置类的方法上，以返回值做Bean的实例对象，注册到容器中
    //Bean的名称为方法名
    public  Map<String, String> test1() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "100");
        map.put("2", "200");
        return map;
    }

    @Bean
    public  Map<String, String> test2() {
        Map<String, String> map = new HashMap<>();
        map.put("3", "300");
        map.put("4", "400");
        return map;
    }

    @Bean
    public User user1() {
        User user = new User();
        user.setName("xxxx");
        user.setAge(16);
        return user;
    }

    @Bean
    public User user2() {
        User user = new User();
        user.setName("yyy");
        user.setAge(61);
        return user;
    }


}
