package ru.test;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        MyFile mf = new MyFile();

        Scanner scan = new Scanner(System.in);
        System.out.println("For simple copy press 1 ");
        System.out.println("For buffered copy press 2 ");
        System.out.println("For new java7 copy method press 3 ");
        System.out.println("For buffered copy with array-based buffer press 4 ");
        int selection = scan.nextInt();



        long start=0;
        if (selection == 1) {
            start=System.currentTimeMillis();
            mf.simpleCopy();
        }

        if (selection == 2) {
            start=System.currentTimeMillis();
            mf.bufferedCopy();
        }

        if (selection == 3){
            start=System.currentTimeMillis();
            mf.java7copy();
        }

        if (selection == 4){
            start=System.currentTimeMillis();
            mf.bufferedArrayCopy();
        }

        long end = System.currentTimeMillis();
        System.out.println("Stopwatch: " + (end-start) + " milliseconds");
        scan.close();

    }
}
