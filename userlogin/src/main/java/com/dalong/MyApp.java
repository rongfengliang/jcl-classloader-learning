package com.dalong;

public class MyApp  implements  LoginService{
    @Override
    public  String printName(){
       return MyUtils.randomUserName();
    }

    @Override
    public String printNameVersion(Integer version) {
        return MyUtils.randomUserNameVersion(version);
    }
}
