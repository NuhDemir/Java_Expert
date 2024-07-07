package ch005.loop;

public class ForDemo {

    public static void main(String[] args) {
        int sum = 0;

        // 0'dan 100'e kadar olan sayıları toplama döngüsü
        for (int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println("Toplam: " + sum);
        }

        System.out.println("\nÇarpım Tablosu");

        // 1'den 10'a kadar çarpım tablosu oluşturma döngüsü
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }

        System.out.println("\nFibonacci Sayıları:");

        // İlk iki Fibonacci sayısını tanımlama
        int f0 = 1;
        int f1 = 1;
        int fibonacciNumber;

        // İlk iki Fibonacci sayısını yazdırma
        System.out.format("%8d", f0);
        System.out.format("%8d", f1);

        // 3. Fibonacci sayısından başlayarak 30. Fibonacci sayısına kadar hesaplama ve yazdırma
        for (int i = 3; i <= 30; i++) {
            fibonacciNumber = f0 + f1;
            System.out.format("%8d", fibonacciNumber);
            f0 = f1;
            f1 = fibonacciNumber;

            // Her 10 sayıda bir yeni satıra geçme
            if (i % 10 == 0)
                System.out.println();
        }

        System.out.println("\nDöngü");

        // Bu döngü koşulu hiçbir zaman sağlanmadığı için çalışmaz
        for (int i = 1, j = i + 10; (i < 5 && j < 12); i++, j = i * 2) {
            System.out.println("i= " + i + " j= " + j);
        }

        int t = 6;

        // t değerini 8'e kadar 2 artırarak yazdırma döngüsü
        for (; t < 8; t += 2)
            System.out.println(t + "*");
        System.out.println(t);
        System.out.println();

        // Bu döngü başlangıç koşulu sağlanmadığı için çalışmaz
        for (int k = 8; k < 8; k++) {
            System.out.println("k: " + k);
        }

        // Sonsuz döngü ve break ile çıkma
        int i = 3;
        for (;;) {
            System.out.println(i);
            if (true)
                break;
            i++; // Bu kod erişilemez (dead code)
        }

        // Rastgele sayı üretme ve belirli bir koşulla döngüden çıkma
        for (;;) {
            double r = Math.random();
            if (r < 0.8)
                break;
            System.out.println(r);
        }
    }
}
