package com.learning.ssm_swagger.logging.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 日志DTO
 * @Author Qizy
 * @Date 2020/6/16 15:58
 * @Version 1.0
 */
@Data
public class LogSmallDTO implements Serializable {

    private String description;

    private String requestIp;

    private Long time;

    private String address;

    private String browser;

    private Timestamp createTime;
}
