package com.example.service1.server;

import com.codingapi.tx.annotation.TxTransaction;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/8 9:20
 */
@Component
public class Service1Impl implements Service1 {
    @Override

    public String hi2() {
        System.out.print("进入hi2熔断 \n");
        return null;
    }
}
