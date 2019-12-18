package com.speed.cool.Controller;

import com.speed.cool.Dao1.Db1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wj
 * @date 2019/8/210:22
 */
@Slf4j
@Controller
@RequestMapping("/hello")
public class aaaa<cmt> {
    @Autowired
    Db1 db1;
    @RequestMapping("/get")
    @ResponseBody
    public Object te(){
       Integer count = db1.get();
        System.out.println("1131");
       return count;
    }
    /**
     * @throws
     * @Description:
     * @Param: [a, ss]
     * @return: java.lang.String
     * @Author: wj
     * @Date: 2019/8/19 12:00
     * @since
     */
    @RequestMapping("/try")
    public String get(String a, String ss) {
        return "hello";
    }

    /**
     * @Description:
     * @Param: []
     * @return: java.lang.String
     * @throws:
     * @Author: wj
     * @Date: 2019/8/21 17:29
     * @since
     */
    @RequestMapping("/tab")
    public String tab() {
        return "tab";
    }


    @RequestMapping("/mods")
    public String mod() {
        return "mods";
    }

    @RequestMapping("/table")
    public String table() {
        return "table/table";
    }

    @RequestMapping("/houtai")
    public String houtai() {
        return "houtai";
    }

    @RequestMapping("/hi")
    public String hi() {
        return "table/hello";
    }

    @RequestMapping("/form")
    public String form() {
        return "form";
    }

    @RequestMapping("/element")
    public String element() {
        return "element";
    }

    @RequestMapping("/progress")
    public String progress() {
        return "progress";
    }

    @RequestMapping("/card")
    public String card() {
        return "card";
    }

    @RequestMapping("/table2")
    public String table2() {
        return "table2";
    }

    @RequestMapping("/badge")
    public String badge() {
        return "badge";
    }

    @RequestMapping("/layer")
    public String layer() {
        return "layer";
    }

    @RequestMapping("/btn")
    public String btn() {
        return "btn";
    }

    @RequestMapping("/tips")
    public String tips() {
        return "tips";
    }

    public static void main(String[] args) {
        log.error("error");
        log.info("123231");
        log.debug("debug");
    }

}
