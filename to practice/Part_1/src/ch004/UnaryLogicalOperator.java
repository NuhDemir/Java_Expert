package ch004;

public class UnaryLogicalOperator {

    public static void main(String[] args) {
        boolean b1 = true; // b1 değişkenini true olarak tanımladık
        //!b1; // Bu satır hata verir, çünkü tek başına tersleme operatörü kullanılamaz
        b1 = !b1; // b1'in değerini tersine çevirdik, yani false yaptık
        System.out.println(b1); // b1'in yeni değerini yazdırdık, yani false

        // b1 != b1; // Bu satır da hata verir. != operatörü birleşik atama operatörü değildir, bu bir karşılaştırma operatörüdür.
    }
}
