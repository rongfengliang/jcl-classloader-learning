package com.dalong;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;

@RestController
public class Service2 {
    private final LoginServiceB loginService;
    public  Service2(LoginServiceB loginService){
        this.loginService=loginService;
    }
    @GetMapping(value = {"/demo2"})
    public   Object printName() throws MalformedURLException {
        return  this.loginService.printName();
    }

    @GetMapping(value = {"/demo2/{version}"})
    public   Object printNameVersion(@PathVariable("version") Integer version) throws MalformedURLException {
        return  this.loginService.printNameVersion(version);
    }
}
