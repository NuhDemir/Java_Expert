package ch002;

public class ValuesOfExpressions {

    public static void main(String[] args) {
        // Değişkenlerin Tanımlanması ve Başlatılması
        int a = 2_147_483_647; // Maksimum limit, int'in sınır değeri
        System.out.println("a: " + a);

        // b değişkeni doğru başlatılmadığı için hata oluşur. k değişkeni tanımlanmadı.
        // int b = k + 1; // Bu satır hata verir çünkü k tanımlı değil.

        // Yeni değişkenler
        int c = 22;
        int d;

        // if-else blokları kullanılarak değişkenlerin başlatılması
        if (c < 11) {
            d = 9;
        } else {
            d = 15; // d değişkenine bir değer atanıyor
        }

        // d değişkeninin değeri her durumda başlatıldığı için aşağıdaki satır hatasız çalışır
        System.out.println("d: " + d);

        //Mantıksal ifadeler ve değişkenler değerleri
        boolean isEven = (a% 2 == 0 );
        System.out.println("a is even: " + isEven);


        //Matematiksel ifadeler
        int sum = a+ d;
        System.out.println(sum);

        int diff = a-d;
        System.out.println(diff);

        int product = a* d;
        System.out.println(product);

        //Cast işlemi ve bölme işlemi
        double quotient = (double) a/d;
        System.out.println(quotient);

        //Değişkenlerin ve ifadelerin kullanımı
        int maxLimit = Integer.MAX_VALUE;
        int minLimit = Integer.MIN_VALUE;
        System.out.println(maxLimit);
        System.out.println(minLimit);

        //Karşılaştırma işlemleri
        boolean isMax = (a == maxLimit);
        System.out.println(isMax);

        boolean isMin = (a == minLimit);
        System.out.println(isMin);

        //Bitwise İşlemler
        int bitwiseAnd = a & d;
        int bitwiseOr = a | d;
        int bitwiseXor = a ^ d;
        int bitwiseNot = ~a;
        System.out.println("Bitwise AND of 'a' and 'd': " + bitwiseAnd);
        System.out.println("Bitwise OR of 'a' and 'd': " + bitwiseOr);
        System.out.println("Bitwise XOR of 'a' and 'd': " + bitwiseXor);
        System.out.println("Bitwise NOT of 'a': " + bitwiseNot);


    }


}
