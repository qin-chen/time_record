package com.qfedu.pojo;

/**
 * Created by 星尘 on 2019/6/22.
 */
public class FoodListContent {
    private Integer foodListId;
    private String foodListImgpath;
    private String foodListContent;
    private String foodListContentDetail;
    private String suitAge;
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

    public String getFoodListContentDetail() {
        return foodListContentDetail;
    }

    public void setFoodListContentDetail(String foodListContentDetail) {
        this.foodListContentDetail = foodListContentDetail;
    }

    public String getSuitAge() {
        return suitAge;
    }

    public void setSuitAge(String suitAge) {
        this.suitAge = suitAge;
    }
}