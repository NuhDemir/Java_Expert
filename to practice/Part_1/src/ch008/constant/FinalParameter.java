package ch008.constant;

public class FinalParameter {

    public static void main(String[] args) {
        // Car nesnesi final referanstır
        final Car car; // Nesne tanımlandı ama başlatılmadı

        // car sadece yukarıda tanımlandığı gibi bir kez atanabilir
        car = new Car(); // car referansına yeni bir Car nesnesi atanıyor
        car.make = "Mercedes"; // Aracın markası
        car.model = "E200"; // Aracın modeli
        car.year = "2011"; // Aracın yılı
        car.speed = 40; // Aracın hızı
        car.distance = 20_421; // Aracın katettiği mesafe

        // Aşağıdaki satır hata verecektir çünkü final referansa yeniden atama yapılamaz
        // car = new Car();

        car.speedUp(111); // Aracın hızını artırma
        car.setOwner("Ali"); // Aracın sahibini ayarlama
    }
}
