package com.qfedu.controller;

import com.qfedu.pojo.FoodListContent;
import com.qfedu.service.FoodListContentService;
import com.qfedu.vo.JsonBean;
import com.sun.tracing.dtrace.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/22.
 */
@RestController
@CrossOrigin
public class FoodListContentController {
    @Autowired
    private FoodListContentService foodListContentService;
    public JsonBean findFoodLlist(){
        List<FoodListContent> foodListContentList = foodListContentService.findAllContent();
        return new JsonBean(1,foodListContentList);
    }

}