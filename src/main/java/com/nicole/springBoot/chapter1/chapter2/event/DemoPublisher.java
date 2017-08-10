package com.nicole.springBoot.chapter1.chapter2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by xl on 2017/8/10.
 */
@Component
public class DemoPublisher {//事件法布类
    @Autowired
    private ApplicationContext applicationContext;//注入此用来发布事件
    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));//发布事件
    }
}
