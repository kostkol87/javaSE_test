package ru.test;

/**
 * Created by Константин on 21.07.2014.
 */
public class PhilsThread extends Thread{

    int place;

    public void getRightFork(){
        System.out.println(currentThread().getName() + " takes right fork");
    }

    public void getLeftFork(){
        System.out.println(currentThread().getName() + " takes left fork");
    }

    public void putRightFork(){
        System.out.println(currentThread().getName() + " puts right fork");
    }

    public void putLeftFork(){
        System.out.println(currentThread().getName() + " puts left fork");
    }

    public void eat(){
        System.out.println(currentThread().getName() + " is eating");
    }

    public void think(){
        System.out.println(currentThread().getName() + " is thinking");
    }

}
