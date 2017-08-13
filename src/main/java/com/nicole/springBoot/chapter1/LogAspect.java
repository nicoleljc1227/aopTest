package com.nicole.springBoot.chapter1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by xl on 2017/7/31.
 */
@Aspect //声明切面
@Component //让此切面成为spring容器管理的bean
public class LogAspect {

    @Pointcut("@annotation(com.nicole.springBoot.chapter1.Action)")//声明切点
    public void annotationPointCut(){};

    @After("annotationPointCut()")//声明一个建言 并使用@PointCUt定义的切点
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截"+ action.name());//通过反射可以获得注解上的属性，然后做日志记录相关的操作

    }

    //第一个*后面要有空格
    @Before("execution(* com.nicole.springBoot.chapter1.DemoMethodService.*(..))")//声明一个建言，次建言直接使用拦截规则作为参数
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截"+method.getName());
    }


}
