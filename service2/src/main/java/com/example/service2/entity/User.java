/**
 * Copyright (C) 2013 北京学信科技有限公司
 *
 * @className:com.xuexin.evaluation.entity.User
 * @version:v1.0.0 
 * @author:李大鹏
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2013-6-14     李大鹏                       v1.0.0        create
 *
 */
package com.example.service2.entity;

import java.io.Serializable;
import java.util.Date;


public class User implements Serializable {
    private int userId;
    private String username;
    private String password;
    private String name;
    private String email;
    private String mobile;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
