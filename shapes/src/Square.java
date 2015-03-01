public class Square extends Shape {
    int num;
    void numOfSigns(){
        System.out.print("specify the size of the square base (integer only): ");
        num = scan.nextInt();
    }

    @Override
    void whatIsIt() {
        System.out.println("for square");
    }

    @Override
    void draw() {
        for (int i = 0; i < num; i++) {

            System.out.println();
            for (int j = 0; j < num; j++) {
                System.out.print(key+" ");
            }
        }
        System.out.println();
    }
}
