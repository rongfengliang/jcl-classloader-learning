package com.dalong;

import java.util.UUID;

public   class  MyUtils {
    public static  String  randomUserName(){
        return  String.format("%s-%s","demoapp", UUID.randomUUID().toString());
    }

    public static  String  randomUserNameVersion(Integer version){
        return  String.format("%s-%s-%d","test", UUID.randomUUID().toString(),version);
    }
}
