package com.example.service2.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.example.service2.mapper.UserDao;
import com.example.service2.service.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/8 9:20
 */
@Service
public class Service2Impl implements Service2{


    @Autowired
    private UserDao userDao;

    @Transactional
    @TxTransaction
    @Override
    public String hi2() {
//        User user = userDao.findUserByUsername("100009");
//        return user.getMobile();

        userDao.insetUsername("100007","08");
        return "100007";
    }
}
