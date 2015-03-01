package ru.test;

import java.util.ArrayList;

public class DataBase {

    ArrayList<String> actualDB = new ArrayList();
    ArrayList<String> oldDB = new ArrayList<String>();

    public ArrayList<String> getActualDB()throws SourceDataException {
        if (System.currentTimeMillis()%2==0) throw new SourceDataException();
        System.out.println("connection to actual Data Base succeed!");
        return actualDB;

    }
    public ArrayList<String> getOldDB()throws AlternativeSourceDataException {

        if (System.currentTimeMillis()%2==0) throw new AlternativeSourceDataException();
        System.out.println("connection to old Data Base succeed!");
        return oldDB;
    }


}
