package com.speed.cool.Demo.Stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author ：wj
 * @date ：Created in 2019/10/16 9:23
 * @description： stream 使用
 * @modified By：
 * @version: version
 */
public class StreamDemo {


    /**
     * map 方法用于映射每个元素到对应的结果，以下代码片段使用 map 输出了元素对应的平方数：
     */
    @Test
    public void map(){
       List<Integer> numbers = Arrays.asList(3,2,3,5,2,3);
       //获取对应的平方数
        List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);
    }
    /**
     *
     */
    @Test
    public void flow(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);
    }
    /**
     *Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。以下代码片段使用 forEach 输出了10个随机数：
     */
    @Test
    public void forEach(){
        Random random = new Random();
        //random.ints().limit(10).forEachOrdered(System.out::   println);
        random.ints().limit(10).forEach(System.out::println);
    }
}
