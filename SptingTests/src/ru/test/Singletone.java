package ru.test;

/**
 * Created by Константин on 14.08.2014.
 */
public class Singletone {
    private  static Singletone singletone;
    public synchronized Singletone getInstance(){
        if (singletone == null){
            singletone=new Singletone();
        }
        return singletone;
    }
    public void sayHello(){
        System.out.println("Hello I'm Singletone obj created by Spring!");
    }
}
