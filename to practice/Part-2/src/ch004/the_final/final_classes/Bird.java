package ch004.the_final.final_classes;

class SmallWing {
}

final class Sparrow {
    int i = 3;
    int j = 1;
    SmallWing smallWing = new SmallWing();

    void f() {
    }

}

public class Bird {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.f();
        sparrow.i;
        sparrow.j;
    }
}
