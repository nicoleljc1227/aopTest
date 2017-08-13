package com.nicole.springBoot.chapter1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by xl on 2017/7/31.
 */
@Configuration
@ComponentScan("com.nicole.springBoot.chapter1")
@EnableAspectJAutoProxy// 开启spring对AspectJ的支持
public class AopConfigure {

}
