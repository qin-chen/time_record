package com.qfedu.service;

import com.qfedu.pojo.Article;
import com.qfedu.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2019/6/22 0022.
 */
public interface ArticleService {
    List<Article> findAllArticle(Integer id);

    List<User> findAlluserAll12(Integer id);

    void addFocusById(Integer uid, Integer fid);
}
