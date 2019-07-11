package com.stackroute.domain;

import java.util.List;

public class Movie
{
    //list of objects of type Actor

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

}
