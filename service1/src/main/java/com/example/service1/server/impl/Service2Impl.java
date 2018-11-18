package com.example.service1.server.impl;

import com.example.service1.server.Service2;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/8 9:20
 */
@Component
public class Service2Impl implements Service2 {
    @Override

    public String hi2() {
        System.out.print("进入hi2熔断 \n");
        return null;
    }
}
