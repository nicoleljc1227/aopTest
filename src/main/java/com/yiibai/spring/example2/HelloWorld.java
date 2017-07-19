package com.yiibai.spring.example2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by xl on 2017/7/19.
 */
public class HelloWorld {
    protected static final Log log = LogFactory.getLog(com.yiibai.spring.eaample1.HelloWorld.class);
    private HelloStr helloStr;//接口
    public HelloWorld(HelloStr helloStr){
        this.helloStr = helloStr;
    }

    public String getContent(){
        return helloStr.getContent();
    }

}
