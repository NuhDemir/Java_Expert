package ch005;

public class StackOverflowError {
    static int i;

    public static void main(String[] args) {
        // Rekürsif çağrı (kendi kendini çağırma) yaparak StackOverflowError hatasını tetiklemek için
        main(null);
    }

    // Açıklamalarla birlikte StackOverflowError hatasını gösteren kod
    public static void mainExplained(String[] args) {
        i++; // Her çağrıda i değişkenini bir arttır
        try {
            // main metodunu tekrar çağırarak rekürsif bir döngü yaratıyoruz
            mainExplained(null);
        } catch (java.lang.StackOverflowError e) {
            // StackOverflowError hatası yakalandığında
            System.out.println("Hata: " + e); // Hatanın tipini yazdır
            System.out.println("Hata mesajı: " + e.getMessage()); // Hatanın mesajını yazdır (genellikle null)
            System.out.println("Çağrı sayısı: " + i); // Kaç kez çağrıldığını yazdır
        }
    }
}
/*
Rekürsif Çağrı: main metodunun kendisini
tekrar çağırması, Java yığınında (stack)
her çağrı için yeni bir kayıt oluşturur.
Bu kayıtlar yığın dolana kadar devam eder.
Yığının Dolması: Java yığını, her metod
çağrısı için hafızada belirli bir yer ayırır.
Yığın dolduğunda, daha fazla metod çağrısı
için yer kalmaz ve StackOverflowError hatası
meydana gelir. Hata Yakalama: try-catch
bloğu kullanarak StackOverflowError
hatasını yakalayabiliriz. Bu hata, rekürsif
çağrıların yığını doldurması nedeniyle oluşur.

* */