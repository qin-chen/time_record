package com.qfedu.pojo;

/**
 * Created by 星尘 on 2019/6/22.
 */
public class FoodListContent {
    private Integer foodListId;
    private String foodListImgpath;
    private String foodListContent;

    public Integer getFoodListId() {
        return foodListId;
    }

    public void setFoodListId(Integer foodListId) {
        this.foodListId = foodListId;
    }

    public String getFoodListImgpath() {
        return foodListImgpath;
    }

    public void setFoodListImgpath(String foodListImgpath) {
        this.foodListImgpath = foodListImgpath;
    }

    public String getFoodListContent() {
        return foodListContent;
    }

    public void setFoodListContent(String foodListContent) {
        this.foodListContent = foodListContent;
    }
}