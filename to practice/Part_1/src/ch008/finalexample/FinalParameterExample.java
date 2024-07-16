package ch008.finalexample;

public class FinalParameterExample {

    public static void main(String[] args) {
        final int number = 10; // final değişken, değeri bir kez atanabilir
        System.out.println("Final değişkenin değeri: " + number);

        // Metodlara final parametre göndermenin örnekleri
        printValue(number); // final parametre ile metot çağrısı
        modifyValue(number); // final parametre ile değişiklik yapılmaya çalışılması

        // final referans örneği
        final Car myCar = new Car("Toyota", "Corolla", 2020);
        System.out.println("Araba markası: " + myCar.make);
        // myCar = new Car("Honda", "Civic", 2021); // Bu satır hata verecektir, final referansa yeniden atama yapılamaz

        myCar.setOwner("Ahmet");
        System.out.println("Araba sahibi: " + myCar.owner);
    }

    // final parametre ile metot
    public static void printValue(final int value) {
        System.out.println("Metot içinde değer: " + value);
        // value = 20; // Bu satır hata verecektir, final parametre değiştirilemez
    }

    // final parametreyi değiştirmeye çalışmak
    public static void modifyValue(final int value) {
        // Aşağıdaki işlem hata verecektir
        // value += 5; // final parametre değiştirilemez
        System.out.println("Değeri değiştirmeye çalıştık ama final olduğu için değiştiremedik: " + value);
    }
}

// Araba sınıfı
class Car {
    String make;
    String model;
    int year;
    String owner;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.owner = null; // Başlangıçta sahibi yok
    }

    public void setOwner(final String newOwner) {
        this.owner = newOwner; // final parametre kullanılsa bile burada değişiklik yapılabilir
        // newOwner = "Mehmet"; // Bu satır hata verir çünkü newOwner final
    }
}
