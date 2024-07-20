package ch005;

import java.awt.*;

public class Apple implements GamePiece {
    float mass;
    float diemeter = 1.2f;
    int x, y;
    int size;


    //Setup some size constants
    public static final int SMALL = 0;
    public static final int MEDIUM = 1;
    public static final int LARGE = 2;

    //some helpers for optimizng the draw() method that can be called many
    int centerX,centerY;
    int scaledLength;


    @Override
    public void setPosition(int x, int y) {

    }

    @Override
    public int getPositionX() {
        return 0;
    }

    @Override
    public int getPositionY() {
        return 0;
    }

    @Override
    public Rectangle getBoundingBox() {
        return null;
    }

    @Override
    public void draw(Graphics g) {

    }

    @Override
    public boolean isTouching(GamePiece otherPiece) {
        return false;
    }
}
