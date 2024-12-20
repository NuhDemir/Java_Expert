package ch008.housekeeping.methodOverloading;

class Tree {
    int height;
    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is " +
                height + " feet tall");
    }
    void info() {
        System.out.println(
                "Tree is " + height + " feet tall");
    }
    void info(String s) {
        System.out.println(
                s + ": Tree is " + height + " feet tall");
    }
}

public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i< 5; i++)
        {
            Tree tree1 = new Tree(i);
            tree1.info();
            tree1.info("overloading method");

            //Calls overloaded constructor
            new Tree();
        }
    }
}