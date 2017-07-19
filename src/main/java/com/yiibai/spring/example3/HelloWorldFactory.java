package com.yiibai.spring.example3;

import com.yiibai.spring.example2.FileHelloStr;
import com.yiibai.spring.example2.HelloStr;
import com.yiibai.spring.example2.HelloWorld;

/**
 * Created by xl on 2017/7/19.
 * HelloWorldFactory类负责创建和集成客户客户端所需要的对象，开发者借助HelloWorldFactory类实现了反转控制
 * 工厂类都是简单的仅仅提供 构造方法和变量的 单实例 他们将创建对象
 * 并将这些对象绑定在一起
 */
public class HelloWorldFactory {
    public static HelloWorld getHelloworldFile(){
        HelloStr helloStr = new FileHelloStr("HelloWorld.properties");
        HelloWorld helloWorld = new HelloWorld(helloStr);
        return  helloWorld;
    }


}
