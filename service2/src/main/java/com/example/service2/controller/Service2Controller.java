package com.example.service2.controller;

import com.codingapi.tx.annotation.TxTransaction;
import com.example.service2.service.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/6 19:59
 */
@RestController
public class Service2Controller {


    @Autowired
    private Service2 service2;

    @RequestMapping(value = "/hi")
    public String hi() {
        return "service2";
    }

    @RequestMapping(value = "/hi2")
    public String hi2() {
        return service2.hi2();
    }
}
