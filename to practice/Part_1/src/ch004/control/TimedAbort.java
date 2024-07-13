package ch004.control;

import java.util.concurrent.*;

// Zamanlayıcı ile belirli bir süre sonunda programı durduran sınıf
public class TimedAbort {
    private volatile boolean restart = true; // Zamanlayıcının yeniden başlatılması için kontrol değişkeni

    // Zamanlayıcıyı başlatan yapılandırıcı
    public TimedAbort(double t, String msg) {
        // Asenkron olarak çalışan bir iş parçacığı başlat
        CompletableFuture.runAsync(() -> {
            try {
                while (restart) { // Yeniden başlatma durumu kontrolü
                    restart = false; // Yeniden başlatma durumunu kapat
                    TimeUnit.MILLISECONDS.sleep((int) (1000 * t)); // Belirtilen süre boyunca bekle (milisaniye cinsinden)
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e); // Hata durumunda çalışma zamanı istisnası fırlat
            }
            System.out.println(msg); // Belirtilen mesajı yazdır
            System.exit(0); // Programı sonlandır
        });
    }

    // Varsayılan mesajla zamanlayıcıyı başlatan yapılandırıcı
    public TimedAbort(double t) {
        this(t, "TimedAbort: " + t); // Varsayılan mesajı ayarla ve ana yapılandırıcıyı çağır
    }

    // Zamanlayıcıyı yeniden başlatma işlevi
    public void restart() {
        restart = true; // Yeniden başlatma durumunu etkinleştir
    }
}
