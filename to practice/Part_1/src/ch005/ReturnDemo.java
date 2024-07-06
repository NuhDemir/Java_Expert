package ch005;

public class ReturnDemo {
    public static void main(String[] args) {
        ReturnDemo demo = new ReturnDemo();
        System.out.println("Maksimum: " + demo.max(10, 20));
        System.out.println("Maksimum: " + demo.max(20, 10));
        System.out.println("Maksimum: " + demo.max(10, 10));
        System.out.println("Mesaj: " + demo.method3());
    }

    // İki sayıdan büyük olanı döndüren metot
    public int max(int num1, int num2) {
        // Eğer num1 num2'den büyükse 1 döndür
        if (num1 > num2)
            return 1;
            // Eğer num2 num1'den büyükse -1 döndür
        else if (num1 < num2) {
            return -1;
        }
        // İki sayı eşitse 0 döndür
        else
            return 0;
    }

    // Geri dönüş değeri olmayan boş metot
    public void method1() {
        // void boş değer döndürür.
    }

    // Geri dönüş değeri olmayan metot, return ile sonlanır
    public void method2() {
        return;
        // System.out.println("dd"); // Bu satır çalışmaz çünkü return ile metot sonlanmış olur
    }

    // String döndüren metot
    public String method3() {
        return new String("JAVA Developer");
        // return null; // null değer döndürebilirsin ancak bu durumda null kontrolü yapman gerekebilir
    }
}
