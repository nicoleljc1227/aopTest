package com.nicole.springBoot.chapter3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xl on 2017/8/13.
 */
@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition.class)//符合Windows条件则实例化windowsListService
    public ListService windowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)//符合Linux条件则实例化LinuxListservice
    public ListService linuxListService(){
        return new LinuxListService();
    }


}
