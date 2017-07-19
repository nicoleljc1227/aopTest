package com.yiibai.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by xl on 2017/6/13.
 * 之前通知
 */
public class HijackBeforeMethod implements MethodBeforeAdvice{

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("HijackBeforeMethod : Before method hijacked!");
    }
}
