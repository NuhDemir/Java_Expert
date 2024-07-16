package ch008.constant;

public class Car {
String make;
String model;
String year;
int speed;
int distance;

String owner;

//final parameter
    public void speedUp(final int newSpeed)
    {
        //can't do that
       // newSpeed *=2;
        speed = newSpeed;
    }

    public void setOwner(final String newOwner)
    {
        //can't do that
        //newOwner = "Nuh Demir";
        owner = newOwner;
    }

}
