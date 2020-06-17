package com.learning.ssm_swagger.logging.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 日志实体类
 * @Author Qizy
 * @Date 2020/6/16 15:58
 * @Version 1.0
 */
@Entity
@Data
@Table(name = "log")
@NoArgsConstructor
public class Log implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 操作用户 */
    private String username;

    /** 描述 */
    private String description;

    /** 方法名 */
    private String method;

    /** 参数 */
    @Column(columnDefinition = "text")
    private String params;

    /** 日志类型 */
    @Column(name = "log_type")
    private String logType;

    /** 请求ip */
    @Column(name = "request_ip")
    private String requestIp;

    /** 地址 */
    @Column(name = "address")
    private String address;

    /** 浏览器  */
    private String browser;

    /** 地区  */
    private String area;

    /** 省份  */
    private String province;

    /** 城市  */
    private String city;

    /** 网络提供商  */
    private String isp;

    /** 请求耗时 */
    private Long time;

    /** 异常详细  */
    @Column(name = "exception_detail", columnDefinition = "text")
    private byte[] exceptionDetail;

    /** 创建日期 */
    @CreationTimestamp
    @Column(name = "create_time")
    private Timestamp createTime;

    public Log(String logType, Long time) {
        this.logType = logType;
        this.time = time;
    }
}
