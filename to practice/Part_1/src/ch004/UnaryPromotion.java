package ch004;

public class UnaryPromotion {

    public static void main(String[] args) {
        byte b = 2; // Byte türünde bir değişken tanımladık ve başlangıç değeri atadık
        b = (byte) +b; // İşaret değiştirme operatörü uygulandı (+b)
        b = (byte) -b; // İşaret değiştirme operatörü uygulandı (-b)
        b = (byte) ~b; // Bitwise NOT operatörü uygulandı (~b)

        byte b1 = ++b; // Pre-increment operatörü uygulandı (++b)
        System.out.println(b1); // Sonucu yazdır
    }

    // Unary Promotion Örneği
    public static void unaryPromotionExample() {
        byte b = 2; // Byte türünde bir değişken tanımladık ve başlangıç değeri atadık

        // Unary promotion işlemleri
        b = (byte) +b; // İşaret değiştirme operatörü uygulandı (+b)
        b = (byte) -b; // İşaret değiştirme operatörü uygulandı (-b)
        b = (byte) ~b; // Bitwise NOT operatörü uygulandı (~b)

        byte b1 = ++b; // Pre-increment operatörü uygulandı (++b)
        byte b2 = --b1; // Pre-decrement operatörü uygulandı (--b1)
        byte b3 = (byte) (b1 + b2); // Toplama işlemi ve sonucu byte türüne dönüştürme

        System.out.println("b1: " + b1); // b1'in değerini yazdır
        System.out.println("b2: " + b2); // b2'nin değerini yazdır
        System.out.println("b3: " + b3); // b3'ün değerini yazdır
    }

    // Yazdırma fonksiyonu
    static void prt(String s) {
        System.out.println(s);
    }
}
