package com.qfedu.dao;

import com.qfedu.pojo.Picture;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/21.
 */
public interface PictureDao {
    public Picture findPictureById(List<Integer> picId);
    public List<Picture> findAllPicture();
    public List<Picture> findAllFoodListPicture();

    List<Picture> findIsEatPicture();
}
