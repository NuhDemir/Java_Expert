package ch005.polymorphism.producing_the_right_behavior.shape;

public class Rhombus extends Shape {


    @Override
    public void draw() {
        System.out.println("Rhombus.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Rhombus.erase()");
    }
}
