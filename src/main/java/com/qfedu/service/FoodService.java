package com.qfedu.service;

import com.qfedu.pojo.Food;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/26.
 */
public interface FoodService {
    public List<Food> findall(Integer id);
    public List<Food> findall01(Integer id) ;
}
