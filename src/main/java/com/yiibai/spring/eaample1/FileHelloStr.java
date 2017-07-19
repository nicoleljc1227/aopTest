package com.yiibai.spring.eaample1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by xl on 2017/7/19.
 */
public class FileHelloStr {
    protected static final Log log = LogFactory.getLog(FileHelloStr.class);
    private String profilename;
    public FileHelloStr(String profilename){
        this.profilename = profilename;


    }

    public String getContent(){

        String helloWorld = "";
        try {
            Properties properties = new Properties();
            InputStream is = getClass().getClassLoader().getResourceAsStream(profilename);
            properties.load(is);
            is.close();
            helloWorld = properties.getProperty("helloworld");
        } catch (FileNotFoundException ex) {
           log.error(ex);
        }catch (IOException e){
            log.error(e);
        }
        return helloWorld;
    }


}
