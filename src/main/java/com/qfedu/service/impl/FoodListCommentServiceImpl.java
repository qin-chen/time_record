package com.qfedu.service.impl;

import com.qfedu.dao.FoodListCommentDao;
import com.qfedu.pojo.FoodListComment;
import com.qfedu.service.FoodListCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/22.
 */
@Service
public class FoodListCommentServiceImpl implements FoodListCommentService {
    @Autowired
    private FoodListCommentDao foodListCommentDao;
    @Override
    public List<FoodListComment> findCommentById(Integer id) {
        List<FoodListComment> commentList = foodListCommentDao.findCommentById(id);
        return commentList;
    }
}