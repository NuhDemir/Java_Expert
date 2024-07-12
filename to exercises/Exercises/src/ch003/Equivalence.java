package ch003;

import javax.imageio.stream.ImageInputStream;
import java.lang.invoke.VarHandle;

public class Equivalence {

    // İki Integer nesnesini karşılaştırarak sonuçları yazdıran yardımcı bir metod
    static void show(String desc, Integer number1, Integer number2) {
        System.out.println(desc + ":");
        // Eşitlik ve eşitlik kontrolünü yazdırır (== ve equals() kullanarak)
        System.out.printf(
                "%d == %d %b %b%n", number1, number2, number1 == number2, number1.equals(number2));
    }

    @SuppressWarnings("deprecation")
    public static void test(int value) {
        // Değerin otomatik kutulanması (auto-boxing) ile iki Integer nesnesi oluşturulur
        Integer i1 = value;
        Integer i2 = value;
        show("Automatic", i1, i2);

        // Java 9'dan beri eski yöntem kullanılmıyor
        // Integer r1 = new Integer(value); // [2]
        // Integer r2 = new Integer(value);
        // show("new Integer()", r1, r2);

        // Java 9'dan beri önerilen yöntem: Integer.valueOf()
        Integer v1 = Integer.valueOf(value); // [3]
        Integer v2 = Integer.valueOf(value);
        show("Integer.valueOf()", v1, v2);

        // Primitive türler equals() kullanamaz
        int x = value;
        int y = value;
        // x.equals(y); // Derlenmez
        System.out.println("Primitive int: ");
        System.out.printf("%d == %d %b%n", x, y, x == y);
    }

    public static void main(String[] args) {
        // 127 ve 128 değerleri ile test metodunu çağır
        test(127);
        test(128);
    }
}
