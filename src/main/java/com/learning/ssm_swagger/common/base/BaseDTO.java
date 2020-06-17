package com.learning.ssm_swagger.common.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 公共的基础DTO类
 * @Author Qizy
 * @Date 2020/6/16 15:48
 * @Version 1.0
 **/
@Getter
@Setter
public class BaseDTO implements Serializable {

    private Boolean isDelete;

    private Timestamp createTime;

    private Timestamp updateTime;

    @Override
    public String toString() {
        return "BaseDTO{" +
                "isDelete=" + isDelete +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
