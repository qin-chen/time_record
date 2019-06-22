package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.utils.JsonUtils;
import com.qfedu.vo.JsonBean;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 * Created by 星尘 on 2019/6/21.
 */
@CrossOrigin
@Controller
@RequestMapping ("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public JsonBean login (String username , String password, HttpServletRequest request) {
        User user1 = userService.selectUserByUserName(username);
        if(user1 == null){
            return new JsonBean(0,"该账户不存在，请注册");
        }
        User user = userService.login(username, password);
        if (user != null ){
            if(user.getStatus() ==0 ){
                return new JsonBean(0,"该用户已被冻结");
            }else {
                    return new JsonBean(1,user);
               /* try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    byte[] bytes = byteArrayOutputStream.toByteArray();
                    objectOutputStream.writeObject(user);

                    String token = Base64.encode(bytes);
                    request.getServletContext().setAttribute(token,user);
                    return JsonUtils.createJsonBean(1, token);
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
            }

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