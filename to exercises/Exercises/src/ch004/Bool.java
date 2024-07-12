package ch004;

import java.util.Random;

public class Bool {
    public static void main(String[] args) {
        Random r = new Random();
        int  i = r.nextInt(100);
        int j = r.nextInt();
        System.out.println();

        System.out.println("i = " +i);
        System.out.println("j = " +j);
        System.out.println("i < j is " +(i<j));
        System.out.println("i > j is " +(i>j));
        System.out.println("i >= j is " +(i>=j));
        System.out.println("i == j is " +(i<=j));
System.out.println("i!= j is " + (i != j));





    }
}
