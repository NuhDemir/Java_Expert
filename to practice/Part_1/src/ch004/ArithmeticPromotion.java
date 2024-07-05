package ch004;

public class ArithmeticPromotion {
    public static void main(String[] args) {
        byte b1 = 15;
        byte b2 = 18;
//      byte b3 = b1 * b2; // derleme hatası: kesinlik kaybı olabilir
        byte b3 = (byte) (b1 * b2); // Sorunsuz
        System.out.println(b3);

        int jj = 5;
        int kk = 2;
        System.out.println("5 / 2 = " + jj/kk);

        double jk = (double) jj / kk;
        System.out.println("5 / 2 = " + jk);

        short s1 = 187;
        short s2 = 8;
//      short s3 = s1 % s2;
        short s3 = (short) (s1 % s2);
//      int s3 = s1 % s2;
        System.out.println(s3);

        int i = 12;
        double d = 8.524431;
//         int k = i * d; // derleme hatası: kesinlik kaybı olabilir
        int k = (int) (i * d);
        System.out.println(k);

        // Bileşik atamalar
        i = 5;
        d = 8.524431;
        long l = 12L;

        i = i + 3; // i şimdi 8
        i += 3; // i şimdi 11
        System.out.println(i);

//      i = i + l; // int'e dönüşüm gerekiyor
        i += l;    // Otomatik olarak int'e dönüşüm yapılır
        System.out.println(i);
        i -= d;
        System.out.println(i);
    }
}
