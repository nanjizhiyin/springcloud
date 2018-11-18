package com.example.service1.server;

import com.example.service1.server.impl.Service3Impl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/18 17:40
 */
@FeignClient(value = "service3", fallback = Service3Impl.class)
public interface Service3 {

    @RequestMapping("/hi3")
    String hi3();
}
