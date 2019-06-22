package com.qfedu.controller;

import com.qfedu.pojo.Picture;
import com.qfedu.service.PictureService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/21.
 */
@Controller
@RequestMapping("/picture")
public class PictureController {
    @Autowired
    private PictureService pictureService;
    @RequestMapping("/pictureall")
    @ResponseBody
    public JsonBean findAllPicture(){
       List<Picture> pictureList = pictureService.findAllPicture();
       return new JsonBean(1,pictureList);
   }
}