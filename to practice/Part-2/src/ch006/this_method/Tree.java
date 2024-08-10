package ch006.this_method;

public class Tree {
    float height;
    String type;

    public Tree() {

    }

    public Tree(String type, float height) {
        this.height = height;
        this.type = type;
    }

    public Tree copy() {
        Tree copy = new Tree(type, height);
        return copy;
    }

    public Tree grow() {
        height++;
        return this;
    }

    public void printInfo() {
        System.out.println("\nTree Info:");
        System.out.println("Type: " + type);
        System.out.println("Height" + height);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("Pine", 12.4f);
       tree.printInfo();
        Tree copyTree = tree.copy();

        copyTree.printInfo();

        System.out.println("------------------");

        if (tree == copyTree)
            System.out.println("The same");
        else
            System.out.println("Diferent");

        tree.grow().grow().grow().grow().grow().printInfo();

        Tree grownTree = tree.grow();
        grownTree.printInfo();

        System.out.println("------------------");



    }


}
