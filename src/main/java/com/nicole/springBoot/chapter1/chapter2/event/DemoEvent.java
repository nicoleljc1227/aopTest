package com.nicole.springBoot.chapter1.chapter2.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

/**
 * Created by xl on 2017/8/10.
 */
public class DemoEvent extends ApplicationEvent {

    private static final long SerialVersionUIO = 1L;
    private String msg;
    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
