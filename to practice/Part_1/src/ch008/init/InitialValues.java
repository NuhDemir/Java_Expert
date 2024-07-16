package ch008.init;

public class InitialValues {
    // Örnek değişkenleri (instance variables)
    boolean t;   // Başlangıç değeri: false
    char c;      // Başlangıç değeri: '\u0000' (ASCII 0)
    byte b;      // Başlangıç değeri: 0
    short s;     // Başlangıç değeri: 0
    int i;       // Başlangıç değeri: 0
    long l;      // Başlangıç değeri: 0L
    float f;     // Başlangıç değeri: 0.0F
    double d;    // Başlangıç değeri: 0.0D
    String str;  // Başlangıç değeri: null

    // Değişkenlerin başlangıç değerlerini yazdıran metot
    void print() {
        System.out.println("Data type      Initial values for instance variables\n" +
                "boolean        " + t + "\n" +
                "char           [" + c + "] " + (int)c + "\n" +
                "byte           " + b + "\n" +
                "short          " + s + "\n" +
                "int            " + i + "\n" +
                "long           " + l + "\n" +
                "float          " + f + "\n" +
                "double         " + d + "\n" +
                "String         " + str + "\n");
    }

    public static void main(String[] args) {
        InitialValues nesne = new InitialValues(); // Yeni bir nesne oluşturuluyor
        nesne.print(); // Değişkenlerin başlangıç değerlerini yazdırma
    }
}
