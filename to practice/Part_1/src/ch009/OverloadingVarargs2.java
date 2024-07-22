package ch009;

public class OverloadingVarargs2 {

    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'x');
        //f('b', 'a');
        f(1);
    }
}
