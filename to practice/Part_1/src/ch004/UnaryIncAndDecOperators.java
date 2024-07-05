package ch004;

/*
 *Bu örneklerde Java'da tek artış (increment)
 *  ve tek azalış (decrement) operatörlerinin
 * nasıl çalıştığını görebilirsiniz. Ön ekleme
 * (++i veya --i) ve son ekleme (i++ veya i--)
 * arasındaki farkı inceleyebilirsiniz.
 * weirdBehavior metodunda ise bazı beklenmedik
 *  davranışları inceleyip, bu operatörlerin
 * çalışma şeklini daha iyi anlayabilirsiniz. */
public class UnaryIncAndDecOperators {
    public static void main(String[] args) {
        unaryIncrementAndDecrement1();
//      unaryIncrementAndDecrement2();
//      weirdBehavior();
    }

    // Tek artış ve azalış operatörleri örneği
    public static void unaryIncrementAndDecrement1() {
        int i = 1;
        yazdir("i   : \t" + i);
        yazdir("++i : \t" + ++i); // Ön ekleme
        yazdir("i++ : \t" + i++); // Son ekleme
        yazdir("i   : \t" + i);
        yazdir("--i : \t" + --i); // Ön çıkarma
        yazdir("i-- : \t" + i--); // Son çıkarma
        yazdir("i   : \t" + i);

        System.out.println();

        i = 1;
        yazdir("i: \t" + i);
        int j = ++i;
        yazdir("i: \t" + i + "\t j : \t" + j); // Ön ekleme
        j = i++;
        yazdir("i: \t" + i + "\t j : \t" + j); // Son ekleme
        yazdir("i: \t" + i);
        j = --i;
        yazdir("i: \t" + i + "\t j : \t" + j); // Ön çıkarma
        j = i--;
        yazdir("i: \t" + i + "\t j : \t" + j); // Son çıkarma
        yazdir("i: \t" + i);
    }

    // Kısa tek artış ve azalış operatörleri örneği
    public static void unaryIncrementAndDecrement2() {
        int i = 5;
        ++i; // 1 arttır
        yazdir("i: " + i);

        i++; // 1 arttır
        yazdir("i: " + i);

        --i; // 1 azalt
        yazdir("i: " + i);

        i--; // 1 azalt
        yazdir("i: " + i);
    }

    // İlginç davranış örneği
    public static void weirdBehavior() {
        int i = 0;
        System.out.println("Bu normal");
        i = ++i;
        System.out.println("i: " + i);
        i = ++i + 2;
        System.out.println("i: " + i);

        i = 0;
        System.out.println("Bu anormal");
        i = i++;
        System.out.println("i: " + i); // i neden artmadı?

        i = i++ + 2; // i++ neden i'yi arttırmadı?
        System.out.println("i: " + i);

        System.out.println("Bu da normal.");

        i = 0;
        int j = i++;
        System.out.println("i: " + i);
        System.out.println("j: " + j);

        int k = i++;
        System.out.println("i: " + i);
        System.out.println("k: " + k);
    }

    // Yazdırma fonksiyonu
    static void yazdir(String s) {
        System.out.println(s);
    }
}
