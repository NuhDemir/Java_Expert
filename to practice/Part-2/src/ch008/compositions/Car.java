package ch008.compositions;

public class Car {
    private String make;
    private String model;
    private String year;
    private int speed;
    private int distance;

    private Wheel[] wheels = new Wheel[10];
    private Engine engine;
    private int doorCount;
    private Door[] doors;
    private Transmission transmission;


    public Car(String make,String model,String year,int doorCount){
        this.make=make;
        this.model = model;
        this.year= year;


        engine = new Engine(2000,100);
        transmission = new Transmission();

        wheels[0] = new Wheel("Right-front");
        wheels[1] = new Wheel("Left-front");
        wheels[2] = new Wheel("Right-rear");
        wheels[3] = new Wheel("Right-rear");


    this.doorCount = doorCount;
    doors = new Door[this.doorCount];
        doors[0] = new Door("Right-front");
        doors[1] = new Door("Left-front");
    }

}
