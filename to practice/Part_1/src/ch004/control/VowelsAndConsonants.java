package ch004.control;

import java.util.Random;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(); // Rastgele sayı üreteci oluştur
        for (int i = 0; i < 100; i++) { // 100 defa döngüye gir
            int c = rand.nextInt(26) + 'a'; // 'a' ile 'z' arasında rastgele bir karakter seç
            System.out.println((char) c + ", " + c + ": "); // Seçilen karakteri ve ASCII değerini yazdır

            switch (c) {
                // Ünlü harfler
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Ünlü harf"); // Ünlü harf olduğunu yazdır
                    break;
                // Bazen ünlü harf olanlar
                case 'y':
                case 'w':
                    System.out.println("Bazen ünlü harf."); // Bazen ünlü harf olduğunu yazdır
                    break;
                // Diğer tüm harfler ünsüz
                default:
                    System.out.println("Ünsüz harf"); // Ünsüz harf olduğunu yazdır
            }
        }
    }
}
