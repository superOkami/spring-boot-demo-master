package com.speed.cool;

import org.springframework.context.annotation.ImportResource;

/**
 * @author ：wj
 * @date ：Created in 2019/10/12 10:43
 * @description：
 * @modified By：
 * @version: version
 */
public class Test01 {
    public static void main(String[] args) {
        String a = null;
        if (a!=null || !a.equals("")){
            System.out.println("00");
        }
        if (null != a){
            a.toString();
        }
    }
}
