package ru.test;

public class BuisnessLogic {
    DAO dao = new DAO();
    public void doSomethingWithDBItem() throws AlternativeSourceDataException, InterruptedException {
        System.out.println("To do something helpfull, we need a data base item");

        dao.getSomethingFromDB();
    }
}
