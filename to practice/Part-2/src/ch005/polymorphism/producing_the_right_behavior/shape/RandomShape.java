package ch005.polymorphism.producing_the_right_behavior.shape;

import java.util.Random;

public class RandomShape {

    private Random random = new Random(22);

    public Shape get() {
        switch (random.nextInt(2)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Ellipse();
            case 2:
                return new Hexagon();
            case 3:
                return new Pentagon();
            case 4:
                return new Polygon();
            case 5:
                return new Rectangle();
            case 6:
                return new Rhombus();
            case 7:
                return new Square();
            case 8:
                return new Triangle();
        }
    }
}
