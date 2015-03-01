package ru.test;

public class Checker {

    public void check(Transfer t, Long id) {
        if (t != null && t.getId()==(id)) {
            System.out.println("true " + id +" "+t);
        } else {
            System.out.println("false " + id+" "+t);
        }

    }

    public void checkNull(Transfer t) {
        if (t == null) {
            System.out.println("true " + t);
        } else {
            System.out.println("false " + t);
        }

    }
}
