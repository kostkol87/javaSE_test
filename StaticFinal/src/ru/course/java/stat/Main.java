package ru.course.java.stat;


public class Main {

    public static void main(String[] args) {


        Class1 obj1 = new Class1();
        Class1 obj2 = new Class1();

        Class1.name = "Hello";
        System.out.println(Class1.name);
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        Class1.name = "Bye";
        System.out.println(Class1.name);

        System.out.println(Class1.summ(3,8));
        int m=0,k=3;
        int z=k/m;


    }
}
