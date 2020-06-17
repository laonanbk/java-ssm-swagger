package com.learning.ssm_swagger.modules.system.domain.vo;

import lombok.Data;

/**
 * 修改密码使用的vo类
 * @Author Qizy
 * @Date 2020/6/17 9:05
 * @Version 1.0
 **/
@Data
public class UserPassVo {

    private String oldPass;

    private String newPass;
}
