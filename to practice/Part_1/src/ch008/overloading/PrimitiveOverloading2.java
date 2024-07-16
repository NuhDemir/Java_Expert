package ch008.overloading;

public class PrimitiveOverloading2 {
    public static void main(String[] args) {
        // byte türünde iki değişken tanımlanıyor
        byte b1 = 1;
        byte b2 = 33;

        // 'print' metodu çağrılıyor
        print(b1, b2); // Burada byte türündeki değişkenler gönderiliyor
    }

    // int ve short türünde parametre alan 'print' metodu
    public static void print(int i, short j) {
        System.out.println("print(int i, short j)");
    }

    // short ve int türünde parametre alan 'print' metodu
    public static void print(short i, int j) {
        System.out.println("print(short i, int j)");
    }

    // İki short türünde parametre alan 'print' metodu
    public static void print(short i, short j) {
        System.out.println("print(short i, short j)");
    }
}
