package ch005.polymorphism.method_call_binding.late_binding;

class Animal {
    //Geçersiz kılınabilir bir method
    public void sound() {
        System.out.println("Hayvan bir ses çıkarır.");
    }
}

class Dog extends Animal {
    //Köpek sınıfı Hayvan sınıfının sound methodunu geçersiz kılar.

    @Override
    public void sound() {
        System.out.println("Köpek havlar.");
    }
}

public class LateBinding {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        //Hayvan referans türü, Dog nesnesine işaret eder.
        //Geç bağlama: Çalışma zamanında Dog sınıfındaki sound() methodu çağrılır.
        myDog.sound();
    }

}
