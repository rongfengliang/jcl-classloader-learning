package com.dalong;

public abstract class MyLogin {

    public abstract   Object doLogin();

    public String servicAddress(){
        return "https://localhost:8080";
    }

    public String requestFormat(String address,Integer version,String pacakgeName){
        return  String.format("%s/%s-%d",address,pacakgeName,version);
    }
    public String appDemo(){
        return  "demo";
    }
    public String appDemo2(){
        return  "demo";
    }
}
