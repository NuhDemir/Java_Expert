package ch008.passing;

// ParameterPassing sınıfı
public class ParameterPassing {

    // Nesne referansı alan 'f' metodu
    public void f(A aa) {
        // aa nesnesinin 'i' değişkenini bir artır
        aa.i++;
    }

    // Temel veri türü (primitive) alan 'f' metodu
    public void f(int j) {
        // 'j' değerini bir artır
        j++;
    }

    // Ana metod (main)
    public static void main(String[] args) {
        // ParameterPassing sınıfından bir nesne oluştur
        ParameterPassing o = new ParameterPassing();

        // Temel veri türü (primitive) geçişi
        int i = 5;
        System.out.println("i'nin başlangıç değeri: " + i);
        o.f(i); // 'f' metoduna 'i' değişkenini geçir
        System.out.println("f metodundan sonra i'nin değeri: " + i);
        System.out.println("---------------");

        // Nesne referansı geçişi
        A a = new A();
        System.out.println("a.i'nin başlangıç değeri: " + a.i);
        o.f(a); // 'f' metoduna 'a' nesnesini geçir
        System.out.println("f metodundan sonra a.i'nin değeri: " + a.i);
    }
}

// A sınıfı
class A {
    int i = 5; // Tamsayı değişkeni
}
