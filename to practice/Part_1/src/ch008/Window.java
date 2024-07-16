package ch008;

public class Window {

    boolean open;
     int width;
    int height;

    public  boolean isOpen()
    {
        return open;
    }

    public void setOpen(boolean open)
    {
        this.open = open;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }


    public void open()
    {
        if ( open = true)
        {System.out.println("Kapı açık");}

    }

    public void close()
    {
        if (open = false)
        {
            System.out.println("Kapı kapalı, kapat şunu!!");
        }
    }


}
