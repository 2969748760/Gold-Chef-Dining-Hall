package com.blxz.service;

import com.blxz.mapper.UserMapper;
import com.blxz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceInf{
    @Autowired
    private UserMapper usermapper;

    @Override
    public User loginCheck(User user) {
        return usermapper.loginCheck(user);
    }

    @Override
    public int register(User user) {
        return usermapper.register(user);
    }

    @Override
    public int reSetPassword(String username, String password, String phonenumber) {
        return usermapper.reSetPassword(username,password,phonenumber);
    }
}
