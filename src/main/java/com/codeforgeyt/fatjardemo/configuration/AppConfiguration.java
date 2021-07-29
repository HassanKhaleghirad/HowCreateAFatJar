package com.codeforgeyt.fatjardemo.configuration;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Value("${greeting}")
    private String greeting;


    public String getGreeting() {
        return greeting;
    }
}
