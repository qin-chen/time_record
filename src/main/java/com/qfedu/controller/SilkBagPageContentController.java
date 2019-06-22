package com.qfedu.controller;

import com.qfedu.pojo.SilkBagPageContent;
import com.qfedu.service.SilkBagPageContentService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/22.
 */

@CrossOrigin
@Controller
@RequestMapping("/silkBagPageContent")
public class SilkBagPageContentController {
    @Autowired
    private SilkBagPageContentService silkBagPageContentService;

    @RequestMapping("/showPageContent")
    @ResponseBody
    public JsonBean findAll(){
        List<SilkBagPageContent> pageContentList = silkBagPageContentService.findAll();
        return new JsonBean(1,pageContentList);
    }
}