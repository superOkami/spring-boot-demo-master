package com.speed.cool.Demo.Stream;

import org.junit.Test;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author ：wj
 * @date ：Created in 2019/10/17 17:14
 * @description：
 * @modified By：
 * @version: version
 */
public class Demo {

    @Test
    public void test(){
        Student stuA = new Student(1, "A", "M", 184);
        Student stuB = new Student(2, "B", "G", 163);
        Student stuC = new Student(3, "C", "M", 175);
        Student stuD = new Student(4, "D", "G", 158);
        Student stuE = new Student(5, "E", "M", 170);
        List<Student> list = new ArrayList<>();
        list.add(stuA);
        list.add(stuB);
        list.add(stuC);
        list.add(stuD);
        list.add(stuE);
        //for(int i = 0;i<list.size();i++){
        //    Student student = list.get(i);
        //    if (student.getSex().equals("G")){
        //        System.out.println(student);
        //    }
        //}
        //Iterator进行迭代
        Iterator<Student> iterator = list.iterator();
        //while (iterator.hasNext()){
        //    Student student = iterator.next();
        //    if (student.getSex().equals("G")){
        //        System.out.println(student);
        //    }
        //}
        //Java 8中，可以采用聚合操作：
        list.stream().filter(student -> student.getSex().equals("G")).forEach(student -> System.out.println(student));
        boolean b = list.stream().noneMatch(student -> student.getSex().equals("M"));
        System.out.println(b);
        Stream<Double> generateA = Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return java.lang.Math.random();
            }
        });

        Stream<Double> generateB = Stream.generate(()-> java.lang.Math.random());
        Stream<Double> generateC = Stream.generate(java.lang.Math::random);

        Stream<Integer> integerStream = Stream.of(1,2,3,4);
        integerStream.forEach(integer -> System.out.println(integer));

        Stream.iterate(1,item ->item+1).limit(10).forEach(System.out::println);

        int [] ids = new  int[]{1,2,3,4};
        Arrays.stream(ids).forEach(System.out::println);

        Stream.concat(Stream.of(1,2,3),Stream.of(5,3,2)).forEach(System.out::print);

        Stream.of(0,1,23,42,4,2,3,2).distinct()
                .forEach(System.out::println);
        Stream.of(1,2,3,4,5,6).filter(integer -> integer>3).forEach(System.out::print);
        Stream.of(1,2,3,4,5,6).filter(item -> item>3).forEach(System.out::println);


        Stream.of("a","b","c").map(s -> s.toUpperCase()).forEach(System.out::println);

        Stream.of(1,2,4).flatMap(integer1->Stream.of(integer1*10)).forEach(System.out::println);

        Stream.of(1,3,5,7,3,9).peek(integer -> System.out.println("appect:"+integer)).forEach(System.out::println);

        Stream.of(1,2,5,73,74,7,"44").skip(3).forEach(System.out::println);
        Stream.of(1,2,5,73,74,7,44).sorted().forEach(System.out::println);

        Stream.of(5, 4, 3, 2, 1)
                .sorted()
                .forEach(System.out::println);
        // 打印结果
        // 1，2，3,4,5

        Stream.of(1, 2, 3, 4, 5)
                .sorted((o1, o2) -> o2 - o1).forEach(System.out::println);
        // 5, 4, 3, 2, 1
        Optional<Integer> max = Stream.of(1, 2, 3, 4, 5)
                .max((o1, o2) -> o2 - o1);
        System.out.println("max:" + max.get());// 打印结果：max:1

        Optional<Integer> max2 = Stream.of(1, 2, 3, 4, 5)
                .min((o1, o2) -> o2 - o1);
        System.out.println("min:" + max2.get());// 打印结果：max:1

        Optional<Integer> max1 = Stream.of(1, 2, 3, 4, 5)
                .max((o1, o2) -> o2 - o1);
        System.out.println("max:" + max1.get());// 打印结果：min:5

        Optional<Integer> any = Stream.of(11, 2, 3, 4).findFirst();
        System.out.println("any"+any);

    }


}
