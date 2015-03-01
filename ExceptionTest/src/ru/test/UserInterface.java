package ru.test;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) throws InterruptedException, AlternativeSourceDataException {
        System.out.println("Welcome to our genius UI");
        Scanner scan = new Scanner(System.in);
        BuisnessLogic nl = new BuisnessLogic();
        try {
            nl.doSomethingWithDBItem();
        } catch (AlternativeSourceDataException e) {
            e.getStackTrc();
            System.out.println("Hey! you have to do something: if you want to proceed with old DB you should enter 1, else press any key for quit program with key (-1)");
            int selection = scan.nextInt();
            if (selection == 1) {
                nl.dao.get.connecting();
            } else {
                System.out.println("program was closed by user");
                System.exit(-1);
            }
        }
        System.out.println("Program ends successfully !!!");
    }

}
