package com.yiibai.spring.example4;

import com.yiibai.spring.example2.HelloWorld;
import com.yiibai.spring.example3.HelloWorldFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by xl on 2017/7/19.
 */
public class HelloWorldClient {
    protected static final Log log = LogFactory.getLog(com.yiibai.spring.eaample1.HelloWorldClient.class);

    public HelloWorldClient(){
        //加载bean
        Resource resource = new ClassPathResource("appcontext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("fileHelloWorld");
        log.info(helloWorld.getContent());
    }


    public static void main(String[] args) {
        new HelloWorldClient();


    }
}
