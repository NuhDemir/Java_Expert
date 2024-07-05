package ch004;

import static ch004.BitwiseLogicalOperators.getBinary;

public class ShiftOperators {
    public static void main(String[] args) {

    }
    private static void makePositiveShifts()
    {

    }
    private static void makeNegativeShifts()
    {

    }

    private static void makeUnsignedShifts()
    {

    }
    public static void shiftCircular()
    {

    }

    public  void shifts()
    {
        System.out.println("Signed Shifts");
        int i = 512;
        System.out.println("i: " + i);
        i = i >> 1;
        System.out.println("i >> 1: " + i); // 256

        i = i >> 3;
        System.out.println("i >> 3: " + i); // 32

        i = i << 5;
        System.out.println("i << 5: " + i); // 1024

        System.out.println("\nSigned Shifts bit Patterns");
        i = 512;
        System.out.println("i:      " + i + " " + getBinary(i));
        i = i >> 1;
        System.out.println("i >> 1: " + i + " " + getBinary(i)); // 256
        i = i >> 1;
        System.out.println("i >> 1: " + i + " " + getBinary(i)); // 128
        i = i >> 7;
        System.out.println("i >> 7:   " + i + " " + getBinary(i)); // 1
        i = i >> 1;
        System.out.println("i >> 1:   " + i + " " + getBinary(i)); // 0
        i = i >> 1;
        System.out.println("i >> 1:   " + i + " " + getBinary(i)); // 0

        System.out.println();

        i = 1;
        System.out.println("i:         " + i + " " + getBinary(i)); // 1
        i = i << 1;
        System.out.println("i << 1:    " + i + " " + getBinary(i)); // 2
        i = i << 1;
        System.out.println("i << 1:    " + i + " " + getBinary(i)); // 4
        i = i << 7;
        System.out.println("i << 7:  " + i + " " + getBinary(i)); // 512
        i = i << 1;
        System.out.println("i << 1: " + i + " " + getBinary(i)); // 0
        i = i << 1;
        System.out.println("i << 1: " + i + " " + getBinary(i)); // 0

        System.out.println("\nSigned Shift of A Negative");

        i = -1;
        System.out.println("i:         " + i + " " + getBinary(i)); // -1
        i = i << 1;
        System.out.println("i << 1:    " + i + " " + getBinary(i)); // 2
        i = i << 3;
        System.out.println("i << 3:    " + i + " " + getBinary(i)); // 2
    }
}
