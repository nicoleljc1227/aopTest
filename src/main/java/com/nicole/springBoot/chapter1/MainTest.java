package com.nicole.springBoot.chapter1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xl on 2017/7/31.
 */
public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfigure.class);
        DemoAnnotationService annotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService methodService = context.getBean(DemoMethodService.class);
        annotationService.add();
        methodService.add();
        context.close();
    }
}
