package ch005.polymorphism.overriding_;

import javax.swing.text.Style;

public class StudentCreditManager extends BaseCreditManager {

    @Override
    public double calculate(double amount) {
        System.out.print("Student interest rate: ");
        return +amount * 1.10;
    }
}
