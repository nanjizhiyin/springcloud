package com.example.service1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author 郜金丹
 * @Date 2018/11/19 16:59
 */
@Controller
@RequestMapping(value = "tmcompensate")
public class TMCompensateController {

    @RequestMapping(value = "/notify")
    public String notif1y(String str) {
        return "asdfafas";
    }
}
