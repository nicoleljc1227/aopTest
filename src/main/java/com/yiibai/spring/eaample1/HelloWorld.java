package com.yiibai.spring.eaample1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by xl on 2017/7/19.
 */
public class HelloWorld {
    protected static final Log log = LogFactory.getLog(HelloWorld.class);
    public String getContent(){
        FileHelloStr fileHelloStr = new FileHelloStr("HelloWorld.properties");
        String helloWorld = fileHelloStr.getContent();
        return helloWorld;
    }



}
