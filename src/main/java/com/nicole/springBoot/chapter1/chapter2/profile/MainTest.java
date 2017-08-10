package com.nicole.springBoot.chapter1.chapter2.profile;

import com.nicole.springBoot.chapter1.AopConfigure;
import com.nicole.springBoot.chapter1.DemoAnnotationService;
import com.nicole.springBoot.chapter1.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by xl on 2017/7/31.
 */
public class MainTest {

    public static void main(String[] args) {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
       // GenericXmlApplicationContext context = new GenericXmlApplicationContext();

       context.getEnvironment().setActiveProfiles("dev");//先将活动的Profile设置为prod
        //context.registerBeanDefinition(ProfileConfig.class);
        context.register(ProfileConfig.class);//后置注册bean配置类不然会报错 bean未定义的错误
        context.refresh();//刷新容器

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}
