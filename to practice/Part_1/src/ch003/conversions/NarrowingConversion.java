package ch003.conversions;

public class NarrowingConversion {
    public static void main(String[] args) {

        System.out.println("----------------");
        byte b = 0;
        short s = 1000;
        char c;
        int i = -100;
        long l = 10_000_000_000L;
        //float f = 65.999_999f;
        float f = 65.5541_233f;
        double d = 98.014_353_459_485_483d;

        // b = s; //derleme hatası: olası kesinlik kaybı
        // f = d; //derleme hatası: olası kesinlik kaybı
        // c = i; //derleme hatası: olası kayıplı dönüşüm int'ten char'a

        System.out.println("----- Daraltıcı Dönüşüm Örnekleri -----");

        // short'tan byte'a daraltıcı dönüşüm
        b = (byte) s;
        System.out.println("short'tan byte'a dönüştürüldü:");
        System.out.println("Orijinal short değeri (s): " + s);
        System.out.println("Dönüştürülmüş byte değeri (b): " + b);
        System.out.println("----------------");

        // long'tan int'e daraltıcı dönüşüm
        i = (int) l;
        System.out.println("long'tan int'e dönüştürüldü (bilgi kaybı):");
        System.out.println("Orijinal long değeri (l): " + l);
        System.out.println("Dönüştürülmüş int değeri (i): " + i);
        System.out.println("----------------");

        // double'dan int'e daraltıcı dönüşüm
        i = (int) d;
        System.out.println("double'dan int'e dönüştürüldü:");
        System.out.println("Orijinal double değeri (d): " + d);
        System.out.println("Dönüştürülmüş int değeri (i): " + i);
        System.out.println("----------------");

        // float'tan int'e daraltıcı dönüşüm
        i = (int) f;
        System.out.println("float'tan int'e dönüştürüldü (kayan nokta bilgisi kaybı):");
        System.out.println("Orijinal float değeri (f): " + f);
        System.out.println("Dönüştürülmüş int değeri (i): " + i);
        System.out.println("----------------");

        // float'tan long'a daraltıcı dönüşüm
        l = (long) f;
        System.out.println("float'tan long'a dönüştürüldü:");
        System.out.println("Orijinal float değeri (f): " + f);
        System.out.println("Dönüştürülmüş long değeri (l): " + l);
        System.out.println("----------------");

        // double'dan float'a daraltıcı dönüşüm
        f = (float) d;
        System.out.println("double'dan float'a dönüştürüldü:");
        System.out.println("Orijinal double değeri (d): " + d);
        System.out.println("Dönüştürülmüş float değeri (f): " + f);
        System.out.println("----------------");

        // int'ten char'a daraltıcı dönüşüm
        i = 65;
        c = (char) i;
        System.out.println("int'ten char'a dönüştürüldü:");
        System.out.println("Orijinal int değeri (i): " + i);
        System.out.println("Dönüştürülmüş char değeri (c): " + c);
        System.out.println("----------------");

        // Negatif int'ten char'a daraltıcı dönüşüm (Sorunlu)
        i = -i;
        c = (char) i;
        System.out.println("Negatif int'ten char'a dönüştürüldü (sorunlu):");
        System.out.println("Orijinal negatif int değeri (i): " + i);
        System.out.println("Dönüştürülmüş char değeri (c): " + c);
        System.out.println("----------------");

        // byte'tan char'a daraltıcı dönüşüm (Sorunlu)
        byte b1 = -10;
        char c1 = (char) b1;
        System.out.println("Negatif byte'tan char'a dönüştürüldü (sorunlu):");
        System.out.println("Orijinal negatif byte değeri (b1): " + b1);
        System.out.println("Dönüştürülmüş char değeri int olarak (c1): " + (int) c1);
        System.out.println("Dönüştürülmüş char değeri (c1): " + c1);
        System.out.println("----------------");
    }
}
