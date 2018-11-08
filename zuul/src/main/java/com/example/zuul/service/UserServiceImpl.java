package com.example.zuul.service;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/8 16:20
 */

import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements Userservice {

    @Override
    public String findUserByName(String userName) {
        return "aljalsjfoijoirqre";
    }
}