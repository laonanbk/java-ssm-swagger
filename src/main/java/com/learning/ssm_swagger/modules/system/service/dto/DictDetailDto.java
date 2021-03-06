package com.learning.ssm_swagger.modules.system.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

/**功能描述：字典详情DTO
 * @Author Qizy
 * @Date 2020/6/16 15:58
 * @Version 1.0
 */
@Getter
@Setter
public class DictDetailDto implements Serializable {

    private Long id;

    private String label;

    private String value;

    private String sort;

    private DictSmallDto dict;

    private Timestamp createTime;
}
