package com.qfedu.service.impl;

import com.qfedu.dao.UserDao;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 星尘 on 2019/6/21.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao ;

    @Override
    public User login(String username, String password) {
        User user = userDao.login(username, password);
        return user ;
    }

    @Override
    public User selectUserByUserName(String username) {
        User user = userDao.selectUserByUserName(username);
        return user;
    }

    @Override
    public void register(User user) {
        userDao.register(user);
    }
}