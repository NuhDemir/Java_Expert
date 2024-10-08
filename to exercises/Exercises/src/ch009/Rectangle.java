package ch009;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class Rectangle implements Relatable{

public  int width=0;
public int height = 0;
public Point origin;

//Four Constructor

    public Rectangle(){
        origin=new Point(0,0);
    }

    public Rectangle(Point p){
        origin = p;
    }

    public Rectangle(int w,int h){
        origin = new Point(0,0);
        width=w;
        height=h;
    }

    public Rectangle(Point p,int w,int h){
        origin= p;
        width=w;
        height=h;
    }

    public void move(int x,int y){
        origin.x = x;
        origin.y=y;
    }

    public int getArea(){
        return width*height;
    }


    @Override
    public int isLargerThen(Relatable other) {
        Rectangle otherRect = (Rectangle) other;
        if (this.getArea()<otherRect.getArea())
            return -1;
        else if (this.getArea()>otherRect.getArea()) {
            return 1;
        }
        else return 0;
    }
}
