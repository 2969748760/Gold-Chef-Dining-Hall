package com.blxz.mapper;

import com.blxz.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User loginCheck(User user);

    int register(User user);

    int reSetPassword(@Param("username") String username,@Param("password") String password,@Param("phonenumber") String phonenumber);
}
