package com.qfedu.pojo;

/**
 * Created by 星尘 on 2019/6/26.
 */
public class Food {
    private Integer fid;
    private String fname;
    private String fstage1;
    private String fstage2;
    private String fstage3;
    private String fadvice;
    private String fimgpath;
    private FoodListComment foodListComment;
    private FoodListContent foodListContent;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFstage1() {
        return fstage1;
    }

    public void setFstage1(String fstage1) {
        this.fstage1 = fstage1;
    }

    public String getFstage2() {
        return fstage2;
    }

    public void setFstage2(String fstage2) {
        this.fstage2 = fstage2;
    }

    public String getFstage3() {
        return fstage3;
    }

    public void setFstage3(String fstage3) {
        this.fstage3 = fstage3;
    }

    public String getFadvice() {
        return fadvice;
    }

    public void setFadvice(String fadvice) {
        this.fadvice = fadvice;
    }

    public String getFimgpath() {
        return fimgpath;
    }

    public void setFimgpath(String fimgpath) {
        this.fimgpath = fimgpath;
    }

    public FoodListComment getFoodListComment() {
        return foodListComment;
    }

    public void setFoodListComment(FoodListComment foodListComment) {
        this.foodListComment = foodListComment;
    }

    public FoodListContent getFoodListContent() {
        return foodListContent;
    }

    public void setFoodListContent(FoodListContent foodListContent) {
        this.foodListContent = foodListContent;
    }
}