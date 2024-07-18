package ch009.static_data_iniialization;

import java.awt.image.VolatileImage;
import java.util.concurrent.CopyOnWriteArrayList;

// Bowl sınıfı
class Bowl {
    // Constructor (yapıcı metot) - Bowl nesnesi oluşturulduğunda çalışır
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    // f1 metodu - belirli bir işaretçi (marker) değeri ile çalışır
    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

// Table sınıfı
class Table {
    // Statik Bowl nesnesi bowl1
    static Bowl bowl1 = new Bowl(1);

    // Constructor (yapıcı metot) - Table nesnesi oluşturulduğunda çalışır
    Table() {
        System.out.println("Table()");
        bowl1.f1(1);
    }

    // f2 metodu - belirli bir işaretçi (marker) değeri ile çalışır
    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    // Statik Bowl nesnesi bowl2
    static Bowl bowl2 = new Bowl(2);
}

// CupBoard (dolap) sınıfı
class CupBoard {
    // Bowl nesnesi bowl3
    Bowl bowl3 = new Bowl(3);
    // Statik Bowl nesnesi bowl4
    static Bowl bowl4 = new Bowl(4);

    // Constructor (yapıcı metot) - CupBoard nesnesi oluşturulduğunda çalışır
    CupBoard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }

    // f3 metodu - belirli bir işaretçi (marker) değeri ile çalışır
    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

    // Statik Bowl nesnesi bowl5
    static Bowl bowl5 = new Bowl(5);
}

// Ana sınıf - StaticInitialization
public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("main creating new Cupboard()");
        new CupBoard(); // Yeni bir CupBoard nesnesi oluşturuluyor
        System.out.println("main creating new Cupboard()");
        new CupBoard(); // Yeni bir CupBoard nesnesi daha oluşturuluyor
        table.f2(1); // Table sınıfının f2 metodunu çağırıyor
        cupboard.f3(1); // CupBoard sınıfının f3 metodunu çağırıyor
    }

    // Statik Table nesnesi table
    static Table table = new Table();
    // Statik CupBoard nesnesi cupboard
    static CupBoard cupboard = new CupBoard();
}