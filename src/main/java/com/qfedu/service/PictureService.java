package com.qfedu.service;

import com.qfedu.pojo.Picture;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/21.
 */
public interface PictureService {
    public Picture findPictureById(List<Integer> pid);
    public List<Picture> findAllPicture();
    public List<Picture> findAllFoodListPicture();

    List<Picture> findIsEatPicture();
}
