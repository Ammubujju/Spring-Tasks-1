package com.stackroute.domain;



import java.util.*;

public class Actor
{
    /*Declaring appropraite varaibles*/
    private String name;
    private String gender;
    private int age;

    /*using Getter methods*/
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


    /*using setter methods*/
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
}