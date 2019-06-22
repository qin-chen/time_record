package com.qfedu.service.impl;

import com.qfedu.dao.FoodListContentDao;
import com.qfedu.pojo.FoodListContent;
import com.qfedu.service.FoodListContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/22.
 */
@Service
public class FoodListContentServiceImpl implements FoodListContentService {
    @Autowired
    private FoodListContentDao foodListContentDao;

    @Override
    public List<FoodListContent> findAllContent() {
        List<FoodListContent> foodListContents = foodListContentDao.findAllContent();
        return foodListContents;
    }
}