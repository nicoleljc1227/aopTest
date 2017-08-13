package com.nicole.springBoot.chapter3.combineAnnotion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();


    }
}
