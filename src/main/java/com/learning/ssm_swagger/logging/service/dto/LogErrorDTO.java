package com.learning.ssm_swagger.logging.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 错误日志dto(数据传递对象)
 * @Author Qizy
 * @Date 2020/6/16 15:58
 * @Version 1.0
 */
@Data
public class LogErrorDTO implements Serializable {

    private Long id;

    private String username;

    private String description;

    private String method;

    private String params;

    private String browser;

    private String requestIp;

    private String address;

    private Timestamp createTime;
}
