package ch004;

public class UnaryOperators {

    public static void main(String[] args) {
        unaryOperators();
        unaryPromotion();
    }

    // Tekli Operatörler Örneği
    public static void unaryOperators() {
        // Aşağıdaki satırlar hata verecektir, çünkü tekli operatörler doğrudan bir değere uygulanamazlar:
        // -21; // Hata!
        // +a; // Hata!
        // -b; // Hata!

        int a = 3; // Bir integer değişken tanımlayalım

        int i = +12; // İşaret değiştirme operatörü (+) kullanımı
        int j = -i; // Negatif işaret operatörü (-) kullanımı
        int k = +i; // Tekrar işaret değiştirme operatörü (+) kullanımı
        int l = +-4; // İşaret değiştirme operatörleri (+ ve -) kullanımı
        prt("i: " + i + " j: " + j + " k: " + k + " l: " + l);

        int m = +-7; // İşaret değiştirme operatörleri (+ ve -) kullanımı
        int n = -+9; // İşaret değiştirme operatörleri (+ ve -) kullanımı
        int o = - -11; // Daha okunabilir hali - (-11) şeklinde kullanım
        int p = -(-13); // İşaret değiştirme operatörü ile negatif değer
        prt("m: " + m + " n: " + n + " o: " + o + " p: " + p);
    }

    // Tekli Yükseltme Örneği
    public static void unaryPromotion() {
        byte b1 = 11; // Byte türünde bir değişken tanımladık
        short s1 = 44; // Short türünde bir değişken tanımladık

        // Aşağıdaki satırlar hata verecektir, çünkü tekli operatörler doğrudan bir değere uygulanamazlar:
        // byte b2 = +b1; // Hata! Dönüşüm yapılması gerekiyor
        byte b2 = (byte) -b1; // Byte değerine işaret değiştirme operatörü uygulama

        // short s2 = -s1; // Hata! Dönüşüm yapılması gerekiyor
        short s2 = (short) -s1; // Short değerine işaret değiştirme operatörü uygulama

        int i = 7; // Integer türünde bir değişken tanımladık
        // byte b3 = -i; // Hata! Dönüşüm yapılması gerekiyor
        byte b3 = (byte) -i; // Byte değerine işaret değiştirme operatörü uygulama

        prt("b2: " + b2); // Sonucu yazdır
        prt("b3: " + b3); // Sonucu yazdır
        prt("s2: " + s2); // Sonucu yazdır

        byte b4 = ++b1; // OK. Dolaylı dönüşüm yapmadan önce işaret değiştirme operatörü uygulama
        short s4 = --s2; // OK. Dolaylı dönüşüm yapmadan önce işaret değiştirme operatörü uygulama

        long l = 12; // Long türünde bir değişken tanımladık
        l = -l; // Long değerine işaret değiştirme operatörü uygulama
        System.out.println(l); // Sonucu yazdır

        boolean isTrue = true; // Boolean türünde bir değişken tanımladık
        isTrue = !isTrue; // Boolean değerini tersine çevirme operatörü uygulama
        //!isTrue; // Derleyici hatası verir, çünkü tekli operatörler doğrudan bir değere uygulanamaz
    }

    // Yazdırma fonksiyonu
    static void prt(String s) {
        System.out.println(s);
    }
}
