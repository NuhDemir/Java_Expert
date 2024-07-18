package ch008.housekeeping;

import javax.xml.transform.dom.DOMLocator;

public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println(
                "Constructor w/ int ar only,petalCount = "
                        + petalCount
        );
    }

    Flower(String ss) {
        System.out.println("constructor w/ String arg only, s = " + ss);
    }

    Flower(String s, int petals) {
        this(petals);
        //-this(s); //Can't call two!
        this.s = s; //Another use of "this"
        System.out.println("String & int args");
    }

    Flower() {
        this("hi ", 33);
        System.out.println("Zero-argument constructor");
    }

    void printPetalCount() {
        //this(11); //Not inside non-constructor
        System.out.println(
                "petalCount: " + petalCount + " , s: " + s
        );
    }

    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.printPetalCount();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
