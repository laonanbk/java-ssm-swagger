package com.learning.ssm_swagger.common.exception;

import org.apache.commons.lang3.StringUtils;

/**
 * 实体对象已经存在错误
 * @Author Qizy
 * @Date 2020/6/16 16:03
 * @Version 1.0
 **/
public class EntityExistException extends RuntimeException{

    public EntityExistException(Class clazz, String field, String val) {
        super(EntityExistException.generateMessage(clazz.getSimpleName(), field, val));
    }

    private static String generateMessage(String entity, String field, String val) {
        return StringUtils.capitalize(entity)
                + " with " + field + " " + val + " existed";
    }
}
