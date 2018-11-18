package com.example.service3.controller;

import com.codingapi.tx.annotation.TxTransaction;
import com.example.service3.service.Service3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/6 19:59
 */
@RestController
public class Service3Controller {


    @Autowired
    private Service3 service3;

    @TxTransaction
    @RequestMapping(value = "/hi3")
    public String hi3() {
        return service3.hi3();
    }
}
