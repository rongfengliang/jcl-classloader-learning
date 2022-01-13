package com.dalong;

public class MyAppDemo extends MyLogin{
    @Override
    public Object doLogin() {
        return "dalongdemo";
    }

    @Override
    public String appDemo() {
        return "dalongapp";
    }
}
