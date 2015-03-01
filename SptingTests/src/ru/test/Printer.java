package ru.test;

/**
 * Created by Константин on 14.08.2014.
 */
public class Printer {
    private String msg;
    Printer(){
        this.msg=msg;
    }
    Printer(String name, int age){
        System.out.println(name +" is "+ age +" years old");
    }
    public void print(String msg){
        System.out.println(msg);
    }

}
