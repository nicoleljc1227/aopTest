package com.yiibai.spring.example2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by xl on 2017/7/19.
 */
public class HelloWorldClient {
    protected static final Log log = LogFactory.getLog(com.yiibai.spring.eaample1.HelloWorldClient.class);

    public static void main(String[] args) {
        FileHelloStr fileHelloStr = new FileHelloStr("HelloWorld.properties");
        HelloWorld helloWorld = new HelloWorld(fileHelloStr);//fileHellstr是HelloStr的实现类
        //HelloWorld中的构造方法是载入HelloStr接口
        log.info(helloWorld.getContent());

    }
}
