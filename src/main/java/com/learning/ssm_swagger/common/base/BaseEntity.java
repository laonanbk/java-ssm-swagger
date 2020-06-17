package com.learning.ssm_swagger.common.base;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * 公共的基础实体类
 * @Author Qizy
 * @Date 2020/6/16 15:50
 * @Version 1.0
 **/
@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Column(name = "is_delete", columnDefinition = "bit default 0")
    private Boolean isDelete = false;

    @Column(name = "create_time")
    @CreationTimestamp
    private Timestamp createTime;

    @Column(name = "update_time")
    @UpdateTimestamp
    private Timestamp updateTime;

    /* 限制 当我们需要更新的时候就是必填*/
    public @interface Update{}

    @Override
    public String toString() {
        return "BaseEntity{" +
                "isDelete=" + isDelete +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
