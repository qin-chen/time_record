package com.qfedu.service.impl;

import com.qfedu.dao.ShopDao;
import com.qfedu.pojo.Shop;
import com.qfedu.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/26 0026.
 */
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;

    @Override
    public List<Shop> findAllShop(Shop shop) {
        return shopDao.findAllShop(shop);
    }

    @Override
    public List<Shop> findAllShop2() {
        return shopDao.findAllShop2();
    }

    @Override
    public Shop findShop(Integer sid) {
        return shopDao.findShop(sid);
    }
}