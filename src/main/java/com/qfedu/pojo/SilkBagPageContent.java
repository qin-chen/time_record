package com.qfedu.pojo;

/**
 * Created by 星尘 on 2019/6/22.
 */
public class SilkBagPageContent {
    private Integer silkBagContentId;
    private String  imgpath;
    private String content;
    private Integer readcount;

    public Integer getSilkBagContentId() {
        return silkBagContentId;
    }

    public void setSilkBagContentId(Integer silkBagContentId) {
        this.silkBagContentId = silkBagContentId;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getReadcount() {
        return readcount;
    }

    public void setReadcount(Integer readcount) {
        this.readcount = readcount;
    }
}