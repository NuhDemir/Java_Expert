package ch005.polymorphism.producing_the_right_behavior.shape;

public class Polygon extends Shape {
    @Override
    public void draw() {
        System.out.println("Polygon.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Polygon.erase()");
    }

}