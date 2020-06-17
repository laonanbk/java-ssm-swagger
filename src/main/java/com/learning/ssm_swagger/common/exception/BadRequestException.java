package com.learning.ssm_swagger.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * 统一异常处理
 * @Author Qizy
 * @Date 2020/6/16 15:58
 * @Version 1.0
 **/
@Getter
public class BadRequestException extends RuntimeException{

    private Integer status = BAD_REQUEST.value();

    public BadRequestException(HttpStatus status, String msg){
        super(msg);
        this.status = status.value();
    }

    public BadRequestException(String msg){
        super(msg);
    }
}
