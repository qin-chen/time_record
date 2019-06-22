package com.qfedu.dao;

import com.qfedu.pojo.FoodListContent;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/22.
 */
public interface FoodListContentDao {
    public List<FoodListContent> findAllContent();
}