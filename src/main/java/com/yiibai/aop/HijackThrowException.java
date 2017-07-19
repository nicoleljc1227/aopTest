package com.yiibai.aop;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by xl on 2017/6/13.
 * 抛出后通知
 */
public class HijackThrowException implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException e) throws Throwable{
        System.out.println("HijackThrowException : Throw exception hijacked!");
    }

}
