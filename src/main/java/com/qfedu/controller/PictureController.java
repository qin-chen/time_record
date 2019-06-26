package com.qfedu.controller;

import com.qfedu.pojo.Picture;
import com.qfedu.service.PictureService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/21.
 */
@CrossOrigin
@Controller
@RequestMapping("/picture")
public class PictureController {
    @Autowired
    private PictureService pictureService;
    @RequestMapping("/pictureall")
    @ResponseBody
    public JsonBean findAllPicture(){          // 锦囊页面轮播图
       List<Picture> pictureList = pictureService.findAllPicture();
       return new JsonBean(1,pictureList);
   }

    @ResponseBody
    @RequestMapping("/foodListPicture")
    public JsonBean findAllFoodList(){
        List<Picture> foodListPicture = pictureService.findAllFoodListPicture();
        return new JsonBean(1,foodListPicture);
    }
   /* @ResponseBody
    @RequestMapping("/iseat")
    public JsonBean findIsEat(){
        List<Picture> IsEatList  = pictureService.findIsEatPicture();
        return new JsonBean(1,IsEatList);
    }*/
}