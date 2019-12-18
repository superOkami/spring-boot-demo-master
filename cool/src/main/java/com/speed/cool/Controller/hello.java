package com.speed.cool.Controller;

import com.speed.cool.Dao1.Db1;
import com.speed.cool.Dao2.Db2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@Slf4j
public class hello {
    @Resource
    Db1 db1;
    @Resource
    Db2 db2;

    /**
     * @return
     */
    @RequestMapping("/hello")
    public String get() {
        //Map m = new HashMap();
        //m = db1.hh();
        //Integer c = db1.get();
        //Integer c1 = db2.get();
        //log.info(m.toString());
        //System.out.println("热部署666");
        //System.out.println("hhhhh");
        log.info("info----------test");
        return "hello";
    }

    /**
     *
     */
    public void crev() {

    }
}
