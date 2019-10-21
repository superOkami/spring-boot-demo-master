package com.speed.cool.Demo.Stream;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：wj
 * @date ：Created in 2019/10/17 17:11
 * @description：
 * @modified By：
 * @version: version
 */
@Data
public class Student {
    int no;
    String name;
    String sex;
    float height;

    public Student(int no, String name, String sex, float height) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.height = height;
    }

}


