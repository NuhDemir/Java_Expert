package ch004.control;

public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = 2 * i)
            System.out.println("i= " + i + " j = " + j);
    }
}
