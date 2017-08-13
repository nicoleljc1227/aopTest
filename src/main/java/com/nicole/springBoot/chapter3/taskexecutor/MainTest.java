package com.nicole.springBoot.chapter3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring 通过任务执行器TaskExecutor来实现多线程和并发编程。使用ThreaPoolTaskExecutor可实现一个线程池TaskExecutor
 * 一般开发中任务是异步的，所以需要在配置类中通过@EnableAsync开启对异步任务的支持 并实际执行Bean中的方法使用@Async注解来声明其是一个异步任务
 */
public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsyncConfig.class);
        AyncTaskService service = context.getBean(AyncTaskService.class);
        for (int i = 0; i <10 ; i++) {
            service.executeAsyncTask(i);
            service.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
