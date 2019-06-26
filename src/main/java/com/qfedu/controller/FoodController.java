package com.qfedu.controller;

import com.qfedu.pojo.Food;
import com.qfedu.service.FoodService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/26.
 */
@CrossOrigin
@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @RequestMapping("/foodById")
    public JsonBean findFoodById(Integer mid) {
        List<Food> foodList = foodService.findall(mid);
        return new JsonBean(1,foodList);
    }
   @RequestMapping("/foodDetailById")
    public JsonBean findFoodDetailById(Integer fid){
       List<Food> foodList = foodService.findall01(fid);
       return new JsonBean(1,foodList);
   }
}