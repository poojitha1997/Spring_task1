package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware
{
    //list of objects of type Actor
    private ApplicationContext applicationContext = null;


    public Movie()
    {

    }
    public Movie(Actor actor) {
        this.actor = actor;
    }

    Actor actor;
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }



    public void display()
    {
        System.out.println(actor.toString());
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);


    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        System.out.println(applicationContext);

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("bean is"+s);

    }
}
