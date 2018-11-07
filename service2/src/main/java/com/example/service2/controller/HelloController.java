package com.example.service2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/6 19:59
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hi")
    public String hi() {
        return "service2";
    }
}
