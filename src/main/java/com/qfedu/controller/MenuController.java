package com.qfedu.controller;

import com.qfedu.pojo.Menu;
import com.qfedu.service.MenuService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/25.
 */
@CrossOrigin
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/canEat")
    public JsonBean findall(){
        List<Menu> menuList = menuService.findAll();
        return new JsonBean(1,menuList);
    }
   @RequestMapping("/foodtype")
    public JsonBean findall02(){
       List<Menu> menuList =  menuService.findAll02();
       return  new JsonBean(1,menuList);
   }

}