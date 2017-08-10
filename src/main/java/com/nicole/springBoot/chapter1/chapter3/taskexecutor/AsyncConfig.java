package com.nicole.springBoot.chapter1.chapter3.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by xl on 2017/8/10.
 */
@Configuration
@ComponentScan("com.nicole.springBoot.chapter1.chapter3.taskexecutor")
@EnableAsync
public class AsyncConfig implements AsyncConfigurer{//配置类实现AsyncConfigurer接口


    public Executor getAsyncExecutor() {//重写

        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);//
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(25);
        executor.initialize();

        return executor;
    }

    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
