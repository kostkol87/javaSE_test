package ru.test;

import java.util.ArrayList;

public class DAO {
    Connection get=new Connection();

    public ArrayList<String> getSomethingFromDB() throws InterruptedException {
        System.out.println(" getting data from source");
        try {
            get.connecting();
        } catch (AlternativeSourceDataException e) {
            e.printStackTrace();
            UserInterface ui;

        }
        return null;
    }
}
