package com.example.zuul.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/8 16:20
 */
@Component
public class UserServiceImpl implements Userservice {

    @RequestMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password){
        return null;
    }

    @RequestMapping(value = "/auth")
    public String auth(@RequestParam("token") String token){
        return null;
    }
}