package ch008.constant;

public class FinalParameter {

    public static void main(String[] args) {
        //Car is a final reference
        final Car car;//= new Car("Mercedes","2018",0,0);

     //can't do this only if car is not defined above!
     car  = new Car();
     car.make = "Mercedes";
     car.model = "E200";
     car.year = "2011";
     car.speed = 40;
     car.distance = 20_421;

     //can't do this
      //  car = new Car();

        car.speedUp(111);
        car.setOwner("Ali");
    }
}
