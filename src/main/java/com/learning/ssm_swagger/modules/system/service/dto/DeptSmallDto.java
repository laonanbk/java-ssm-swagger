package com.learning.ssm_swagger.modules.system.service.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author Qizy
 * @Date 2020/6/16 15:58
 * @Version 1.0
 */
@Data
public class DeptSmallDto implements Serializable {

    private Long id;

    private String name;
}
