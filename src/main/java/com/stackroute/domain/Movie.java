package com.stackroute.domain;

public class Movie
{
    Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    //to call the to string method and display the information
    public void display()
    {
        System.out.println(actor.toString());
    }


}
