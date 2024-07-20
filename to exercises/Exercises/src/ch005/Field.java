package ch005;

import ch001.App;

import javax.swing.*;
import java.awt.*;

public class Field extends JComponent {
    public static final float GRAVITY = 9.8F;
    public static final int STEP = 40;
    public static final int APPLE_SIZE_IN_PIXELS = 30;
    public static final int TREE_WIDTH_IN_PIXELS = 60;
    public static final int TREE_HEIGHT_PIXELS=2*TREE_WIDTH_IN_PIXELS;
    public static final int PHYSICIST_SIZE_IN_PIXELS=75;
    public static final int MAX_TREES=20;

    Color fieldColor= Color.GRAY;

    Apple a1=new Apple();
    Apple a2=new Apple();
    Tree tree = new Tree();
    Physicist physicist;
    //Methods
    public void setUpApples() {
        a1.diamete
    }

    public void setUpTree() {
    }

    public void setPlayer() {
    }

    protected void paintComponent(Graphics g) {
    }

    public void detectCollisions() {
    }
}
