package ru.test;

public class MyQueue {

//    private Transfer first;
//    private Transfer last;
    QueueData qd = new QueueData();


    public void put(Transfer transfer) {

//        if (first == null) {
//            first = last = transfer;
//
//        } else {
//            last.setNext(transfer);
//            last = transfer;
//
//        }

        if (qd.getFirst() == null) {
            qd.setFirst(transfer);
            qd.setLast(transfer);
        } else {
            qd.setNext(transfer);
            qd.setLast(transfer);
        }


    }

    public Transfer get() {

//        if (first == null) {
//            return null;
//        }
//        Transfer tmp = first;
//        first = first.getNext();
//        if (first == null) {
//            last = null;
//        }
//
//        return tmp;

        if (qd.getFirst() == null) {
            return null;
        }

        Transfer tmp = qd.getFirst();
        qd.setFirst(qd.getNext());
        if (qd.getFirst() == (null))

        {
            qd.setLast(null);
        }

        return tmp;


    }
}
