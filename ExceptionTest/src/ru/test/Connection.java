package ru.test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by Константин on 19.06.2014.
 */
public class Connection {
    int count = 1;
    long tmp;

    DataBase db = new DataBase();
    public ArrayList<String> connecting() throws InterruptedException, AlternativeSourceDataException {
        System.out.println("now we're trying to connect to some DB");

        try {
            System.out.println("trying " + count++);
            tmp = getRandomMs();
            TimeUnit.MILLISECONDS.sleep(tmp);
            System.out.println(tmp + " ms ping to db");
            return db.getActualDB();
        } catch (SourceDataException e) {
            e.getStacktrc();
            try {
                System.out.println("retrying " + count++);
                tmp = getRandomMs();
                TimeUnit.MILLISECONDS.sleep(tmp);
                System.out.println(tmp + " ms ping to db");
                return db.getActualDB();
            } catch (SourceDataException e1) {
                e1.getStacktrc();
                try {
                    System.out.println("retrying " + count++);
                    tmp = getRandomMs();
                    TimeUnit.MILLISECONDS.sleep(tmp);
                    System.out.println(tmp + " ms ping to db");
                    return db.getActualDB();
                } catch (SourceDataException e2) {
                    e2.getStacktrc();
                    return db.getOldDB();
                }
            }

        }

    }

    private long getRandomMs(){
         long x = (long) (Math.random()*1000);
         return x;
    }


}
