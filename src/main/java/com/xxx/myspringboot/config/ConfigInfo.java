package com.xxx.myspringboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName ConfigInfo
 * @Author hello
 * @Date 2018/12/22 13:39
 **/
@Component
@ConfigurationProperties(prefix = "wangchuan")
public class ConfigInfo {


    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
