package com.example.service1.server.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.example.service1.server.Service1;
import com.example.service1.server.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/18 21:00
 */
@Service
public class Service1Impl implements Service1 {

    @Autowired
    private Service2 service2;

    @Override
    @TxTransaction(isStart=true)
    public String hi2()  {
        String str2 = service2.hi2();
        //模拟异常
//        int v = 100/0;
        return "成功"+str2;
    }
}
