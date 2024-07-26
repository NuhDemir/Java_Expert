package ch004.the_final.initialization_and_inheritance;


// final değişkenlerle ilgili bir sınıf.
public class FinalInitializationExample {
    // final değişkenler sınıf seviyesinde tanımlanır.
    // Sınıf seviyesindeki final değişkenler ya tanımlandıkları yerde ya da yapıcı metod (constructor) içinde başlatılmalıdır.
    final int a; // Yapıcı metod içinde başlatılacak
    final int b = 2; // Tanımlandığı yerde başlatılmış

    // final static değişkenler de ya tanımlandıkları yerde ya da static blok içinde başlatılmalıdır.
    static final int c;
    static final int d = 4; // Tanımlandığı yerde başlatılmış

    // Static blok, final static değişkenleri başlatmak için kullanılır.
    static {
        c = 3;
    }

    // Yapıcı metod, sınıf seviyesindeki final değişkenleri başlatmak için kullanılır.
    FinalInitializationExample(int a) {
        this.a = a; // final değişken a, yapıcı metod içinde başlatılıyor
    }

    // final metod parametreleri
    void printValues(final int e) {
        // e = 5; // final metod parametreleri yeniden atanamaz, bu satır hata verecektir
        System.out.println("e: " + e);
    }

    public static void main(String[] args) {
        // FinalInitializationExample sınıfından bir nesne oluşturuluyor ve a değişkenine 1 değeri atanıyor.
        FinalInitializationExample example = new FinalInitializationExample(1);

        // Nesnenin final değişkenleri ve static final değişkenleri yazdırılıyor.
        System.out.println("a: " + example.a); // 1
        System.out.println("b: " + example.b); // 2
        System.out.println("c: " + FinalInitializationExample.c); // 3
        System.out.println("d: " + FinalInitializationExample.d); // 4

        // printValues metodu çağrılarak final parametre kullanımı gösteriliyor.
        example.printValues(5);
    }
}