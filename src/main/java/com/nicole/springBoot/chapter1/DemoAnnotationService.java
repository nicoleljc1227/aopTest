package com.nicole.springBoot.chapter1;

import org.springframework.stereotype.Service;

/**
 * Created by xl on 2017/7/31.
 * 使用注解的呗拦截类
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){

    }
}
