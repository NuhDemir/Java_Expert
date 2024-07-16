package ch008.car.composite;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Zeynep'in bilgilerini oluşturma
        Person zeynep = new Person();
        zeynep.tckn = "1";
        zeynep.firstName = "Zeynep";
        zeynep.lastName = "Kaya";

        // Mercedes aracını oluşturma
        Car mercedes = new Car();
        mercedes.make = "Mercedes";
        mercedes.model = "E200";
        mercedes.year = "2011";
        mercedes.speed = 80;
        mercedes.distance = 30_000;

        // Zeynep ve Mercedes hakkında bilgi yazdırma
        System.out.println(mercedes.getInfo());
        System.out.println(zeynep.getInfo());

        System.out.println("*************");

        // Araç sahipliği ilişkisi
        mercedes.owner = zeynep;
        zeynep.vehicle = mercedes;

        // Hız artırma ve mesafe kat etme
        mercedes.speed = 100;
        mercedes.go(10);

        // Güncellenmiş bilgileri yazdırma
        System.out.println(mercedes.getInfo());
        System.out.println(zeynep.getInfo());

        System.out.println("*************");

        // BMW aracını oluşturma
        Car bmw = new Car();
        bmw.make = "BMW";
        bmw.model = "i8";
        bmw.year = "2019";
        bmw.speed = 0;
        bmw.distance = 0;

        // Ahmet'in bilgilerini oluşturma
        Person ahmet = new Person();
        ahmet.tckn = "2";
        ahmet.firstName = "Ahmet";
        ahmet.lastName = "Ozturk";

        // Ahmet BMW i8 satın alıyor
        ahmet.vehicle = bmw;
        bmw.owner = ahmet;

        // Araç ve sahibi hakkında bilgi yazdırma
        System.out.println(bmw.getInfo());
        System.out.println(ahmet.getInfo());

        System.out.println("*************");

        // Araçları değiştirme süreci
        System.out.println("Araç modellerini değiştirmek ister misiniz? (Evet/Hayır)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Evet")) {
            // Zeynep'in aracını değiştir
            System.out.println("Yeni Mercedes modeli girin:");
            String newMercedesModel = scanner.nextLine();
            mercedes.model = newMercedesModel;

            // Ahmet'in aracını değiştir
            System.out.println("Yeni BMW modeli girin:");
            String newBmwModel = scanner.nextLine();
            bmw.model = newBmwModel;

            System.out.println("Araçlar güncellendi!");
        }

        // Güncellenmiş araç bilgilerini yazdırma
        System.out.println(bmw.getInfo());
        System.out.println(mercedes.getInfo());
        System.out.println(zeynep.getInfo());
        System.out.println(ahmet.getInfo());

        // Araç ve sahiplik ilişkisini sıfırlama
        zeynep.vehicle = null;
        bmw.owner = null;

        scanner.close(); // Scanner'ı kapatma
    }
}
