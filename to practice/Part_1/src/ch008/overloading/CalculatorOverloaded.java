package ch008.overloading;

public class CalculatorOverloaded {
    int add(byte first, byte second) {
        print("arguments are in byte");
        return first + second;
    }

    int add(short first, short second) {
        print("arguments are in short");
        return first + second;
    }

    int add(char first, char second) {
        print("arguments are in char");
        return first + second;
    }

    int add(int first, int second) {
        print("arguments are in int");
        return first + second;
    }

    long add(long first, long second) {
        print("arguments are in long");
        return first + second; // Sonucu döndür
    }

    long add(short first, long second) {
        print("arguments are in short");
        return first + second; // Sonucu döndür
    }

    float add(float first, float second) {
        print("arguments are in float");
        return first + second; // Sonucu döndür
    }

    double add(double first, double second) {
        print("arguments are in double");
        return first + second; // Sonucu döndür
    }

    // print metodunu tanımlıyoruz
    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        CalculatorOverloaded calculator = new CalculatorOverloaded();
        byte b1 = 11;
        byte b2 = -42;

        // Byte değerleri toplama
        print("Result of add(byte, byte): " + calculator.add(b1, b2));

        double d1 = 3.1415;
        double d2 = 2.990;
        // Double değerleri toplama
        print("Result of add(double, double): " + calculator.add(d1, d2));

        byte s = 33;
        long l1 = 4;
        // Short ve long değerleri toplama
        print("Result of add(short, long): " + calculator.add(s, l1));

        // Double ve long değerleri toplama
        print("Result of add(double, long): " + calculator.add(d1, l1));
    }
}
