package com.example.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/8 17:37
 */

@RestController
public class UserController {
    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/login")
    public String login(HttpServletResponse response,
                        HttpServletRequest request,
                        @RequestParam("username") String username,
                        @RequestParam("password") String password) {
        String token = username+"_"+password;
        redisService.set(username,token);

        response.setHeader("Set-Cookie","token="+token);
        return token;
    }

    @RequestMapping(value = "/auth")
    public String auth(@RequestParam("token") String token) {
        String[] strs = token.split("_");
        String username = strs[0];
        Object tmpObj = redisService.get(username);
        if (tmpObj != null){
            if (token.equals(tmpObj.toString())){
                //验证成功
                return "0";
            }
        }
        return "-1";
    }
}
