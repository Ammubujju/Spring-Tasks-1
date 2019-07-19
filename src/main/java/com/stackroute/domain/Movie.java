package com.stackroute.domain;

public class Movie
{
    /*Creating the object for Actor class*/
   private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    /*Displaying the information of Actor class*/
    public void display()
    {
        System.out.println("The actor information:"+ actor.getName()+" "+ actor.getGender()+" "+ actor.getAge());

    }
}
