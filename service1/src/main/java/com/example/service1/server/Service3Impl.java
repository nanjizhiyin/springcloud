package com.example.service1.server;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/18 17:40
 */
@Component
public class Service3Impl implements Service3 {
    @Override

    public String hi3() {
        System.out.print("进入hi2熔断 \n");
        return null;
    }
}