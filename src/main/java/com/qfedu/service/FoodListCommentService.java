package com.qfedu.service;

import com.qfedu.pojo.FoodListComment;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/22.
 */
public interface FoodListCommentService {
    public List<FoodListComment> findCommentById(Integer id);
}
