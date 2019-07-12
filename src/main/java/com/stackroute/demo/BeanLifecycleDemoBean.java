package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean
{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("it is destroyed");
    }

    public void customInit()
    {
        System.out.println("this is init method");
    }
    public void customDestroy()
    {
        System.out.println("this is destroy method");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set");

    }
}
