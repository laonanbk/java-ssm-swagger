package com.learning.ssm_swagger.modules.system.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 字典详情实体类
 * @Author Qizy
 * @Date 2020/6/16 15:58
 * @Version 1.0
 */
@Entity
@Getter
@Setter
@Table(name="dict_detail")
public class DictDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull(groups = Update.class)
    private Long id;

    /** 字典标签 */
    @Column(name = "label",nullable = false)
    private String label;

    /** 字典值 */
    @Column(name = "value",nullable = false)
    private String value;

    /** 排序 */
    @Column(name = "sort")
    private String sort = "999";

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "dict_id")
    private Dict dict;

    @Column(name = "create_time")
    @CreationTimestamp
    private Timestamp createTime;

    public @interface Update {}
}
