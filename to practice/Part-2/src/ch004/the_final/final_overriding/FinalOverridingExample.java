package ch004.the_final.final_overriding;


// Bu sınıf final olarak tanımlanmıştır, yani bu sınıf başka bir sınıf tarafından genişletilemez.
final class FinalClass {
    // Bu metod final olarak tanımlanmıştır, yani bu metod alt sınıflarda override edilemez.
    final void finalMethod() {
        System.out.println("FinalClass.finalMethod() çağrıldı.");
    }
}

// Bu sınıf FinalClass'ı genişletmeye çalışır ama bu mümkün değildir, çünkü FinalClass final olarak tanımlanmıştır.
// Bu nedenle bu sınıfın oluşturulması da mümkün olmayacaktır.
// class AttemptToExtendFinalClass extends FinalClass {
//     // Bu metod, final olarak tanımlandığı için override edilemez.
//     void finalMethod() {
//         System.out.println("AttemptToExtendFinalClass.finalMethod() çağrıldı.");
//     }
// }

public class FinalOverridingExample {
    public static void main(String[] args) {
        // FinalClass'tan bir nesne oluşturuluyor.
        FinalClass finalClass = new FinalClass();
        // finalMethod metodu çağrılıyor.
        finalClass.finalMethod();

        // AttemptToExtendFinalClass sınıfı, FinalClass'tan türetilmeye çalışıldığı için
        // bu kodun çalıştırılması mümkün değildir ve derleme hatası alırsınız.
    }
}