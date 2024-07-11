package ch003;

// static anahtar kelimesinin kullanımını gösteren sınıf
public class StaticKeyword {

    // Bir static değişken tanımlayalım ve başlatalım
    static int i = 55;

    // Programın çalıştığı ana method
    public static void main(String[] args) {

        // static değişken i'nin başlangıç değerini yazdıralım
        System.out.println("i'nin başlangıç değeri: " + i);

        // StaticKeyword sınıfının örneklerini oluşturalım
        StaticKeyword st1 = new StaticKeyword();
        StaticKeyword st2 = new StaticKeyword();
        StaticKeyword st3 = new StaticKeyword();

        // Birden fazla örnek oluştursak da, static değişken i'nin tek bir kopyası vardır
        // Sınıf adı kullanarak static değişkeni artırma
        StaticKeyword.i++;
        System.out.println("Sınıf adı kullanarak artırmadan sonraki i değeri: " + i);

        // Incrementable sınıfının bir örneğini oluşturalım
        Incrementable sf = new Incrementable();

        // increment metodunu birkaç kez çağıralım
        sf.increment();
        sf.increment();
        sf.increment();

        // increment metod çağrılarından sonraki static değişken i'nin son değerini yazdıralım
        System.out.println("increment metod çağrılarından sonraki i değeri: " + i);
    }
}