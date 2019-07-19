package com.stackroute.domain;

public class Actor
{
    // Declaration of varaibles
    private String name,gender;
    private int age;

    //assigning the current variables
    public Actor(String name, String gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public Actor()
    {

    }
     //using getter methods
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

    //using setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
