package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean
{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    //the init method
    public void customInit()
    {
        System.out.println("this is init method");
    }
    //the destroy method
    public void customDestroy()
    {
        System.out.println("this is destroy method");
    }
}
