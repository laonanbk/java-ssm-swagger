package com.learning.ssm_swagger.common.exception;

import org.apache.commons.lang3.StringUtils;

/**
 * 实体对象找不到异常
 * @Author Qizy
 * @Date 2020/6/16 16:08
 * @Version 1.0
 **/
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(Class clazz, String field, String val) {
        super(EntityNotFoundException.generateMessage(clazz.getSimpleName(), field, val));
    }

    private static String generateMessage(String entity, String field, String val) {
        return StringUtils.capitalize(entity)
                + " with " + field + " " + val + " does not exist";
    }
}
