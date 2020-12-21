package com.speed.cool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@EnableTransactionManagement
@SpringBootApplication
public class CoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoolApplication.class, args);
    }

}

// public class CoolApplication extends SpringBootServletInitializer {
//
//    public static void main(String[] args) {
//
//        SpringApplication.run(CoolApplication.class, args);
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        // 注意这里要指向原先用main方法执行的Application启动类
//        return builder.sources(CoolApplication.class);
//    }
//
//
//    }
