package com.dalong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.xeustechnologies.jcl.JarClassLoader;
import org.xeustechnologies.jcl.JclObjectFactory;

import java.net.MalformedURLException;
import java.net.URL;

@Component
public class LoginServiceB {
    private JarClassLoader jcl = new JarClassLoader();
    private Logger logger  = LoggerFactory.getLogger(LoginServiceA.class);
    public String printName() throws MalformedURLException {
        logger.info("load class");
        JarClassLoader jcl = new JarClassLoader();
        //Loading classes from different sources
        jcl.add(new URL("http://localhost:8080/firstuserlogin-1-SNAPSHOT.jar"));
        JclObjectFactory factory = JclObjectFactory.getInstance();
        //Create object of loaded class
        logger.info("load class from {}","http://localhost:8080/firstuserlogin-1-SNAPSHOT.jar");
        LoginService obj = (LoginService)factory.create(jcl, "com.dalong.MyApp");
        return obj.printName();
    }

    public String printNameVersion(Integer version) throws MalformedURLException {
        //Loading classes from different sources
        JarClassLoader jcl = new JarClassLoader();
        String requestURL = String.format("http://localhost:8080/firstuserlogin-%d-SNAPSHOT.jar",version);
        jcl.add(new URL(requestURL));
        logger.info("load class from {}",requestURL);
        JclObjectFactory factory = JclObjectFactory.getInstance();
        //Create object of loaded class
        MyLogin obj = (MyLogin)factory.create(jcl, "com.dalong.MyAppDemo");
        return obj.doLogin().toString();
    }
}
