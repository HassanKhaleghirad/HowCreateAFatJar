package com.codeforgeyt.fatjardemo.controller;

import com.codeforgeyt.fatjardemo.configuration.AppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    AppConfiguration appConfiguration;

    @GetMapping("/greeting")
    public String getGreeting(){
        return  appConfiguration.getGreeting();
    }


}
