package com.qfedu.pojo;

/**
 * Created by 星尘 on 2019/6/21.
 */
public class User {
    private Integer uid;
    private String username;
    private String password;
    private String email;
    private Integer status;
    private Integer babyage;
    private Integer fanscount;
    private Integer focuscount;
    private String headphoto;
    private String babyname;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBabyage() {
        return babyage;
    }

    public void setBabyage(Integer babyage) {
        this.babyage = babyage;
    }

    public Integer getFanscount() {
        return fanscount;
    }

    public void setFanscount(Integer fanscount) {
        this.fanscount = fanscount;
    }

    public Integer getFocuscount() {
        return focuscount;
    }

    public void setFocuscount(Integer focuscount) {
        this.focuscount = focuscount;
    }

    public String getHeadphoto() {
        return headphoto;
    }

    public void setHeadphoto(String headphoto) {
        this.headphoto = headphoto;
    }

    public String getBabyname() {
        return babyname;
    }

    public void setBabyname(String babyname) {
        this.babyname = babyname;
    }
}