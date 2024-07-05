package ch003.references.car;

import javax.swing.plaf.synth.SynthUI;

public class CarReferences {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Mercedes";
        car1.model = "C200";
        car1.year = "2015";
        car1.distance = 0;
        car1.speed = 0;
        System.out.println("car1: " + car1.getInfo() );

        Car car2 = new Car();
        car2.make = "BMW";
        car2.model = "i8";
        car2.year = "2016";
        car2.distance = 10_000;
        car2.speed = 160;
        System.out.println("car2:   " + car2.getInfo());

        Car tmpCar =  car1;
        car1 = car2;
        car2 = tmpCar;

        System.out.println("\nCar1: " +car1.getInfo());
        System.out.println("Car2: "+ car2.getInfo());
        System.out.println("TmpCar: " +tmpCar.getInfo());

        car2.accelerate(120);
        car2.go(22);

        System.out.println("\nCar2: " +car2.getInfo());
        System.out.println("TmpCar: " +tmpCar.getInfo());

        tmpCar.go(22);
        tmpCar.stop();

        System.out.println("\nCar2: " + car2.getInfo());
        System.out.println("tmpCar: " + tmpCar.getInfo());


        //car1.accelerate(130);
        // car1.go(40);
        // if (car1!=null)
        //System.out.println("\ncar1: " +car1.getInfo());
        //else
        //System.out.println("It is a null reference!");

    tmpCar.accelerate(150);
    tmpCar.go(22);


    car1.accelerate(150);
    car1.go(60);
    System.out.println("tmpCar: "+ tmpCar.getInfo());

    }
}
