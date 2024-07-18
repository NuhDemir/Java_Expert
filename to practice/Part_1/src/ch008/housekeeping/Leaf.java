package ch008.housekeeping;

public class Leaf {
    int i = 0;

    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i değerlerinin toplamı= " + i);
    }

    public static void main(String[] args) {
        Leaf l = new Leaf();
        l.increment().increment().increment().increment().print();
    }

}
