
public class Mian {
    public static void main(String[] args) {
        TransferQueue tq = new TransferQueue();
        tq.put("vasya");
        tq.put("petya");
        tq.put("misha");


        System.out.println("=========================================================");

        tq.get();
        tq.get();
        tq.get();
    }
}

