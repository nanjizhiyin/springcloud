package com.example.service3.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.example.service3.service.Service3;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/8 9:20
 */
@Component
public class Service3Impl implements Service3 {
    @Override

    public String hi3() {
        return "333333333333";
    }
}
