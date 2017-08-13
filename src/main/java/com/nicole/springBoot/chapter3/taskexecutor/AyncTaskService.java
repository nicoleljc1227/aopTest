package com.nicole.springBoot.chapter3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by xl on 2017/8/10.
 */
@Service
public class AyncTaskService {//@Async如果在类级别，表明该类所有方法都是异步方法
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1"+i+1);
    }

}
