package ch009;

public class AutoboxingVarargs {
    public static void f(Integer... args) {
        for (Integer i : args) {
            System.out.print(i + "  ");

        }
    }

    public static void main(String[] args) {
        f(1, 2);
        f(4, 5, 6, 7, 8);
        f(9, 10, 11, 12);
    }
}
