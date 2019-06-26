package com.qfedu.service;

import com.qfedu.pojo.FoodListContent;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/22.
 */
public interface FoodListContentService {
    public List<FoodListContent> findAllContent();
    public FoodListContent findContent(Integer id);
}
