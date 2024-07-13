package ch004.control;

public class RandomBounds {
    public static void main(String[] args) {
        new TimedAbort(3); // 3 saniye sonra programı durdurmak için zamanlayıcı başlat

        // Komut satırı argümanını kontrol et
        switch (args.length == 0 ? "" : args[0]) {
            case "lower":
                // Math.random() çağrısı 0.0 değerini üretmedikçe döngüye devam et
                while (Math.random() != 0.0)
                    ; // Boş döngü, sadece bekleme amacıyla kullanılır
                System.out.println("Produced 0.0!"); // 0.0 üretildiğinde mesaj yazdır
                break;

            case "upper":
                // Math.random() çağrısı 1.0 değerini üretmedikçe döngüye devam et
                while (Math.random() != 1.0)
                    ; // Boş döngü, sadece bekleme amacıyla kullanılır
                System.out.println("Produced 1.0!"); // 1.0 üretildiğinde mesaj yazdır
                break;

            default:
                // Yanlış kullanım durumunda kullanıcıya doğru kullanımı göster
                System.out.println("Usage:");
                System.out.println("\tRandomBounds lower"); // lower seçeneği için örnek
                System.out.println("\tRandomBounds upper"); // upper seçeneği için örnek
                System.exit(1); // Hatalı kullanım durumunda programı sonlandır
        }
    }
}
