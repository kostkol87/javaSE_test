import java.util.Scanner;

public abstract class Shape {
    String key;
    String tmp;

    Scanner scan = new Scanner(System.in);
    void drawType(){
        System.out.print("Select draw item ");
        key=scan.next();


    }

    abstract void whatIsIt();
    abstract void draw();
}
