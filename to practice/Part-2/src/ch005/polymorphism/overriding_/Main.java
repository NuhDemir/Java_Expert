package ch005.polymorphism.overriding_;

import java.util.Base64;

public class Main {

    public static void main(String[] args) {
        BaseCreditManager[] baseCreditManager = new BaseCreditManager[]
                {new TeacherCreditManager(), new AgriCultureLoanManager()};

        for (BaseCreditManager baseCreditManager1 : baseCreditManager) {
            System.out.println( baseCreditManager1.calculate(1000)+" TL");
        }


    }
}
