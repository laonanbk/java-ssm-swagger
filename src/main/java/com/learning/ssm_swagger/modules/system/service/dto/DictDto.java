package com.learning.ssm_swagger.modules.system.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**功能描述：字典管理DTO
 * @Author Qizy
 * @Date 2020/6/16 15:58
 * @Version 1.0
 */
@Getter
@Setter
public class DictDto implements Serializable {

    private Long id;

    private String name;

    private String remark;

    private List<DictDetailDto> dictDetails;

    private Timestamp createTime;
}
