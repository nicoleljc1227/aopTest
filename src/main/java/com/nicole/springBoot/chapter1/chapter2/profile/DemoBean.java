package com.nicole.springBoot.chapter1.chapter2.profile;

/**
 * Created by xl on 2017/8/10.
 */
public class DemoBean {
    private String content;
    public DemoBean(String content){
        super();
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
