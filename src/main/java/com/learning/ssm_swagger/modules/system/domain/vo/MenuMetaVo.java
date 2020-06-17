package com.learning.ssm_swagger.modules.system.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * menu 菜单的vo类 （vo:视图对象类）
 * @Author Qizy
 * @Date 2020/6/17 8:57
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
public class MenuMetaVo implements Serializable {

    private String title;

    private String icon;

    private Boolean noCache;
}
