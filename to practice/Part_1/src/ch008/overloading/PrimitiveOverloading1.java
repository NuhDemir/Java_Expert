package ch008.overloading;

public class PrimitiveOverloading1 {

    // Farklı temel veri türlerini alan 'f1' metodları
    static void f1(byte x) {
        prt("f1(byte) - Değer: " + x);
    }

    static void f1(short x) {
        prt("f1(short) - Değer: " + x);
    }

    static void f1(char x) {
        prt("f1(char) - Değer: " + (int)x + " (char olarak: " + x + ")");
    }

    static void f1(int x) {
        prt("f1(int) - Değer: " + x);
    }

    static void f1(long x) {
        prt("f1(long) - Değer: " + x);
    }

    static void f1(float x) {
        prt("f1(float) - Değer: " + x);
    }

    static void f1(double x) {
        prt("f1(double) - Değer: " + x);
    }

    // Metin yazdırma metodu
    static void prt(String s) {
        System.out.println(s);
    }

    // Ana metod
    public static void main(String[] args) {
        // Her temel veri türü için değişkenler tanımlanır ve 'f1' metodu çağrılır
        byte b = 3;
        f1(b); // f1(byte) metodu çağrılır

        short s = 4;
        f1(s); // f1(short) metodu çağrılır

        char c = 'a';
        f1(c); // f1(char) metodu çağrılır

        int i = 5;
        f1(i); // f1(int) metodu çağrılır

        long l = 5L;
        f1(l); // f1(long) metodu çağrılır

        float f = 5.0f;
        f1(f); // f1(float) metodu çağrılır

        double d = 6.0d;
        f1(d); // f1(double) metodu çağrılır

        // Ek olarak, her temel veri türünün bir önceki tür ile kombinasyonları
        prt("Ek overloading kombinasyonları:");
        f1((short) b); // byte -> short
        f1((int) s); // short -> int
        f1((long) c); // char -> long
        f1((float) i); // int -> float
        f1((double) l); // long -> double
        f1((double) f); // float -> double

        // Literaller ile doğrudan çağrımlar
        prt("Literaller ile doğrudan çağrımlar:");
        f1((byte) 127);
        f1((short) 32767);
        f1((char) 65);
        f1(2147483647);
        f1(9223372036854775807L);
        f1(3.14f);
        f1(2.71828);
    }
}
