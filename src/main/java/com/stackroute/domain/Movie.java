package com.stackroute.domain;

public class Movie
{
   private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }


    public void display()
    {
        System.out.println("The actor information:"+ actor.getName()+" "+ actor.getGender()+" "+ actor.getAge());

    }
}
