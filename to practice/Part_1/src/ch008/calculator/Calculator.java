package ch008.calculator;

import ch008.overloading.CalculatorOverloaded;

public class Calculator {

    String name;

    public String getName() {
        return name;

    }

    public void setName(String newName) {
        name = newName;
    }

    void WhoAreYou() {
        System.out.println("I'm a Calculator :) , my name is " + name);
    }

    public int add(int first, int second) {
        return first + second;
    }

    public int add(int first, int second, int third) {
        return first + second + third;
    }

    public int substract(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) {
        int sonuc = first * second;
        return sonuc;
    }

    public int multiplyByAdding(int first, int second) {
        int multiplication = 0;
        for (int i = 1; i <= second; i++)
            multiplication += first;
        System.out.println("Multiplication: " + multiplication);
        return multiplication;
    }

    public double divide(int first, int second) {
        return (double) first / second;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setName("Texas Instruments T-302");
        calculator.WhoAreYou();

        int i = calculator.add(12, 43, 22);
        System.out.println("12 + 43 + 22");

        double d = calculator.divide(11, 22);
        System.out.println("11/22");

        System.out.println("5-3" + calculator.substract(5, 3));
        System.out.println("5*3" + calculator.multiply(5, 3));
        //Calling it for its side effects
        calculator.multiplyByAdding(22, 11);
    }

}
