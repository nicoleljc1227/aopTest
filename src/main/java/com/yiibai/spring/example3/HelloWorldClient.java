package com.yiibai.spring.example3;

import com.yiibai.spring.example2.FileHelloStr;
import com.yiibai.spring.example2.HelloWorld;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by xl on 2017/7/19.
 */
public class HelloWorldClient {
    protected static final Log log = LogFactory.getLog(com.yiibai.spring.eaample1.HelloWorldClient.class);

    public static void main(String[] args) {
        HelloWorld helloWorld = HelloWorldFactory.getHelloworldFile();
        log.info(helloWorld.getContent());

    }
}
