package ch003.primitives;

public class Primitives {
    public static void main(String[] args) {
        // Değişkenler
        int anInteger = 18;
        boolean bool = false;
        float sin30 = 0.3f;
        double pi = 3.1415;
        char char1 = 'c';
        char char2 = '\u221d'; // orantı işareti
        char char3 = '\u03b2'; // beta sembolü
        char char4 = '\u0393'; // gamma sembolü
        char nextLine = '\n';

        System.out.println(anInteger + " " + bool + " " + sin30);
        System.out.println(nextLine);
        System.out.println(pi + " " + char1);
        System.out.println(char2 + " " + char3 + " " + char4);

        // Değişken Adlandırma
        float corporateCustomerSalesAmount;
        boolean seatBooked;
        char after;

        int count;
        float $amount;
        float €total;

        // Hatalı adlandırmalar
        // float x!; // Geçersiz karakter
        // int ?i; // Geçersiz karakter
        // boolean new; // 'new' rezerve bir kelimedir
        // char {oneCharacter}; // Geçersiz karakter
        // short shorty-pant; // Geçersiz karakter
        // long white\black; // Geçersiz karakter
        // int _ = 5; // Java 1.8'den itibaren "-" rezerve bir kelime olmuştur.

        float f;
        double d;
        f = 22f / 7;
        d = 22d / 7;
        System.out.println(f + " - " + d);

        // Tek satırda birden fazla değişken tanımlama (iyi bir uygulama değil)
        double price = 10.28, tax = 0.16, total = price * tax;

        // Farklı türde birden fazla değişken tanımlama (iyi bir uygulama değil)
        double speed = 12.22;
        // int time = 14;
        // double distance = speed * time;

        // Böyle garip bir tanım yapabilirsiniz, ancak kesinlikle tavsiye edilmez
        int xxx = 44;

        // Daha karmaşık örnekler
        // Bir operatör kullanarak
        // int hour = 11;
        // boolean areLightsOn = hour > 15;

        // Metod çağrısı ile
        long aLong = returnLong();

        // Üslü sayılar
        double d1 = 1.6e-19;
        float f1 = 6.02E23F;
        System.out.println(d1 + " " + f1);

        int ii = 0Xeee10;
        System.out.println("Garip: " + ii);

        // Taşmalar
        double lowestInt = Math.pow(2, 31);
        double highestInt = Math.pow(2, 31) - 1;
        System.out.println("int türünün aralığı: " + lowestInt + " ile " + highestInt);

        double lowestLong = -Math.pow(2, 63);
        double highestLong = Math.pow(2, 63) - 1;
        System.out.println("long türünün aralığı: " + lowestLong + " ile " + highestLong);

        double lowestDouble = 4.9e-323; // 1.40129846432481707e-45
        double biggestDouble = 1.7976931348623158e308;
        System.out.println(lowestDouble + " - " + biggestDouble);

        double elementaryCharge = 1.6e-19;
        float avogadroNumber = 6.02E23F;
        System.out.println(elementaryCharge + " " + avogadroNumber);

        // int ten = 1e1; // Hata
    }

    public static long returnLong() {
        return 5L;
    }
}
