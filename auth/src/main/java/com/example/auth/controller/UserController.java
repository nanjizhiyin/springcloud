package com.example.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/8 17:37
 */

@RestController
public class UserController {

    @RequestMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password) {

        return "token123123";
    }

    @RequestMapping(value = "/auth")
    public String auth(@RequestParam("token") String token) {

        return "0";
    }
}
