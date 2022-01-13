package com.dalong;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;

@RestController
public class Service {

    private final LoginServiceA loginService;
    public  Service(LoginServiceA loginService){
        this.loginService=loginService;
    }
    @GetMapping(value = {"/demo"})
    public   Object printName() throws MalformedURLException {
        return  this.loginService.printName();
    }

    @GetMapping(value = {"/demo/{version}"})
    public   Object printNameVersion(@PathVariable("version") Integer version) throws MalformedURLException {
        return  this.loginService.printNameVersion(version);
    }
}
