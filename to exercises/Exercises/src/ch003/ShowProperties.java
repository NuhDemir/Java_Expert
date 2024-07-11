package ch003;

public class ShowProperties {

    public static void main(String[] args) {
        // Sistemin tüm özelliklerini alır ve standart çıktıya listeler
        System.getProperties().list(System.out);

        // Sistemin özelliklerini yazdırır
        System.out.println("Özellikler: " + System.getProperties());

        // Sistemin özelliklerini tekrar yazdırır
        System.out.println(
                System.getProperties()
        );
    }
}
