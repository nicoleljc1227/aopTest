package com.nicole.springBoot.chapter1.chapter2.scope;

import com.nicole.springBoot.chapter1.AopConfigure;
import com.nicole.springBoot.chapter1.DemoAnnotationService;
import com.nicole.springBoot.chapter1.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xl on 2017/7/31.
 */
public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        SingletonBean s1 = context.getBean(SingletonBean.class);
        SingletonBean s2 = context.getBean(SingletonBean.class);

        DemoPrototypeService s3 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService s4 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1与s2是否相等"+s1.equals(s2));
        System.out.println("s3与s4是否相等"+s3.equals(s4));

        context.close();

    }
}
