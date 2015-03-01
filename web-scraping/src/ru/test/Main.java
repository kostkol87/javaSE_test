package ru.test;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Константин on 20.08.2014.
 */
public class Main {
    protected static ArrayList<String> line=new ArrayList<String>();
    protected static String address;
    public static void main(String[] args) throws IOException {

        String tmp=null;
        address = "http://178.62.184.61/";

        URL url = new URL(address);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(url.openConnection().getInputStream(),"UTF-8"));

        while ((tmp = br.readLine()) != null){
            line.add(tmp.trim());
        }

        for (String x:line){
            System.out.println(x);
        }
    }
}
