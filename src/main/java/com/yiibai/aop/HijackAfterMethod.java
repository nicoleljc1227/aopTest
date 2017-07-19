package com.yiibai.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by xl on 2017/6/13.
 * 返回之后通知
 */
public class HijackAfterMethod implements AfterReturningAdvice{


    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("HijackAfterMethod : After method hijacked!");
    }
}
