package BankApp;

import java.time.LocalDateTime;

public class App extends Bank {

    public static void main(String[] args) {
        Account account1 = new Account("Ali", "12345", "Ali Saygın", 2000.100);
        account1.viewBalance();
        account1.deposit(200);
        account1.withdraw(1200);
        account1.withdraw(0.0999999999999);
        account1.hashCode();

        System.out.println("account 1 hashCode(): " + account1.hashCode());
   System.out.println("Account 1 getClass(): "+account1.getClass());
   System.out.println(account1);
        account1.calculateInterest(22);
System.out.println("------------------------");
   Bank.displayInfo();
   Bank.logTransaction("message");
   Bank.printTransactions();
    }
}
