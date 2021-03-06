package com.example.service1.controller;

import com.codingapi.tx.annotation.TxTransaction;
import com.example.service1.server.Service1;
import com.example.service1.server.Service2;
import com.example.service1.server.Service3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.ldap.PagedResultsControl;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/6 19:59
 */
@RestController
public class Service1Controller {

    @Autowired
    private Service1 service1;

//    @Value("${myname}")
//    String myname;
//
//    @RequestMapping(value = "/hi")
//    public String hi() {
//        return myname;
//    }


    @RequestMapping(value = "/hi1")
    public String hi1() {
        return "asdfafas";
    }


    @Transactional
    @TxTransaction(isStart=true)
    @RequestMapping(value = "/hi2")
    public String hi2() {
        String str2 = service1.hi2();
//        String str3 = service3.hi3();


        return str2;
    }
}
