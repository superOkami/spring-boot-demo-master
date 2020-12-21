package com.speed.cool.Controller;

import org.springframework.scheduling.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.Future;


//@Component注解用于对那些比较中立的类进行注释；
//相对与在持久层、业务层和控制层分别采用 @Repository、@Service 和 @Controller 对分层中的类进行注释
@Component
@EnableScheduling   // 1.开启定时任务
@EnableAsync        // 2.开启多线程
public class MultithreadScheduleTask {

//    @Async
//    @Scheduled(fixedDelay = 1000)  //间隔1秒
//    public void first() throws InterruptedException {
//        System.out.println("第一个定时任务开始 : " + LocalDateTime.now().toLocalTime() + "\r\n线程 : " + Thread.currentThread().getName());
//        System.out.println();
//        Thread.sleep(1000 * 10);
//    }
//
//    @Async
//    @Scheduled(fixedDelay = 2000)
//    public void second() {
//        System.out.println("第二个定时任务开始 : " + LocalDateTime.now().toLocalTime() + "\r\n线程 : " + Thread.currentThread().getName());
//        System.out.println();
//    }

//    @Async
//    @Scheduled(fixedDelay = 2000)
//    public Future<String> asyncMethodWithReturnType() {
//        System.out.println("Execute method asynchronously - "  + Thread.currentThread().getName());
//        try {
//            Thread.sleep(5000);
//            return new AsyncResult<String>("hello world !!!!");
//        } catch (InterruptedException e) {
//            //
//        }
//
//        return null;
//    }
}
