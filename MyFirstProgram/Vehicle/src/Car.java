/**
 * Created by Константин on 23.05.2014.
 */
public class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("drive");
    }

    @Override
    public String toString() {
        return "Car";
    }
}
