package com.nicole.springBoot.chapter3.conditional;

import com.nicole.springBoot.chapter3.taskexecutor.AsyncConfig;
import com.nicole.springBoot.chapter3.taskexecutor.AyncTaskService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")
        +"系统下列表命令为:"
        +listService.showListCmd());
    }
}
