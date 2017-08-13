package com.nicole.springBoot.chapter3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by xl on 2017/8/13.
 */
@Configuration
@ComponentScan("com.nicole.springBoot.chapter3.taskscheduler") //会自动扫到taskscheduler包下的类 比如使用了@service的类就会被 装入bean容器 否则写了@Controller或者@service也没用
@EnableScheduling //开启对计划任务的支持，然后在要执行计划任务的方法上注解@Schedule
public class TaskSchedulerConfig {

}
