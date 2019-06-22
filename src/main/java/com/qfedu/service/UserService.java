package com.qfedu.service;

import com.qfedu.pojo.User;

/**
 * Created by 星尘 on 2019/6/21.
 */
public interface UserService {
    public User login (String username,String  password);

    User selectUserByUserName(String username);

    void register(User user);
}
