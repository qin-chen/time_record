package com.qfedu.service.impl;

import com.google.gson.annotations.SerializedName;
import com.qfedu.dao.FoodDao;
import com.qfedu.pojo.Food;
import com.qfedu.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/26.
 */
@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodDao foodDao;
    @Override
    public List<Food> findall(Integer id) {
        List<Food> foodList = foodDao.findall(id);
        return foodList;
    }

    @Override
    public List<Food> findall01(Integer id) {
        List<Food> foodList = foodDao.findall01(id);
        return foodList;
    }
}