package ch003;

public class Incrementable {


    // Static değişkeni artırmak için static metod
    public static void increment() {
        // StaticKeyword sınıfından static değişken i'yi artırma
        StaticKeyword.i++;
        // i'nin mevcut değerini yazdırma
        System.out.println("Artırmadan sonraki mevcut i değeri: " + StaticKeyword.i);
    }
}
