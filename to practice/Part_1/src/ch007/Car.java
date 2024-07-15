package ch007;

import java.security.PublicKey;

public class Car {

    public String make;
    public String model;
    public String year;
    public int speed;
    public int distance;

    public double go (int newDistance)
    {
        distance += newDistance;
        double period = (double)newDistance /speed;
        return period;
    }

    public void accelerate(int newSpeed)
    {
        speed = newSpeed;

    }

    public void stop()
    {
        speed= 0;
    }

    public String getInfo()
    {
        String info ="Car Info: " +year +" " +make + " " +model +" " +". Distance: " +" km. and traveling at " + speed + " kmph.";
        return info;
    }




}
