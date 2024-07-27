package ch005.polymorphism.producing_the_right_behavior.shape;

public class Ellipse extends Shape {
    @Override
    public void draw() {
        System.out.println("Ellipse.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Ellipse.erase()");
    }
}
