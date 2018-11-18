package com.example.service3.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/7 17:19
 */
@Service
public interface Service3 {

    @RequestMapping(value = "/hi3")
    String hi3() ;
}
