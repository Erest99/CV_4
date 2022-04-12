package com.example.cv4;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;



import javax.annotation.PostConstruct;


@Component
@ComponentScan
@Configuration
@ConfigurationProperties(prefix = "app")
public class JavaTestConfig {

    //@Autowired
    public myInterface mI;

    @PostConstruct
    public void test()
    {
        System.out.println("Config Loaded");

    }

    private String label;
    private String name;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
