package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application
{
    public static void main( String[] args )
    {
        //using configurbaleapplication context to close the object context
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean beanLifecycleDemoBean = context.getBean("beanlifecycledemo",BeanLifecycleDemoBean.class);
        System.out.println("the name is "+beanLifecycleDemoBean.getName());


        context.close();
    }
}
