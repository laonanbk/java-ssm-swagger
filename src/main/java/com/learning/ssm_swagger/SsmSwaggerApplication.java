package com.learning.ssm_swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.learning.ssm_swagger.dao")
public class SsmSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmSwaggerApplication.class, args);
    }

}
