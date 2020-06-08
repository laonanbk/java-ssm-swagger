package com.learning.ssm_swagger.entity.base;

/**
 * @Author Qizy
 * @Date 2019/11/27 11:15
 * @Version 1.0
 **/
public class Result {
    //响应码
    private int code;

    public Result(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
