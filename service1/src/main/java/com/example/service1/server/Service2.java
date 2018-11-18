package com.example.service1.server;

import com.example.service1.server.impl.Service2Impl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/7 17:19
 */

@FeignClient(value = "service2", fallback = Service2Impl.class)
public interface Service2 {

    @RequestMapping("/hi2")
    String hi2();
}
