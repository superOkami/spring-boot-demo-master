package com.speed.cool;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

//@EnableTransactionManagement
@SpringBootApplication
//@NacosPropertySource(dataId = "example",groupId = "cool",autoRefreshed = true)
public class CoolApplication {

    @NacosInjected
    private NamingService namingService;

    @NacosValue("${server.port}")
    private int serverPort;

    @NacosValue("${spring.application.name}")
    private String applicationName;


    @PostConstruct
    public void registerInstance() throws NacosException {
        namingService.registerInstance(applicationName, "127.0.0.1", serverPort, "DEFAULT");
    }


    public static void main(String[] args) {
        SpringApplication.run(CoolApplication.class, args);
    }

}



//以下配置外部tomcat启动
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
