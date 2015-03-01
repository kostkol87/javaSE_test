public class Triangle extends Shape{

    int i = 0;
    int max = 7;


    @Override
    void whatIsIt() {
        System.out.println("FOR TRIANGLE");
    }

    @Override
    void draw() {
        while (i < max) {
            String space = "";
            String star = "";
            for (int j = 0; j < max - i; j++) space += " ";
            for (int j = 0; j < 2 * i + 1; j++) star += key;
            System.out.println(space + star);
            i++;
        }
    }

}
