package com.stackroute.domain;

import java.util.*;

public class Actor
{
    /*declaring the variables*/
    private String name;
    private String gender;
    private int age;

    /*"this" is used to assign the current class variables */
     public Actor(String name,String gender,int age)
     {
         this.name = name;
         this.gender=gender;
         this.age=age;

     }

     /*using getter methods to get the information*/
    public String getName()

    {
        return name;
    }

    public String getGender()

    {
        return gender;
    }

    public int getAge()

    {
        return age;
    }
}