package ch005.algorithm;

import java.util.Scanner;

public class FactorialByFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number to calculate its factorial:");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Number must be a positive integer.");
        } else if (number == 0 || number == 1) {
            System.out.println("Factorial of " + number + " is " + 1);
        } else {
    long factorial = calculateFactorial(number);
            if (factorial <= 0)
                System.out.println("Factorial of " + number + " is out of range!");
            else
                System.out.println("Factorial of " + number + " is " + factorial);
        }
    }

    public static  long calculateFactorial(int n)
    {
        long factorial = 1;
        for (int i = 1; i<=n; i++)
            factorial*=i;
        return factorial;
    }
}
