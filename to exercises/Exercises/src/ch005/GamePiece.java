package ch005;
import java.awt.*;
public interface GamePiece {
    //sets position of the piece on the playing field
    //(0,0) is the upper left per standard java drawwing methods

    void setPosition(int x,int y);
        //gets the current horizontal position of the piece on the field.
    int getPosition();

    int getPositionY();

    Rectangle getBoundingBox();
    /*
    * Draws the piece inside the given graphics context
    * Do not assume anything about the state of the context
    * */

    void draw(Graphics g);
    /*
    * Detect a collision with another piece on the field
    * By defimition, piece does Not touch itself (i.e it won't collide with itself)*/

    boolean isTouching(GamePiece otherPiece);
}
