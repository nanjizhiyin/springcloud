package com.example.zuul.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/8 16:19
 */

@FeignClient(value = "auth", fallback = UserServiceImpl.class)
public interface Userservice {
    @RequestMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password);

    @RequestMapping(value = "/auth")
    public String auth(@RequestParam("token") String token);
}