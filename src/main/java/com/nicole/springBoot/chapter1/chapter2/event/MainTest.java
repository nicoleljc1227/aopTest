package com.nicole.springBoot.chapter1.chapter2.event;

import com.nicole.springBoot.chapter1.AopConfigure;
import com.nicole.springBoot.chapter1.DemoAnnotationService;
import com.nicole.springBoot.chapter1.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xl on 2017/7/31.
 */
public class MainTest {

    //类似于观察者模式，事件监听器来监听事件发布者，一旦事件发布者发布内容，就发送消息给监听者
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();
    }
}
