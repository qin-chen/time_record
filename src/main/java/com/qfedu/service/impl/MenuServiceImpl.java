package com.qfedu.service.impl;

import com.qfedu.dao.MenuDao;
import com.qfedu.pojo.Menu;
import com.qfedu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/25.
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDao menuDao;
    @Override
    public List<Menu> findAll() {
        List<Menu> menuList = menuDao.findAll();

        return menuList;
    }

    @Override
    public List<Menu> findAll02() {
        List<Menu> menuList = menuDao.findAll02();
        return menuList;
    }
}