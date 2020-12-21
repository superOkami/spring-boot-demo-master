package com.xkcoding.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jmx.support.RegistrationPolicy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>
 * 启动器
 * </p>
 *
 * @package: com.xkcoding.swagger
 * @description: 启动器
 * @author: yangkai.shen
 * @date: Created in 2018-11-29 13:25
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@EnableSwagger2
@Configuration
@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
@SpringBootApplication
public class SpringBootDemoSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoSwaggerApplication.class, args);
    }
}
