package com.qfedu.dao;

import com.qfedu.pojo.Menu;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/25.
 */
public interface MenuDao {
    public List<Menu> findAll(); //  能不能吃 ，食谱 ，收藏 菜单
    public List<Menu> findAll02 ();  // 主食 ，肉类等
}
