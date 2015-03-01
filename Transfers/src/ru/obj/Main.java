package ru.obj;

public class Main {
    public static void main(String[] args) {

        TransferQueue  tq = new TransferQueue();
        tq.put("misha",20000);

        tq.put("sasha", 50000);

        tq.put("grisha",60000);

        tq.put("petya",70000);


        System.out.println("=================================================================");


        System.out.println(tq.get().getName());
        System.out.println(tq.get().getName());
        System.out.println(tq.get().getName());
        System.out.println(tq.get().getName());
        tq.get();
        System.out.println(tq.get());
        tq.get();
        System.out.println(tq.get());




    }
}
