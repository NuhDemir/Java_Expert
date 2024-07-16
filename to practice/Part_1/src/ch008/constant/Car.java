package ch008.constant;

public class Car {
    String make;       // Aracın markası
    String model;      // Aracın modeli
    String year;       // Aracın yılı
    int speed;         // Aracın hızı
    int distance;      // Aracın katettiği mesafe

    String owner;      // Aracın sahibi

    // final parametre
    public void speedUp(final int newSpeed) {
        // final anahtar kelimesi ile işaretlenen parametre değiştirilemez
        // newSpeed *= 2; // Bu satır hata verecektir çünkü final değişkenin değeri değiştirilemez
        speed = newSpeed; // Hızı yeni hız ile güncelle
    }

    public void setOwner(final String newOwner) {
        // final anahtar kelimesi ile işaretlenen parametre değiştirilemez
        // newOwner = "Nuh Demir"; // Bu satır hata verecektir çünkü final değişkenin değeri değiştirilemez
        owner = newOwner; // Sahibi yeni sahibi ile güncelle
    }
}
