package com.qfedu.service;

import com.qfedu.pojo.Color;
import com.qfedu.pojo.Picture;
import com.qfedu.pojo.Shop;
import com.qfedu.pojo.ShopComment;

import java.util.List;

/**
 * Created by Administrator on 2019/6/26 0026.
 */
public interface ShopService {
    List<Shop> findAllShop(Shop shop);

    List<Shop> findAllShop2();

    Shop findShop(Integer sid);

    List<Color> findColor(Integer sid);

    List<Picture> findPicture(Integer sid);

    List<ShopComment> findComment(Integer sid);
}
