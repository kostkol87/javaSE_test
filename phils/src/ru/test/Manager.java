package ru.test;

/**
 * Created by Константин on 21.07.2014.
 */
public class Manager {
    public static void create(){
        //fork creating
        Fork fork1 = new Fork();
        Fork fork2 = new Fork();
        Fork fork3 = new Fork();
        Fork fork4 = new Fork();
        Fork fork5 = new Fork();
        //philosophers creating
        Phil phil1 = new Phil(fork1,fork2,1);
        Phil phil2 = new Phil(fork2,fork3,2);
        Phil phil3 = new Phil(fork3,fork4,3);
        Phil phil4 = new Phil(fork4,fork5,4);
        Phil phil5 = new Phil(fork5,fork1,5);



    }


    public static boolean isAllowed(Fork left, Fork right, int place) {return true;
    }
}
