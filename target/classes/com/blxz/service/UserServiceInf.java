package com.blxz.service;

import com.blxz.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserServiceInf {
    //登录
    User loginCheck(User user);

    int register(User user);

    int reSetPassword(String username,String password,String phonenumber);

}
