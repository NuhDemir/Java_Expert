package ch008.car.composite;

public class Car {

    String make;
    String model;
    String year;
    int speed;
    int distance;

    //Owner of the car
    Person owner;

    public void go(int newDistance)
    {
        distance += newDistance;
    }

    public void accelerate(int newSpeed)
    {
        speed = newSpeed;
    }

    public void stop()
    {
        speed = 0;
    }

    public String getInfo()
    {
        String info = "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
        if(owner != null)
            info += " And its owner is " + owner.firstName + " " + owner.lastName;
        else
            info += " And it does not have an owner!";
        return info;
    }
}
