package ch001;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

class Qitem {
    int item,  // Bu değişken kullanılıyor mu? Kullanılmıyorsa kaldırabilirsiniz.
            n,  // Buffer'ın boyutu
            full,  // Dolu yerlerin sayısı
            empty;  // Boş yerlerin sayısı
    int[] buffer;  // Buffer (depo) dizisi

    Qitem(int n) {
        this.n = n;
        buffer = new int[n];
        full = 0;  // Başlangıçta dolu yer yok
        empty = n;  // Başlangıçta tüm yerler boş
    }

    int x;  // Bu değişken kullanılıyor mu? Kullanılmıyorsa kaldırabilirsiniz.
    // Semafor başlatılıyor
    static Semaphore sem = new Semaphore(1);

    Random random = new Random();

    // Tüketici işlemi
    void get() {
        while (full <= 0) ;  // Buffer'da öğe yoksa bekle
        try {
            sem.acquire();  // Semafor kontrolünü al
        } catch (InterruptedException e) {
            System.out.println("InterruptedException yakalandı");
        }
        int rand = random.nextInt(n);
        if (buffer[rand] == 1) {  // Rastgele bir pozisyonda öğe varsa
            buffer[rand] = 0;  // Öğeyi tüket
            full--;  // Dolu yer sayısını azalt
            empty++;  // Boş yer sayısını artır
            System.out.println("Tüketici " + rand + " konumunda tüketti, Buffer = " + Arrays.toString(buffer));
        }
        sem.release();  // Semaforu serbest bırak
    }

    // Üretici işlemi
    void put() {
        while (empty <= 0) ;  // Buffer'da boş yer yoksa bekle
        try {
            sem.acquire();  // Semafor kontrolünü al
        } catch (InterruptedException interruptedException) {
            System.out.println("InterruptedException yakalandı");
        }
        int rand = random.nextInt(n);
        if (buffer[rand] == 0) {  // Rastgele bir pozisyonda boş yer varsa
            buffer[rand] = 1;  // Öğeyi ekle
            empty--;  // Boş yer sayısını azalt
            full++;  // Dolu yer sayısını artır
            System.out.println("Üretici " + rand + " konumunda üretti, Buffer = " + Arrays.toString(buffer));
        }
        sem.release();  // Semaforu serbest bırak
    }
}

// Üretici sınıfı
class Producer extends Thread {
    Qitem qItem;
    long start = System.currentTimeMillis();  // Başlangıç zamanı
    long end;  // Bitiş zamanı
    long time;  // Çalışma süresi

    Producer(Qitem qItem, long time) {
        this.qItem = qItem;
        this.time = time;
        end = start + time;  // Bitiş zamanını hesapla
    }

    public void run() {
        while (System.currentTimeMillis() < end) {  // Belirtilen süre boyunca çalış
            qItem.put();  // Üretici işlemini gerçekleştir
        }
    }
}

// Tüketici sınıfı
class Consumer extends Thread {
    Qitem q;
    long start = System.currentTimeMillis();  // Başlangıç zamanı
    long end;  // Bitiş zamanı
    long time;  // Çalışma süresi

    Consumer(Qitem q, long time) {
        this.q = q;
        this.time = time;
        end = start + time;  // Bitiş zamanını hesapla
    }

    public void run() {
        while (System.currentTimeMillis() < end) {  // Belirtilen süre boyunca çalış
            q.get();  // Tüketici işlemini gerçekleştir
        }
    }
}

// Üretici-Tüketici başlatma sınıfı
public class ProducerConsumer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Programın süresini milisaniye cinsinden girin:");
        long time = sc.nextInt();
        System.out.print("Buffer boyutunu girin:");
        int n = sc.nextInt();
        Qitem q = new Qitem(n);  // Qitem nesnesi oluşturuluyor
        Producer p = new Producer(q, time);  // Üretici nesnesi oluşturuluyor
        Consumer c = new Consumer(q, time);  // Tüketici nesnesi oluşturuluyor
        p.start();  // Üretici başlatılıyor
        c.start();  // Tüketici başlatılıyor
    }
}
