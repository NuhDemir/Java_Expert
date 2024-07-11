package ch003;

import javax.swing.*;
import java.util.Random;

public class MathOps {

    public static void main(String[] args) {
        // Random sınıfını kullanarak rastgele sayılar üreteceğiz
        Random r = new Random(13);

        int i, j, k;

        // 1 ile 100 arasında rastgele bir sayı oluştur ve j'ye ata
        j = r.nextInt(100) + 1;
        System.out.println("j: " + j);

        // 1 ile 100 arasında rastgele bir sayı oluştur ve k'ye ata
        k = r.nextInt(100) + 1;
        System.out.println("k: " + k);

        // j ve k üzerinde çeşitli matematiksel işlemler yapıyoruz
        i = j + k;
        System.out.println("j + k : " + i);
        i = j - k;
        System.out.println("j - k : " + i);
        i = k / j;
        System.out.println("k / j : " + i);
        i = k * j;
        System.out.println("k * j : " + i);
        i = k % j;
        System.out.println("k % j : " + i);
        j %= k;
        System.out.println("j %= k : " + j);

        // Ondalık sayılar (float) üzerinde matematiksel işlemler yapıyoruz
        System.out.println("=============");
        System.out.println("Ondalık Sayılar:");
        float u, v, w; // double türü için de geçerlidir
        v = r.nextFloat();
        System.out.println("v: " + v);
        w = r.nextFloat();
        System.out.println("w: " + w);
        u = w + v;
        System.out.println("u = w + v: " + u);
        u = w - v;
        System.out.println("u = w - v: " + u);
        u = v * w;
        System.out.println("u = v * w: " + u);
        u = v / w;
        System.out.println("u = v / w: " + u);

        // Farklı veri türleri (byte, short, int, long ve double) üzerinde işlemler
        System.out.println("=============");
        System.out.println("\nbyte, short, int, long ve double:");

        // Aşağıdaki işlemler char, byte, short, int, long ve double türleri için de geçerlidir
        u += v;
        System.out.println("u += v: " + u);
        u -= v;
        System.out.println("u -= v: " + u);
        u *= v;
        System.out.println("u *= v: " + u);
        u /= v;
        System.out.println("u /= v: " + u);
    }
}
