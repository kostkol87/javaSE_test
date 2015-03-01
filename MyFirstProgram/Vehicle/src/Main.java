
public class Main {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle() {
            @Override
            public void move() {
                System.out.println("Vehicle как-то перемещается");
            }
        };
        veh.move();

        Car car = new Car();
        car.color = "Red";
        car.number=4654564;
        car.speed=40;
        car.weight=1501.455f;
        System.out.println(car.toString()+": цвет: "+car.color+", номер: "+car.number+", скорость: "+car.speed+", вес: "+car.weight+" ");
        car.move();

        System.out.println("++++++++++++");

        Boat boat = new Boat();
        boat.color="Синий";
        boat.number=121313;
        boat.speed=120;
        boat.weight=3501.154f;
        System.out.println(boat.toString()+": цвет: "+boat.color+", номер: "+boat.number+", скорость: "+boat.speed+", вес: "+boat.weight+" ");
        boat.move();


        Plane plane = new Plane();
        Bike bike = new Bike();


    }
}
