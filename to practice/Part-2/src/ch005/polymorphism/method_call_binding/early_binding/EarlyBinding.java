package ch005.polymorphism.method_call_binding.early_binding;

class Animal {

    //static bir method sınıf adı ile çağrılır
    public static void staticMethod() {
        System.out.println("This is a static method in Animal class.");
    }

    //final bir method, alt sınıflar tarafından geçersiz kılınamaz.
    public final void finalMethod() {
        System.out.println("This is a final method in Animal class.");
    }
}

public class EarlyBinding {
    public static void main(String[] args) {

        //static method doğrudan sınıf adı ile çağrılır.
        Animal.staticMethod();//Erken bağlama

        Animal animal = new Animal();

        //Final method nesne üzerinden çağrılır
        animal.finalMethod();//Erken bağlama
    }

}
