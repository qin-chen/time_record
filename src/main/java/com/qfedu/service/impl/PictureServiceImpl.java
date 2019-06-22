package com.qfedu.service.impl;

import com.qfedu.dao.PictureDao;
import com.qfedu.pojo.Picture;
import com.qfedu.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/21.
 */
@Service
public class PictureServiceImpl implements PictureService {
  @Autowired
  private PictureDao pictureDao;
    @Override
    public Picture findPictureById(List<Integer> pid) {
        return null;
    }


    @Override
    public List<Picture> findAllPicture() {
        return pictureDao.findAllPicture();
    }

    @Override
    public List<Picture> findAllFoodListPicture() {
        List<Picture> foodListPicture = pictureDao.findAllFoodListPicture();
        return foodListPicture;
    }
}