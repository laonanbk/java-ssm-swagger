package com.learning.ssm_swagger.entity.user;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class User {
    private String id;

    private Integer age;

    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty(value = "用户name")
    private String name;

    @NotBlank(message = "密码不能为空")
    @ApiModelProperty(value = "用户password")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
