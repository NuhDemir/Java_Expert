package ch008.calculator;

public class Calculator {

    String name; // Hesap makinesinin ismi

    // İsim getter metodu
    public String getName() {
        return name;
    }

    // İsim setter metodu
    public void setName(String newName) {
        name = newName;
    }

    // Hesap makinesi kimdir metodu
    void WhoAreYou() {
        System.out.println("Ben bir Hesap Makinesiyim :) , ismim " + name);
    }

    // Toplama metodu (iki parametre)
    public int add(int first, int second) {
        return first + second;
    }

    // Toplama metodu (üç parametre)
    public int add(int first, int second, int third) {
        return first + second + third;
    }

    // Çıkarma metodu
    public int substract(int first, int second) {
        return first - second;
    }

    // Çarpma metodu
    public int multiply(int first, int second) {
        int sonuc = first * second;
        return sonuc;
    }

    // Çarpma işlemini toplama ile gerçekleştiren metot
    public int multiplyByAdding(int first, int second) {
        int multiplication = 0;
        for (int i = 1; i <= second; i++)
            multiplication += first;
        System.out.println("Çarpma sonucu: " + multiplication);
        return multiplication;
    }

    // Bölme metodu
    public double divide(int first, int second) {
        return (double) first / second;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // Yeni bir hesap makinesi nesnesi oluşturma

        calculator.setName("Texas Instruments T-302"); // Hesap makinesinin ismini ayarlama
        calculator.WhoAreYou(); // Hesap makinesinin kim olduğunu yazdırma

        int i = calculator.add(12, 43, 22); // Üç sayıyı toplama
        System.out.println("12 + 43 + 22 = " + i); // Toplama sonucunu yazdırma

        double d = calculator.divide(11, 22); // İki sayıyı bölme
        System.out.println("11 / 22 = " + d); // Bölme sonucunu yazdırma

        System.out.println("5 - 3 = " + calculator.substract(5, 3)); // Çıkarma sonucunu yazdırma
        System.out.println("5 * 3 = " + calculator.multiply(5, 3)); // Çarpma sonucunu yazdırma

        // Yan etkileri için çağrılan metot
        calculator.multiplyByAdding(22, 11); // Toplama ile çarpma işlemi
    }
}
