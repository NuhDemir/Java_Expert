package ch004;

import java.util.Random;

public class RelationalOperators {

    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt() % 100; // Rastgele bir sayı oluştur ve 100 ile mod al
        int j = rand.nextInt() % 100; // Rastgele bir sayı oluştur ve 100 ile mod al

        prt("i: " + i);
        prt("j: " + j);
        prt("i > j durumu " + (i > j));
        prt("i >= j durumu " + (i >= j));
        prt("i < j durumu " + (i < j));
        prt("i <= j durumu " + (i <= j));
        prt("i == j durumu " + (i == j));
        prt("i != j durumu " + (i != j));

        System.out.println("----------");

        // Karakter karşılaştırmaları
        char c1 = 'a';
        char c2 = 'x';
        prt("a > x durumu " + (c1 > c2));
        prt("a < x durumu " + (c1 < c2));

        c1 = 's';
        c2 = 'q';
        prt("s > q durumu " + (c1 > c2));

        c1 = 'ü'; // Unicode 0x00FC
        c2 = 'ı'; // Unicode 0x0131
        prt("ü < ı durumu " + (c1 < c2));

        System.out.println("--------------");

        // Boolean karşılaştırmaları
        boolean b1 = true;
        boolean b2 = false;
        if (b1 == b2)
            prt("Eşit");
        else
            prt("Eşit değil");

        if (b1)
            prt("true!");

        System.out.println("-----------");

        // String karşılaştırmaları
        String s1 = new String("String");
        String s2 = new String("String");

        // s1 ve s2 referans olarak farklı olduğu için "Different" çıktısını verecek
        if (s1 == s2)
            prt("Aynı");
        else
            prt("Farklı");
    }

    static void prt(String s) {
        System.out.println(s);
    }
}
