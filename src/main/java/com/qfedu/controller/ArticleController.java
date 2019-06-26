package com.qfedu.controller;


import com.qfedu.pojo.Article;
import com.qfedu.pojo.User;
import com.qfedu.service.ArticleService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/6/22 0022.
 */
@CrossOrigin
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @RequestMapping("/articleAll.do")//查询所有文章
    public JsonBean findAllArticle(Integer id,Integer status){
        List<Article> list = articleService.findAllArticle(id,status);
        return new JsonBean(1,list);
    }
    @RequestMapping("/userAll12.do")//查询所有需要关注的人
    public JsonBean findAlluserAll12(Integer id){
        List<User> list = articleService.findAlluserAll12(id);
        return new JsonBean(1,list);
    }
    @RequestMapping("/addFocus.do")
    public JsonBean addFocusById(Integer uid,String[] fids){
        System.out.println(uid+"****"+fids);
        if(fids != null){
            for(String aid:fids) {
                Integer fid = Integer.parseInt(aid);
                articleService.addFocusById(uid,fid);
            }
        }
        return new JsonBean(1,"关注成功");
    }
}