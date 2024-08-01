package BankApp;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Account {
    private String accountHolderName;
    private String accountNumber;
    private String owner;
    private double balance;
    public LocalDateTime creationDate;

    private final String tlArt ="TL";

    public Account(String accountHolderName, String accountNumber, String owner, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        this.creationDate = LocalDateTime.now();
    }


    public void rename() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yeni Kullanıcı Adı: ");
        String newName = scanner.nextLine();
        String oldName = this.accountHolderName;
        String oldowner = this.owner;
        this.owner=newName;
        this.accountHolderName = newName;
        System.out.println("Kullanıcı Adınız başarıyla Güncellenmiştir.");
        String message = "Eski Kullanıcı adı" + oldName + "\n" + newName + " olarak değiştirilmiştir.";
        Bank.logTransaction(message);//İşlemi kaydediyoruz...
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Geçersiz depozit miktarı!");
            return;
        }

        balance += amount;
        String message = "Deposit: " + amount + " " + tlArt;
        System.out.println("Yeni hesap bakiyeniz: " + balance + " " + tlArt);
        Bank.logTransaction(message);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Geçersiz çekim miktarı!");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            String message = "withdraw: " + amount + " " + tlArt;
            System.out.println("Çekilen Tutar: " + amount + " " + tlArt);
            System.out.println("Kalan Tutar: " + balance);
            Bank.logTransaction(message);
        } else {
            String message = "Failed withdraw: " + amount + " " + tlArt;
            System.out.println("Yetersiz Bakiye!!!");
            System.out.println((amount - balance) + " " + tlArt + "'ye ihtiyacınız var.");
            Bank.logTransaction(message);

        }

    }

    public void viewBalance() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedCreationDate = creationDate.format(formatter);
        String message = "Viewed Balance: " + balance + " TL";
        System.out.println("Account Holder Name: " + accountHolderName +
                "\nAccount Number: " + accountNumber +
                "\nOwner: " + owner +
                "\nBalance: " + balance + " " + tlArt +
                "\nCreation Date: " + formattedCreationDate);
        Bank.logTransaction(message);  // İşlemi kaydediyoruz...
    }

    public static List<Account> accounts = new ArrayList<>();

}
