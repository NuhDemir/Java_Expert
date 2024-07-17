package ch008.housekeeping.constructor;
class Leaf {
    Leaf() {
        System.out.println("LEAF");
    }
}
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i= 0; i<10;i++) {
            new Leaf();
        }
    }
}
