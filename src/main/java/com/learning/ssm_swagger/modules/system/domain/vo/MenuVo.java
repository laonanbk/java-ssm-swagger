package com.learning.ssm_swagger.modules.system.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 构建前端路由的时候用到的视图
 * @Author Qizy
 * @Date 2020/6/17 8:59
 * @Version 1.0
 * @JsonInclude(JsonInclude.Include.NON_EMPTY)注解用来防止返回值为空
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MenuVo implements Serializable {

    private String name;

    /**路由路径*/
    private String path;

    /**是否隐藏*/
    private Boolean hidden;

    /**跳转方式*/
    private String redirect;

    /**组件名称*/
    private String component;

    /**是否显示*/
    private Boolean alwaysShow;

    /**meta*/
    private MenuMetaVo meta;

    /**子菜单*/
    private List<MenuVo> children;
}
