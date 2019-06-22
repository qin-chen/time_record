package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 星尘 on 2019/6/21.
 */
@Controller
@RequestMapping ("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public JsonBean login (String username ,String password) {
        User user1 = userService.selectUserByUserName(username);
        if(user1 == null){
            return new JsonBean(0,"该账户不存在，请注册");
        }
        User user = userService.login(username, password);
        if (user != null ){
            if(user.getStatus() ==0 ){
                return new JsonBean(0,"该用户已被冻结");
            }
           return new JsonBean(1,user);
        }else {
            return new JsonBean(0,"账户或密码不对，请确认");
        }
    }

    @RequestMapping("/register")
    @ResponseBody
    public JsonBean register(User user) {
        if (user !=null){
            String username = user.getUsername();
            User user1 = userService.selectUserByUserName(username);
            if(user1 != null){
                return new JsonBean(0,"该用户名已经存在");
            }else {
                user.setStatus(1);
               userService.register(user);
                return  new JsonBean(1,"注册成功");
            }
        }
        return null;
    }
}