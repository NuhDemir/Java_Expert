package BankApp;


import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bank {
    private static String bankName = "Zero Banka A.Ş.";
    private static String branchName = "Merkez Şube";
    private static String bankCode = "14532";
    private static String branchCode = "55392";
    private static String address = "Refah Mah. Huzur Cad. No:001,Hiçlik";
    private static String phoneNumber = "+90 212 123 456";
    private static String email = "info@ZeroBank.com";
    private static String customerServicePhone = "+90 212 777 1111";
    public static String workingHours = "Pazartesi-Cuma: 09:00 - 17:00";


    public static List<String> transactionHistory = new ArrayList<>();

    public static void logTransaction(String message) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String timeStamp = LocalDateTime.now().format(formatter);
        transactionHistory.add(timeStamp + " - " + message);
    }

    public static void printTransactions() {
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    public static void displayInfo() {
        String bankInfo = String.format(
                "Banka Bilgileri:\n" +
                        "Banka Adı: %s\n" +
                        "Şube Adı: %s\n" +
                        "Banka Kodu: %s\n" +
                        "Şube Kodu: %s\n" +
                        "Adres: %s\n" +
                        "Telefon Numarası: %s\n" +
                        "E-posta Adresi: %s\n" +
                        "Müşteri Hizmetleri Telefonu: %s\n" +
                        "Çalışma Saatleri: %s",
                bankName, branchName, bankCode, branchCode, address, phoneNumber, email, customerServicePhone, workingHours
        );

        // Bilgileri yazdırma
        System.out.println(bankInfo);
    }

}