package com.example.service2.controller;

import com.example.service2.server.Service1Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/6 19:59
 */
@RestController
public class HelloController {

    @Autowired
    private Service1Interface service1Interface;

    @RequestMapping(value = "/hi")
    public String hi() {
        return "service2";
    }

    @RequestMapping(value = "/hi2")
    public String hi2() {
        return service1Interface.hi2() ;
    }
}
