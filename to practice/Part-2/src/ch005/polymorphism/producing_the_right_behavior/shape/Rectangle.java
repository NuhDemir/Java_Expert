package ch005.polymorphism.producing_the_right_behavior.shape;

public class Rectangle extends Shape {


    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle.erase()");
    }
}
