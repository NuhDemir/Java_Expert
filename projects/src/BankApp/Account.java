package BankApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    private String accountHolderName;
    private String accountNumber;
    private String owner;
    private double balance;
    private boolean isActive;
    public LocalDateTime creationDate;

    private final String tlArt = "TL";

    public Account(String accountHolderName, String accountNumber, String owner, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        this.isActive = true; // Yeni hesaplar varsayılan olarak aktif olacaktır
        this.creationDate = LocalDateTime.now();
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public String getTlArt() {
        return tlArt;
    }

    public void rename() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yeni Kullanıcı Adı: ");
        String newName = scanner.nextLine();
        String oldName = this.accountHolderName;
        String oldOwner = this.owner;
        this.owner = newName;
        this.accountHolderName = newName;
        System.out.println("Kullanıcı Adınız başarıyla Güncellenmiştir.");
        String message = "Eski Kullanıcı adı " + oldName + " " + newName + " olarak değiştirilmiştir.";
        Bank.logTransaction(message); // İşlemi kaydediyoruz...
    }

    public void deposit(double amount) {
        if (!isActive) {
            System.out.println("Hesap aktif değil, işlem yapılamaz!");
            return;
        }
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
        if (!isActive) {
            System.out.println("Hesap aktif değil, işlem yapılamaz!");
            return;
        }
        if (amount <= 0) {
            System.out.println("Geçersiz çekim miktarı!");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            String message = "Withdraw: " + amount + " " + tlArt;
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
        if (!isActive) {
            System.out.println("Hesap aktif değil, işlem yapılamaz!");
            return;
        }
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

    public void transfer(Account targetAccount, double amount) {
        if (!isActive) {
            System.out.println("Hesap aktif değil, işlem yapılamaz!");
            return;
        }
        if (amount <= 0) {
            System.out.println("Geçersiz transfer miktarı!");
            return;
        }

        if (this.balance >= amount) {
            this.balance -= amount;
            targetAccount.balance += amount;
            String message = "Transfer: " + amount + " " + tlArt + " to account " + targetAccount.accountNumber;
            System.out.println("Transfer successful! Yeni hesap bakiyeniz: " + this.balance + " " + tlArt);
            Bank.logTransaction(message);
        } else {
            String message = "Failed transfer: " + amount + " " + tlArt + " to account " + targetAccount.accountNumber;
            System.out.println("Yetersiz Bakiye!!!");
            System.out.println((amount - this.balance) + " " + tlArt + "'ye ihtiyacınız var.");
            Bank.logTransaction(message);
        }
    }

    public void updateAccountNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yeni Hesap Numarası: ");
        String newAccountNumber = scanner.nextLine();
        String oldAccountNumber = this.accountNumber;
        this.accountNumber = newAccountNumber;
        System.out.println("Hesap Numaranız başarıyla Güncellenmiştir.");
        String message = "Eski Hesap Numarası: " + oldAccountNumber + " " + newAccountNumber + " olarak değiştirilmiştir.";
        Bank.logTransaction(message);
    }

    public void viewTransactionHistory() {
        System.out.println("Transaction History for Account: " + accountNumber);
        for (String transaction : Bank.transactionHistory) {
            System.out.println(transaction);
        }
    }

    public void calculateInterest(double interestRate) {
        if (!isActive) {
            System.out.println("Hesap aktif değil, işlem yapılamaz!");
            return;
        }
        if (interestRate < 0) {
            System.out.println("Geçersiz faiz oranı!");
            return;
        }
        double interest = balance * (interestRate / 100);
        balance += interest;
        String message = "Interest added: " + interest + " " + tlArt;
        System.out.println("Faiz eklendi: " + interest + " " + tlArt);
        System.out.println("Yeni hesap bakiyeniz: " + balance + " " + tlArt);
        Bank.logTransaction(message);
    }

    public void closeAccount() {
        if (!isActive) {
            System.out.println("Hesap zaten kapalı!");
            return;
        }
        this.isActive = false;
        String message = "Hesap kapatıldı: " + accountNumber;
        System.out.println("Hesap başarıyla kapatılmıştır.");
        Bank.logTransaction(message);
    }

    public void activateAccount() {
        if (isActive) {
            System.out.println("Hesap zaten aktif!");
            return;
        }
        this.isActive = true;
        String message = "Hesap aktif hale getirildi: " + accountNumber;
        System.out.println("Hesap başarıyla aktif hale getirilmiştir.");
        Bank.logTransaction(message);
    }

    public void deactivateAccount() {
        if (!isActive) {
            System.out.println("Hesap zaten pasif!");
            return;
        }
        this.isActive = false;
        String message = "Hesap pasif hale getirildi: " + accountNumber;
        System.out.println("Hesap başarıyla pasif hale getirilmiştir.");
        Bank.logTransaction(message);
    }

    public void changeOwner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yeni Hesap Sahibi Adı: ");
        String newOwner = scanner.nextLine();
        String oldOwner = this.owner;
        this.owner = newOwner;
        System.out.println("Hesap Sahibi başarıyla Güncellenmiştir.");
        String message = "Eski Hesap Sahibi: " + oldOwner + " " + newOwner + " olarak değiştirilmiştir.";
        Bank.logTransaction(message);
    }

    public static List<Account> accounts = new ArrayList<>();
}
