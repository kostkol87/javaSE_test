public class Main {
    public static void main(String[] args) {


        int i = 5;
        int j = 8;

//        if (true && true) {
//            System.out.println("3");
//        }

        for (; j < 10; j++) {
            System.out.println(j);
            if (j == 8) break;
        }

        System.out.println("+++++++++++++++++");

        while (j > 0) {
            System.out.println(j);
            j--;
        }

        System.out.println("+++++++++++++++++");

        do {

            if (j == 3) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;

        } while (j < 5);

        System.out.println("+++++++++++++++++++");

        int k = 3;

        System.out.println(k++);
        System.out.println("+++++++++++++");
        System.out.println(k);
        System.out.println("++++++++++++++++++");
        System.out.println(++k);


    }
}
