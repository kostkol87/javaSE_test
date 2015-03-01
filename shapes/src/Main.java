
public class Main {
    public static void main(String[] args) {

        Triangle tri = new Triangle();

        tri.whatIsIt();
        tri.drawType();
        tri.draw();

        Square sq = new Square();
        sq.whatIsIt();
        sq.drawType();

        sq.numOfSigns();
        sq.draw();

        Rhombus romb = new Rhombus();
        romb.whatIsIt();
        romb.drawType();
        romb.draw();

    }
}
