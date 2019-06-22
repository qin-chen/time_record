package com.qfedu.service.impl;

import com.qfedu.dao.SilkBagPageContentDao;
import com.qfedu.pojo.SilkBagPageContent;
import com.qfedu.service.SilkBagPageContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/22.
 */
@Service
public class SilkBagPageContentServiceImpl implements SilkBagPageContentService{
    @Autowired
    private SilkBagPageContentDao silkBagPageContentDao;
    @Override
    public List<SilkBagPageContent> findAll() {
        List<SilkBagPageContent> silkBagPageContentList = silkBagPageContentDao.findAll();

        return silkBagPageContentList;
    }
}