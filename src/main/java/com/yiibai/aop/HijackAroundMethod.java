package com.yiibai.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by xl on 2017/6/13.
 * 环绕通知。必须调用“methodInvocation.proceed();” 继续在原来的方法执行，否则原来的方法将不会执行。
 */
public class HijackAroundMethod implements MethodInterceptor{


    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Method name : "+methodInvocation.getMethod().getName());
        System.out.println("Method arguments : "+ Arrays.toString(methodInvocation.getArguments()));
        // same with MethodBeforeAdvice
        System.out.println("HijackAroundMethod : Before method hijacked!");
        try{
            // proceed to original method call
            Object result = methodInvocation.proceed();
            // same with AfterReturningAdvice
            System.out.println("HijackAroundMethod : Before after hijacked!");

            return result;
        }catch (IllegalArgumentException e){
            // same with ThrowsAdvice
            System.out.println("HijackAroundMethod : Throw exception hijacked!");
            throw e;
        }
    }
}
