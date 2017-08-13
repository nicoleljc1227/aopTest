package com.nicole.springBoot.chapter3.combineAnnotion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by xl on 2017/8/13.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration//组合 @Configuration元注解
@ComponentScan//组合 @ComponentScan元注解
public @interface WiselyConfiguration {
    String[] value() default {};// 覆盖value参数
}
