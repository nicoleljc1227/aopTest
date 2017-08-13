package com.nicole.springBoot.chapter3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by xl on 2017/8/13.
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)//通过此来声明该方法是计划任务，使用fixedRate属性每隔固定时间执行
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次"+dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 44 14 ? * *")//使用cron可按照指定时间执行，本例指的是每天11点28分执行
    public void fixTimeException(){
        System.out.println("在指定时间 "+dateFormat.format(new Date())+"执行");
    }

}
