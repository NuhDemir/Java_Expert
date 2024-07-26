package ch004.the_final.final_classes;

// Bu sınıf basit bir sınıftır ve herhangi bir özellik veya metod içermez.
class SmallWing {
}

// Bu sınıf final olarak tanımlanmıştır, bu da bu sınıfın başka bir sınıf tarafından genişletilemeyeceği (inherit edilemeyeceği) anlamına gelir.
final class Sparrow {
    // Sparrow sınıfının özellikleri.
    int i = 3;
    int j = 1;

    // Sparrow sınıfı içinde SmallWing türünde bir nesne.
    SmallWing smallWing = new SmallWing();

    // Sparrow sınıfı içinde basit bir metod.
    void f() {
    }
}

// Ana sınıf, burada program çalıştırılır.
public class Bird {
    public static void main(String[] args) {
        // Sparrow sınıfından bir nesne oluşturulur.
        Sparrow sparrow = new Sparrow();

        // Sparrow nesnesinin f() metodu çağrılır.
        sparrow.f();

        // Sparrow nesnesinin i özelliği çağrılır.
        // Ancak bu kod eksiktir ve hata verecektir.
//        sparrow.i;

        // Sparrow nesnesinin j özelliği çağrılır.
        // Ancak bu kod eksiktir ve hata verecektir.
//        sparrow.j=1;
    }
}
