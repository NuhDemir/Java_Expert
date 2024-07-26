package ch004.the_final.initialization_and_inheritance;

// Üst sınıf Insect
class Insect {
    // private bir değişken
    private int i = 9;
    // protected bir değişken
    protected int j;

    // Insect sınıfının yapıcı metodu (constructor)
    Insect() {
        // i ve j değişkenlerinin değerleri yazdırılıyor
        System.out.println("i: " + i + "\n j: " + j);
        // j değişkenine yeni bir değer atanıyor
        j = 33;
    }

    // static bir değişken ve bu değişken printInit metodunu çağırarak başlatılıyor
    private static int a1 = printInit("static insect.a initialized.");

    // static bir metod, bir string parametre alır ve bu stringi yazdırır, ardından 46 döner
    static int printInit(String word) {
        System.out.println(word);
        return 46;
    }
}

// Beetle sınıfı, Insect sınıfından türetilmiştir (extends)
public class Beetle extends Insect {
    // private bir değişken ve bu değişken printInit metodunu çağırarak başlatılıyor
    private int k = printInit("Beetle.k initialized.");

    // Beetle sınıfının yapıcı metodu (constructor)
    public Beetle() {
        // k değişkeninin değeri yazdırılıyor
        System.out.println("k: " + k);
        // j değişkeninin değeri yazdırılıyor (Insect sınıfından miras alınmış)
        System.out.println("j: " + j);
    }

    // static bir değişken ve bu değişken printInit metodunu çağırarak başlatılıyor
    private static int a2 = printInit("static Beetle.a2 initialized.");

    // programın başlangıç noktası
    public static void main(String[] args) {
        // Constructor mesajı yazdırılıyor
        System.out.println("Beetle Constructor.");
        // Beetle sınıfından bir nesne oluşturuluyor, bu da yapıcı metodların çalışmasına neden olur
        Beetle beetle = new Beetle();
    }
}
