package com.nicole.springBoot.chapter1.chapter3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by xl on 2017/8/10.
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{
    private String beanName;//bean的名称
    private ResourceLoader loader;//资源加载服务

    public void setBeanName(String s) {//重写该方法
        this.beanName = s;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {//重写该方法
        this.loader = resourceLoader;

    }

    public void outputResult(){
        System.out.println("bean的名称为："+beanName);
        Resource resource = loader.getResource("classpath:test.txt");
        try{
            System.out.println("ResourceLoader加载的文件内容为："+IOUtils.toString(resource.getInputStream()));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
