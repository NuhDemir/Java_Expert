package ch005.polymorphism.overriding_;

public class TeacherCreditManager extends BaseCreditManager {


    @Override
    public double calculate(double amount) {
        System.out.print("Teacher interest rate: ");
        return +amount * 1.12;
    }
}
