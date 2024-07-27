package ch005.polymorphism.producing_the_right_behavior.shape;

public class Hexagon extends Shape {


    @Override
    public void draw() {
        System.out.println("Hexagon.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Hexagon.erase()");
    }
}
