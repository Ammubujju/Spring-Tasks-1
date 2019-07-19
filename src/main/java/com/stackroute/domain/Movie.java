package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//Implementing the beans
public class Movie implements BeanFactoryAware, BeanNameAware, ApplicationContextAware
{
    private Actor actor;

    //A bean in spring implements BeanFactoryAware then that bean has to implement a method that is setBeanFactory.
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException
    {
        System.out.println("Implementing BeanFactoryAware");
    }


    //Setting the bean name and impementing the BeanNmaeAware
    @Override
    public void setBeanName(String s)
    {
        System.out.println("Implementing BeanNameAware");
    }

    //implementing ApplicationContext
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        System.out.println("Implementing ApplicationContext");
    }

    public Movie(Actor actor)
    {
        this.actor = actor;
    }
    public Movie()
    {

    }

    // constructor would initialize data members
    // with the values of passed arguments while
    // object of that class created.
    public void setActor(Actor actor)
    {
        this.actor = actor;

    }


    //Displaying the information of actor using getter methods
    public void display()
    {
        System.out.println("The actor information : " +actor.getName()+"  "+actor.getGender() +"   "+actor.getAge());
    }
}
