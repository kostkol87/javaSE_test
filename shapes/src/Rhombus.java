public class Rhombus extends Shape {
    int i = 0;
    int size = 7;


    @Override
    void whatIsIt() {
        System.out.println("FOR RHOMBUS");
    }

    @Override
    void draw() {
        while (i < size) {
            String space = "";
            String star = "";
            for (int j = 0; j < size - i; j++)
                space += " ";
            for (int j = 0; j < 2 * i + 1; j++)
                star += key;
            System.out.println(space + star);
            i++;
        }

        i=0;
        size=7;

        while (i<size) {
            String space = "  ";
            String star = "";


            for (int j = 0; j < size * 2 -3; j++) {
                String starTemp = "";
                for (int m = 0; m < 1; m++)
                    starTemp += key;
                    star = starTemp;
            }


            for (int j = 0; j <  i ; j++)
                space+=" ";

            System.out.println(space + star);
            i++;

        }
        System.out.println("1 "+key+" 1");
        }

    }