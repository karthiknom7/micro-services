package com.kk.microservices.limitsservice.controller;

import com.kk.microservices.limitsservice.Configuration;
import com.kk.microservices.limitsservice.model.LimitConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private Configuration configuration;
    @GetMapping(path = "/limits")
    public LimitConfiguration getLimits(){
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }


    @GetMapping(path = "/limits-with-hystrix")
    @HystrixCommand(fallbackMethod = "getLimitsDefault")
    public LimitConfiguration getLimitsFails(){

        throw  new RuntimeException("");
    }

    public LimitConfiguration getLimitsDefault(){
        return new LimitConfiguration(100, 0);
    }
}
