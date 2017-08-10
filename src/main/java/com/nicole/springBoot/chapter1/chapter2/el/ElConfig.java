package com.nicole.springBoot.chapter1.chapter2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.Resource;


/**
 * Created by xl on 2017/8/10.
 */
@Configuration
@ComponentScan("com.nicole.springBoot.chapter1.chapter2.scope.el")
@PropertySource("classpath:test.properties")
public class ElConfig {
    @Value("i love you")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber;
    @Value("classpath:test.txt")
    private Resource testFile;
    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;
    public void outputResource(){
        try{
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
