package com.example.service2.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/7 17:19
 */

@FeignClient(value = "service1", fallback = Service1Impl.class)
public interface Service1Interface {

    @RequestMapping(value = "/hi2")
    String hi2();
}
