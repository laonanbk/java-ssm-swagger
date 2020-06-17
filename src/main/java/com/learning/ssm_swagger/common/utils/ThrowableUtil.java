package com.learning.ssm_swagger.common.utils;

import com.learning.ssm_swagger.common.exception.BadRequestException;

import javax.validation.ConstraintViolationException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 异常工具类
 * @Author Qizy
 * @Date 2020/6/16 16:35
 * @Version 1.0
 **/
public class ThrowableUtil {

    /**
     * 获取堆栈信息
     * @param throwable
     * @return
     */
    public static String getStackTrace(Throwable throwable) {
        StringWriter sw = new StringWriter();
        try (PrintWriter pw = new PrintWriter(sw)){
            throwable.printStackTrace(pw);
            return sw.toString();
        }
    }

    /**
     * 删除异常
     * @param e
     * @param msg
     */
    public static void throwForeignKeyException(Throwable e, String msg) {
        Throwable t = e.getCause();
        while ((t != null) && !(t instanceof ConstraintViolationException)){
            t = t.getCause();
        }
        if(t != null){
            throw new BadRequestException(msg);
        }
        assert false;
        throw new BadRequestException("删除失败：" + t.getMessage());
    }

}
