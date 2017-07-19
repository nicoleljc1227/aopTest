package com.yiibai.spring.eaample1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by xl on 2017/7/19.
 */
public class HelloWorldClient {
    protected static final Log log = LogFactory.getLog(HelloWorldClient.class);

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        log.info(helloWorld.getContent());
    }

}
