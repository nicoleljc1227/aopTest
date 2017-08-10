package com.nicole.springBoot.chapter1.chapter2.profile;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by xl on 2017/8/10.
 */
public class WebInit implements WebApplicationInitializer {

//利用WebApplicationInitializer配置SpringMVC取代web.xml
    //通过设定jvm的spring.profiles.active参数来配置环境
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter("spring.profiles.default","dev");
    }
}
