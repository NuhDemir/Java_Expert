package ch005.polymorphism.producing_the_right_behavior.shape;

public class Pentagon extends Shape {
    @Override
    public void draw() {
        System.out.println("Pentagon.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Pentagon.erase()");
    }

}
