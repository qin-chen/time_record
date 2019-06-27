package com.qfedu.controller;

import com.qfedu.pojo.Shop;
import com.qfedu.service.ShopService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/26 0026.
 */
@RestController
@CrossOrigin
public class ShopController {
    @Autowired
    private ShopService shopService;
    @RequestMapping("/shopAll.do")//所有商品
    public JsonBean findAllArticle(Integer status){
        //status = 1;
        Shop shop =new Shop();
        if(status==null){
            status=8;
        }
        shop.setShopStatus(status);
        Map<String,Object> map = new HashMap<>();
        List<Shop> listAll = shopService.findAllShop(shop);
        if(status != 1 && status != 2 && status != 3 && status != 4){
            List<Shop> list = shopService.findAllShop2();
            map.put("list",list);
        }
        map.put("listAll",listAll);
        return new JsonBean(1,map);
    }
    @RequestMapping("/shop.do")//单个商品
    public JsonBean findShop(Integer sid){
        sid = 1;
        Shop shop = shopService.findShop(sid);
        return new JsonBean(1,shop);
    }
}