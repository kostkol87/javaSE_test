package ru.test;

public class QueueData extends Transfer {


    private Transfer first;
    private Transfer last;
    private Transfer next;

    public Transfer getFirst() {
        return first;
    }

    public void setFirst(Transfer first) {
        this.first = first;
    }

    public Transfer getLast() {
        return last;
    }

    public void setLast(Transfer last) {
        this.last = last;
    }

    public Transfer getNext() {
        return next;
    }

    public void setNext(Transfer next) {
        this.next = next;
    }
}
