package com.example.service2.mapper;

import com.example.service2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Copyright (C) 2017/5/10 北京学信科技有限公司
 *
 * @author:kyq
 * @version:v1.0.0 Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017/5/10     kyq                       v1.0.0        create
 */


@Mapper
public interface UserDao {

    /**
     * 根据学信ID查询用户信息
     * @author kyq
     * @version 1.0
     * @date 2017/5/10 18:59
     */
    public User findUserByUsername(String username);

    /**
     * @Description
     * @Author 郜金丹
     * @Date 2018/11/18 20:46
     * @接口说明 
     * @Param
     * @Return
    */
    public void insetUsername(@Param("username") String username, @Param("name") String name);
}
