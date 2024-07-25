package ch003.reuse;


// Duş almak isteyen birinin küvetinde neler olabileceğini gösteren sınıflar

// Su sınıfı
class Water {
    private String status;

    // Yapıcı (Constructor)
    Water() {
        System.out.println("Water()");
        status = "Constructed";  // Su nesnesi oluşturulduğunda, status değeri "Constructed" olarak ayarlanır.
    }

    @Override
    public String toString() {
        return status;  // Su nesnesinin toString() metodu, status değerini döner.
    }
}

// Küvet (Tub) sınıfı
public class Tub {
    // Değişkenlerin başlatılması
    private String
            soap = "sabun",  // 1. Doğrudan başlatma (Direct Initialization)
            shampoo = "şampuan",
            towel, conditioner; // Değişkenlerin varsayılan değerleri null

    private Water water;
    private int temperature;
    private float waterLevel;

    // 2. Yapıcı (Constructor) başlatma
    public Tub() {
        System.out.println("Inside Tub()");
        towel = "havlu";
        waterLevel = 10.5f;
        water = new Water();
    }

    // 3. Örnek başlatma bloğu (Instance Initialization Block)
    {
        temperature = 40;
    }

    @Override
    public String toString() {
        // 4. Lazım olduğu anda başlatma (Lazy Initialization)
        if (conditioner == null) {
            conditioner = "saç kremi";
        }
        return "soap: " + soap + " \n " +
                "shampoo: " + shampoo + " \n " +
                "towel: " + towel + " \n " +
                "conditioner: " + conditioner + " \n " +
                "temperature: " + temperature + " \n " +
                "waterLevel: " + waterLevel + " \n " +
                "water: " + water;
    }

    public static void main(String[] args) {
        Tub tub = new Tub();  // Yeni bir Tub nesnesi oluşturulur.
        System.out.println(tub);  // Tub nesnesi ekrana yazdırılır.
    }
}
