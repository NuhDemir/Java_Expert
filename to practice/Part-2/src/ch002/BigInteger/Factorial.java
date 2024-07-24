package ch002.BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    // Belirtilen sayının faktöriyelini hesaplayan metot
    static BigInteger factorial(int number) {
        // Faktöriyel hesaplamasına başlangıç değeri olarak 1 atanır
        BigInteger fact = BigInteger.ONE;
        // 2'den başlayarak verilen sayıya kadar çarpma işlemi yapılır
        for (int i = 2; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact; // Faktöriyel değeri döndürülür
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesini ister
        System.out.println("Bir sayı giriniz: ");
        int number1 = scanner.nextInt();

        // Girilen sayının faktöriyelini hesaplar ve sonucu ekrana yazdırır
        System.out.println(number1 + " sayısının faktöriyel değeri: " + factorial(number1));
    }
}
