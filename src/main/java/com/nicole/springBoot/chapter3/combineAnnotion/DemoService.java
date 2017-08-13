package com.nicole.springBoot.chapter3.combineAnnotion;

import org.springframework.stereotype.Service;

/**
 * Created by xl on 2017/8/13.
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得的bean");
    }
}
