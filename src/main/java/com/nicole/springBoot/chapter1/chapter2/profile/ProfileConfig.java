package com.nicole.springBoot.chapter1.chapter2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by xl on 2017/8/10.
 */

@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from development profile");//profile为dev时实例化devDemoBean
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return  new DemoBean("from production profile");//profile为prod时实例化prodDemoBean
    }
}
