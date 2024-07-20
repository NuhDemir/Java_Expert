package ch005;

import ch001.App;

import javax.swing.*;
import java.awt.*;

public class Field extends JComponent {
    public static final float GRAVITY = 9.8F;
    public static final int STEP = 40;
    public static final int APPLE_SIZE_IN_PIXELS = 30;
    public static final int TREE_WIDTH_IN_PIXELS = 60;
    public static final int TREE_HEIGHT_PIXELS = 2 * TREE_WIDTH_IN_PIXELS;
    public static final int PHYSICIST_SIZE_IN_PIXELS = 75;
    public static final int MAX_TREES = 20;

    Color fieldColor = Color.GRAY;

    Apple a1 = new Apple();
    Apple a2 = new Apple();
    Tree tree = new Tree();
    Physicist physicist;

    //Methods
    public void setUpApples() {
        a1.diameter = 3.0f;
        a1.mass = 5.0f;
        a1.x = 20;
        a1.y = 45;
        a2.diameter = 8.2f;
        a2.mass = 12.0f;
        a2.x = 79;
        a2.y = 53;
    }

    public void setUpTree() {

        // Unlike apples, we'll use the setPosition() method from our
        // GamePiece interface to setup our lonely tree
        tree.setPosition(500, 200);
    }

    public void setPlayer(Physicist p) {
        physicist = p;
    }

    protected void paintComponent(Graphics g) {

        g.setColor(fieldColor);
        g.fillRect(0, 0, getWidth(), getHeight());
        tree.draw(g);
        physicist.draw(g);
        a1.draw(g);
        a2.draw(g);

    }

    public void detectCollisions() {
        if (a1.isTouching(a2)){
            System.out.println("Collision detected!");
        }else {
            System.out.println("Apples are not touching");
        }
    }
}
