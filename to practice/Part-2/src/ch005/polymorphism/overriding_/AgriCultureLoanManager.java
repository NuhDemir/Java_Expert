package ch005.polymorphism.overriding_;

public class AgriCultureLoanManager extends BaseCreditManager {


    @Override
    public double calculate(double amount) {
        System.out.print("AgriCulture interest rate: ");
        return +amount * 1.18;
    }
}
