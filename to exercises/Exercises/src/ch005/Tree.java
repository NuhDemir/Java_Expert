package ch005;

import java.awt.*;

public class Tree implements GamePiece {
    int x, y;

    //Drawing Helper
    private Color leafColor = Color.GREEN.darker();
    private Color trunkColor = new Color(101, 67, 44);
    private int trunkWidth = (int) (Field.TREE_WIDTH_IN_PIXELS);
    private int trunkHeight = (int) (Field.TREE_HEIGHT_PIXELS);
    private int trunkX, trunkY;

    private Rectangle boundingBox;
@Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
        trunkX = x+(Field.TREE_WIDTH_IN_PIXELS-trunkWidth)/2;
        trunkY = y+2*Field.TREE_HEIGHT_PIXELS-trunkHeight;
boundingBox = new Rectangle(x,y,Field.TREE_WIDTH_IN_PIXELS,Field.TREE_HEIGHT_PIXELS);
    }

    


}
