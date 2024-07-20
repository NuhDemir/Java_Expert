package ch005;

import java.awt.*;

public class Apple implements GamePiece {
    float mass;
    float diameter = 1.2f;
    int x, y;
    int size;


    //Setup some size constants
    public static final int SMALL = 0;
    public static final int MEDIUM = 1;
    public static final int LARGE = 2;

    //some helpers for optimizng the draw() method that can be called many
    int centerX, centerY;
    int scaledLength;


    //boundary helper for optimizing collision detection with physicists and trees
    Rectangle boundingBox;

    // If we bumped into something, keep a reference to that thing around for cleanup and removal
    GamePiece collided;

    //Create default Medium apple

    public Apple() {
        this(MEDIUM);
    }

    public Apple(int size) {
        setSize(size);
    }

    public void setSize(int size) {
        if (size < SMALL) {
            size = SMALL;
        }
        if (size > LARGE) {
            size = LARGE;
        }

        this.size = size;
        switch (size) {
            case SMALL:
                diameter = 0.9f;
                mass = 0.5f;
                break;
            case MEDIUM:
                diameter = 1.0f;
                mass = 1.0f;
                break;
            case LARGE:
                diameter = 1.1f;
                mass = 1.8f;
                break;
        }

        scaledLength = (int) (diameter * Field.APPLE_SIZE_IN_PIXELS + 0.5);
        boundingBox = new Rectangle(x, y, scaledLength, scaledLength);

    }

    public double getDiameter() {
        return diameter;
    }


    @Override
    public void setPosition(int x, int y) {
        int offset = (int) (diameter * Field.APPLE_SIZE_IN_PIXELS / 2);
        this.centerX = x;
        this.centerY = y;
        boundingBox = new Rectangle(x, y, scaledLength, scaledLength);
    }

    @Override
    public int getPositionX() {
        return centerX;
    }

    @Override
    public int getPositionY() {
        return centerY;
    }

    @Override
    public Rectangle getBoundingBox() {
        return boundingBox;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillOval(x, y, scaledLength, scaledLength);
    }

    @Override
    public boolean isTouching(GamePiece otherPiece) {
        double xdiff = x - otherPiece.getPositionX();
        double ydiff = y - otherPiece.getPositionY();
        double distance = Math.sqrt(xdiff * xdiff + ydiff * ydiff);
        if (distance < diameter) {
            return true;
        } else {
            return false;
        }
    }

    public void printDetails() {
        System.out.println("mass: " + mass);
        //Print the exact diameter:
        //System.out.println(" diameter: " +diameter);
        String niceNames[] = getAppleSizes();
        if (diameter < 5.0f) {
            System.out.println(niceNames[SMALL]);
        } else if (diameter < 10.0f) {
            System.out.println(niceNames[MEDIUM]);
        } else {
            System.out.println(niceNames[LARGE]);
        }
        System.out.println(" position. [" + x + ", " + y + ")");


    }

    public static String[] getAppleSizes() {
        return new String[]
                {"SMALL", "MEDIUM", "LARGE"};
    }
}
