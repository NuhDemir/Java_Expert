package ch005.algorithm;

import java.util.Scanner;

public class FactorialByRecursion {

    long factorial = 1;

    public static void main(String[] args) {
        FactorialByRecursion recursion = new FactorialByRecursion();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number to calculate its factorial:");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Number must be a positive integer.");
        } else if (number == 0 || number == 1) {
            System.out.println("Factorial of " + number + " is " + 1);
        } else {
            long factorial = recursion.calculateFactorial(number);
            if (factorial < 0)
                System.out.println("Factorial of " + number + " is out of range!");
            else
                System.out.println("Factorial of " + number + " is " + factorial);
        }
    }

    public long calculateFactorial(int n){
        if (n == 1)
            factorial = 1;
        else
            factorial = n * calculateFactorial(n-1);
        return factorial;
    }
}
