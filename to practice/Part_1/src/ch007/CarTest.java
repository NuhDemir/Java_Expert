package ch007;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

        System.out.println("when the car stands still");
        car1.make = "Mercedes";
        car1.model = "C400";
        car1.year = "2019";
        car1.distance = 0;
        car1.speed = 0;

        System.out.println(car1.getInfo());

        System.out.println("\nwhen the car moves: ");

        car1.accelerate(100);
        car1.go(100);

        System.out.println(car1.getInfo());

    }
}
