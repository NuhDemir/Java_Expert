package ch004.the_final.final_overriding;

import ch004.protected_access.Orc;

// Bu sınıf içinde private ve final metodların nasıl kullanıldığını göstereceğiz.
class WithFinals {
    // Bu metod private olduğu için sadece bu sınıf içinde kullanılabilir.
    // Ayrıca final olduğu için alt sınıflarda override edilemez.
    private final void f() {
        System.out.println("WithFinals.f()");
    }

    // Bu metod da private olduğu için sadece bu sınıf içinde kullanılabilir.
    // Private metotlar otomatik olarak final olarak kabul edilir.
    // Bu metod da alt sınıflarda override edilemez.
    private void g() {
        System.out.println("WithFinals.g()");
    }
}

// Bu sınıf, WithFinals sınıfını genişletir (extends).
class OverridingPrivate extends WithFinals {
    // Bu metod private olduğu için sadece bu sınıf içinde kullanılabilir.
    // Ayrıca final olduğu için alt sınıflarda override edilemez.
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    // Bu metod da private olduğu için sadece bu sınıf içinde kullanılabilir.
    // Private metotlar otomatik olarak final olarak kabul edilir.
    // Bu metod da alt sınıflarda override edilemez.
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

// Bu sınıf, OverridingPrivate sınıfını genişletir (extends).
class OverridingPrivate2 extends OverridingPrivate {
    // Bu metod private olduğu için sadece bu sınıf içinde kullanılabilir.
    // Ayrıca final olduğu için alt sınıflarda override edilemez.
    private final void f() {
        System.out.println("OverridingPrivate2.f()");
    }

    // Bu metod public olarak tanımlanmış, bu nedenle diğer sınıflar tarafından erişilebilir.
    // Bu metod OverridingPrivate sınıfındaki private g() metodunu gizler.
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}

// Ana sınıf, burada program çalıştırılır.
public class FinalOverriding {
    public static void main(String[] args) {
        OverridingPrivate2 overridingPrivate2 = new OverridingPrivate2();
        // overridingPrivate2 nesnesinin f() metodu çağrılır.
        // Bu, OverridingPrivate2 sınıfındaki f() metodunu çalıştırır.
        overridingPrivate2.f();

        // overridingPrivate2 nesnesinin g() metodu çağrılır.
        // Bu, OverridingPrivate2 sınıfındaki g() metodunu çalıştırır.
        overridingPrivate2.g();

        // OverridingPrivate türünde bir değişken, OverridingPrivate2 nesnesine atanır.
        OverridingPrivate o1 = overridingPrivate2;

        // o1 nesnesinin f() metodu çağrılır.
        // Ancak f() metodu OverridingPrivate sınıfında private olarak tanımlandığı için
        // bu metot çağrılamaz ve derleme hatası oluşur.
        o1.f();

        // o1 nesnesinin g() metodu çağrılır.
        // Ancak g() metodu OverridingPrivate sınıfında private olarak tanımlandığı için
        // bu metot çağrılamaz ve derleme hatası oluşur.
        o1.g();

        // WithFinals türünde bir değişken, OverridingPrivate2 nesnesine atanır.
        WithFinals withFinals = overridingPrivate2;

        // withFinals nesnesinin f() metodu çağrılır.
        // Ancak f() metodu WithFinals sınıfında private olarak tanımlandığı için
        // bu metot çağrılamaz ve derleme hatası oluşur.
        withFinals.f();

        // withFinals nesnesinin g() metodu çağrılır.
        // Ancak g() metodu WithFinals sınıfında private olarak tanımlandığı için
        // bu metot çağrılamaz ve derleme hatası oluşur.
        withFinals.g();
    }
}
