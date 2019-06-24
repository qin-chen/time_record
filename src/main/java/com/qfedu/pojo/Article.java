package com.qfedu.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2019/6/22 0022.
 */
public class Article {
    private Integer aid;
    private String article;
    private Integer uid;
    private Date createtime;
    private User user;

    @Override
    public String toString() {
        return "Article{" +
                "aid=" + aid +
                ", article='" + article + '\'' +
                ", uid=" + uid +
                ", createtime=" + createtime +
                ", user=" + user +
                '}';
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}