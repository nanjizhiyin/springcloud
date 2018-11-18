package com.example.service2.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.example.service2.service.Service2;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/8 9:20
 */
@Component
public class Service2Impl implements Service2 {
    @Override

    @Transactional
    @TxTransaction
    public String hi2() {
        return "fasdfafdasd";
    }
}
