package com.qfedu.dao;

import com.qfedu.pojo.FoodListComment;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/22.
 */
public interface FoodListCommentDao {
    public List<FoodListComment> findCommentById(Integer id);
   // public void addFoodComment()
}
