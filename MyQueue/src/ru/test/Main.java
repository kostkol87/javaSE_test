package ru.test;

public class Main  {
    public static void main(String[] args) {
        Checker checker = new Checker();

        MyQueue queue = new MyQueue();

        checker.checkNull(queue.get());

        queue.put(new Transfer(1L));
        queue.put(new Transfer(2L));
        queue.put(new Transfer(3L));
        queue.put(new Transfer(4L));
        queue.put(new Transfer(5L));
        queue.put(new Transfer(6L));

        checker.check(queue.get(),1L);
        checker.check(queue.get(),2L);
        checker.check(queue.get(),3L);
        checker.check(queue.get(),4L);
        checker.check(queue.get(),5L);
        checker.check(queue.get(),6L);
        checker.checkNull(queue.get());
    }
}
