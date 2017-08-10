package com.nicole.springBoot.chapter1.chapter2.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by xl on 2017/8/10.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {//实现该接口并指定监听类型
    public void onApplicationEvent(DemoEvent event) {//对消息进行接受处理
        String msg = event.getMsg();
        System.out.println("我bean-demoListener,接收到了bean-demo publisher发布的消息"+msg);


    }

}
