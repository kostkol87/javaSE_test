package ru.obj;

import java.util.Random;

public class Transfer {
    private Transfer next;
    private String name;
    private int summ;

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Transfer getNext() {
        return next;
    }

    public void setNext(Transfer next) {
        this.next = next;
    }
}
