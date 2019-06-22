package com.qfedu.dao;

import com.qfedu.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 星尘 on 2019/6/21.
 */
public interface UserDao {
    public User login (@Param("username") String username, @Param("password") String  password);

    User selectUserByUserName(String username);

    void register(User user);
}
