package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/26 0026.
 */
public class Shop {
    private Integer sid;
    private String sname;
    private Integer shopid;
    private Integer sprice;
    private Integer sminprice;
    private String designer;
    private Integer colorId;
    private String texture;
    private String goodAge;
    private String goodComment;
    private Integer shopStatus;
    private Picture picture;
    private Color color;

    @Override
    public String toString() {
        return "Shop{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", shopid=" + shopid +
                ", sprice=" + sprice +
                ", sminprice=" + sminprice +
                ", designer='" + designer + '\'' +
                ", colorId=" + colorId +
                ", texture='" + texture + '\'' +
                ", goodAge='" + goodAge + '\'' +
                ", goodComment='" + goodComment + '\'' +
                ", shopStatus=" + shopStatus +
                ", picture=" + picture +
                ", color=" + color +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getSprice() {
        return sprice;
    }

    public void setSprice(Integer sprice) {
        this.sprice = sprice;
    }

    public Integer getSminprice() {
        return sminprice;
    }

    public void setSminprice(Integer sminprice) {
        this.sminprice = sminprice;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getGoodAge() {
        return goodAge;
    }

    public void setGoodAge(String goodAge) {
        this.goodAge = goodAge;
    }

    public String getGoodComment() {
        return goodComment;
    }

    public void setGoodComment(String goodComment) {
        this.goodComment = goodComment;
    }

    public Integer getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(Integer shopStatus) {
        this.shopStatus = shopStatus;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}