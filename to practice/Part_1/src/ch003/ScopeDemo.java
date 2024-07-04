package ch003;

public class ScopeDemo {

    private static int ii;
    //Instance variable
    int i = 1; // Nesne değişkeni (instance variable), tüm örnek yöntemler tarafından erişilebilir.
    //String i = "Nasıl Gidiyor?"; // Bu satır yorumda, ancak aynı isimde iki değişken tanımlanamaz.

    public static void main(String[] args) {
        int i = 0; // main metodunun yerel değişkeni
        //String i ; // Bu satır yorumda, ancak aynı isimde iki değişken tanımlanamaz.
        System.out.println(i); // Yerel değişken i'nin değeri olan 0 yazdırılır.

        //int i = 2; // Bu satır yorumda, çünkü aynı kapsamda iki kez aynı isimde değişken tanımlanamaz.
        //int ii

        for (; i < 5; i++) { // i, 0'dan 4'e kadar döngü yapacak
            if (i < 3) { // i, 3'ten küçükse
                //boolean i = true; // Bu satır yorumda, aynı isimde farklı bir değişken tanımlanamaz.
                f(ii); // ii değişkeni henüz tanımlanmadığı için hata verir.
            } else if (3 < i & i < 12) { // 3'ten büyük ve 12'den küçükse
                int ii = 8; // Bu blokta tanımlanan yerel değişken ii
                f(ii); // ii'nin değeri olan 8 ile f() metodu çağrılır.
            } else {
                int ii = 17; // Bu blokta tanımlanan yerel değişken ii
                f(ii); // ii'nin değeri olan 17 ile f() metodu çağrılır.
            }
            int ii = 11; // Döngü bloğunda tanımlanan yerel değişken ii
        }
    }

    public static void f(int i) {
        // Bu metot yerel değişken i'yi alır
        //int i = 4 // Bu satır yorumda, aynı isimde değişken tanımlanamaz.
        System.out.println(i); // Parametre olarak aldığı i'yi yazdırır.
    }

    public void ff() {
        int i = 9; // Bu metodun yerel değişkeni
        System.out.println(i); // 9 yazdırılır.
    }

    /**
     * İleriye dönük referans (forward reference) yapılamaz.
     */
    public void forwardReference() {
        //int i = j; // Bu satır yorumda, j henüz tanımlanmadığı için hata verir.
        //int j = 9; // j burada tanımlandı.
        System.out.println(i); // Nesne değişkeni i'yi yazdırır.
    }

}
