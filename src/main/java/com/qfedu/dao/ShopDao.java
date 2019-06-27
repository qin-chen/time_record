package com.qfedu.dao;

import com.qfedu.pojo.Shop;

import java.util.List;

/**
 * Created by Administrator on 2019/6/26 0026.
 */
public interface ShopDao {
    List<Shop> findAllShop(Shop shop);

    List<Shop> findAllShop2();

    Shop findShop(Integer sid);
}
