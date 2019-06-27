package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/26 0026.
 */
public class Color {
    private Integer colorid;
    private String color;

    @Override
    public String toString() {
        return "Color{" +
                "colorid=" + colorid +
                ", color='" + color + '\'' +
                '}';
    }

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}