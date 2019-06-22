package com.qfedu.vo;

/**
 * Created by 星尘 on 2019/6/21.
 */
public class JsonBean {
    private Integer code;
    private Object msg;

    public JsonBean(){

    }
    public JsonBean (Integer code, Object msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }
}