package com.example.service1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/6 19:59
 */
@RestController
public class HelloController {

//    @Value("${myname}")
//    String myname;
//
//    @RequestMapping(value = "/hi")
//    public String hi() {
//        return myname;
//    }


    @RequestMapping(value = "/hi")
    public String hi() {
        return "asdfafas";
    }


    @RequestMapping(value = "/hi2")
    public String hi2() {
        return "hi2 finish";
    }
}
