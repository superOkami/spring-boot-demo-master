package com.speed.cool.Controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author ：wj
 * @date ：Created in 2019/12/12 16:33
 * @description：
 * @modified By：
 * @version: version
 */
@Controller
public class ConfigController {

    @NacosValue(value = "${name:123}" , autoRefreshed = true)
    private String name;

    @RequestMapping("/config/name")
    @ResponseBody
    public String name(){
        return name;
    }
}