package com.qfedu.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2019/6/28 0028.
 */
public class ShopComment {
    private Integer id;
    private String shopComment;
    private Integer shopScore;
    private Date createTime;
    private String userName;
    private String headPhoto;
    private String shopPictrue;
    private String merchantComment;

    @Override
    public String toString() {
        return "ShopComment{" +
                "id=" + id +
                ", shopComment='" + shopComment + '\'' +
                ", shopScore=" + shopScore +
                ", createTime=" + createTime +
                ", userName='" + userName + '\'' +
                ", headPhoto='" + headPhoto + '\'' +
                ", shopPictrue='" + shopPictrue + '\'' +
                ", merchantComment='" + merchantComment + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopComment() {
        return shopComment;
    }

    public void setShopComment(String shopComment) {
        this.shopComment = shopComment;
    }

    public Integer getShopScore() {
        return shopScore;
    }

    public void setShopScore(Integer shopScore) {
        this.shopScore = shopScore;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto;
    }

    public String getShopPictrue() {
        return shopPictrue;
    }

    public void setShopPictrue(String shopPictrue) {
        this.shopPictrue = shopPictrue;
    }

    public String getMerchantComment() {
        return merchantComment;
    }

    public void setMerchantComment(String merchantComment) {
        this.merchantComment = merchantComment;
    }
}