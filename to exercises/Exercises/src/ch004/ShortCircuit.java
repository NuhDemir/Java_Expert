package ch004;

public class ShortCircuit {
    // test1 metodu: val değerini alır ve 1'den küçük olup olmadığını kontrol eder
    static boolean test1(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("sonuç: " + (val < 1));
        return val < 1;
    }

    // test2 metodu: val değerini alır ve 2'den küçük olup olmadığını kontrol eder
    static boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("sonuç: " + (val < 2));
        return val < 2;
    }

    // test3 metodu: val değerini alır ve 3'ten küçük olup olmadığını kontrol eder
    static boolean test3(int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("sonuç: " + (val < 3));
        return val < 3;
    }

    public static void main(String[] args) {
        // Bütün test metotlarını ve kısa devre operatörlerini kullanan bir ifade
        boolean b = test1(0) && test2(2) && test3(2);
        System.out.println("ifadenin sonucu: " + b);

        // Ekstra örnekler
        // Tüm testlerin false olduğu bir ifade
        boolean c = test1(5) && test2(5) && test3(5);
        System.out.println("ifadenin sonucu (5 ile testler): " + c);

        // test1'in true olduğu, ancak diğer testlerin false olduğu bir ifade
        boolean d = test1(0) && test2(5) && test3(5);
        System.out.println("ifadenin sonucu (0 ve 5 ile testler): " + d);
    }
}
