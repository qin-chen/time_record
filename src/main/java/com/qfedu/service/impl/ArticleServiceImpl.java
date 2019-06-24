package com.qfedu.service.impl;

import com.qfedu.dao.ArticleDao;
import com.qfedu.pojo.Article;
import com.qfedu.pojo.User;
import com.qfedu.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/22 0022.
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<Article> findAllArticle(Integer id) {
        return articleDao.findAllArticle(id);
    }

    @Override
    public List<User> findAlluserAll12(Integer id) {
        return articleDao.findAlluserAll12(id);
    }

    @Override
    public void addFocusById(Integer uid, Integer fid) {
        articleDao.addFocusById(uid,fid);
    }
}