package ch003.reuse;

class WaterSource {
    private String status;  // WaterSource nesnesinin durumu.

    // WaterSource yapıcısı (constructor)
    WaterSource() {
        System.out.println("WaterSource()");
        status = "Constructed";  // WaterSource nesnesi oluşturulduğunda, status değeri "Constructed" olarak ayarlanır.
    }

    @Override
    public String toString() {
        return status;  // WaterSource nesnesinin toString() metodu, status değerini döner.
    }
}

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;  // 4 adet vana (valve) tanımlanır.
    private WaterSource waterSource = new WaterSource();  // WaterSource nesnesi oluşturulur.
    private int pressure;  // int tipinde basınç (pressure) değişkeni.
    private float flowRate;  // float tipinde akış hızı (flow rate) değişkeni.

    // toString() metodu, SprinklerSystem nesnesinin durumunu döner.
    @Override
    public String toString() {
        return
                "valve1 = " + valve1 + " " +  // valve1'in değeri
                        "valve2 = " + valve2 + " " +  // valve2'nin değeri
                        "valve3 = " + valve3 + " " +  // valve3'ün değeri
                        "valve4 = " + valve4 + "\n " +  // valve4'ün değeri
                        "pressure = " + pressure + " " + "flowRate = " + flowRate + " " +  // pressure ve flowRate değişkenlerinin değerleri
                        "waterSource = " + waterSource;  // WaterSource nesnesinin değeri
    }

    // Programın ana metodu (main)
    public static void main(String[] args) {
        // Yeni bir SprinklerSystem nesnesi oluşturulur.
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        // SprinklerSystem nesnesi ekrana yazdırılır.
        System.out.println("Sprinkler system: " + sprinklerSystem);
    }
}
