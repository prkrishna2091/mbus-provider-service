package com.rkgroup.mbusproviderservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rkg")
public class WelcomeController {

    @Value("${app.company.name}")
    private String company;

    @Value("${eureka.client.service-url.defaultZone}")
    private String defaultZone;

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to"+company;
    }

    @GetMapping("/props")
    public String props(){
        return "eureka.client.service-url.defaultZone"+defaultZone;
    }
}
