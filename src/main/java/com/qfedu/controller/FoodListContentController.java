package com.qfedu.controller;

import com.qfedu.pojo.FoodListComment;
import com.qfedu.pojo.FoodListContent;
import com.qfedu.service.FoodListCommentService;
import com.qfedu.service.FoodListContentService;
import com.qfedu.vo.JsonBean;
import com.sun.tracing.dtrace.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 星尘 on 2019/6/22.
 */
@RestController
@CrossOrigin
@RequestMapping("/foodlist")
public class FoodListContentController {
    @Autowired
    private FoodListContentService foodListContentService;
    @Autowired
    private FoodListCommentService foodListCommentService;
    @RequestMapping("/foodlistcontent")
    public JsonBean findFoodLlist(){
        List<FoodListContent> foodListContentList = foodListContentService.findAllContent();
        return new JsonBean(1,foodListContentList);
    }
    @RequestMapping("/foodlistContentDetail")      // 查找图片详情的同时 ，把评论也展示
    public JsonBean findFoodListById(Integer id){
        FoodListContent foodListContent = foodListContentService.findContent(id);
        List<FoodListComment> commentList = foodListCommentService.findCommentById(id);
         Map map =  new HashMap<>();
        map.put("foodListContent",foodListContent);
        map.put("commentList",commentList);
        return  new JsonBean(1,map);
    }
}