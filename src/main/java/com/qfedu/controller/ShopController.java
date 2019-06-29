package com.qfedu.controller;

import com.qfedu.pojo.Color;
import com.qfedu.pojo.Picture;
import com.qfedu.pojo.Shop;
import com.qfedu.pojo.ShopComment;
import com.qfedu.service.ShopService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
        Shop shop = shopService.findShop(sid);
        List<Color> color = shopService.findColor(sid);
        List<Picture> picture = shopService.findPicture(sid);
        Map<String,Object> map = new HashMap<>();
        map.put("color",color);
        map.put("shop",shop);
        map.put("picture",picture);
        return new JsonBean(1,map);
    }
    @RequestMapping("/shopComment.do")//评论页面
    public JsonBean findComment(Integer sid){
        Integer sumScore = 4;
        String sumComment = "96.7%";
        List listsum = new ArrayList();
        listsum.add(sumScore);
        listsum.add(sumComment);
        List<ShopComment> shopComment = shopService.findComment(sid);
        Map<String,Object> map = new HashMap<>();
        map.put("listSum",listsum);
        map.put("ShopComment",shopComment);
        return new JsonBean(1,map);
    }
}