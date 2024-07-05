package ch003.conversions;

public class DetailedConversions {

    public static void main(String[] args) {

        System.out.println("----- Genişletici Dönüşümler -----");

        // byte'tan short'a genişletici dönüşüm
        byte b = 10;
        short s = b;
        System.out.println("byte'tan short'a genişletici dönüşüm:");
        System.out.println("Orijinal byte değeri (b): " + b);
        System.out.println("Dönüştürülmüş short değeri (s): " + s);
        System.out.println("----------------");

        // short'tan int'e genişletici dönüşüm
        int i = s;
        System.out.println("short'tan int'e genişletici dönüşüm:");
        System.out.println("Orijinal short değeri (s): " + s);
        System.out.println("Dönüştürülmüş int değeri (i): " + i);
        System.out.println("----------------");

        // int'ten long'a genişletici dönüşüm
        long l = i;
        System.out.println("int'ten long'a genişletici dönüşüm:");
        System.out.println("Orijinal int değeri (i): " + i);
        System.out.println("Dönüştürülmüş long değeri (l): " + l);
        System.out.println("----------------");

        // long'tan float'a genişletici dönüşüm
        float f = l;
        System.out.println("long'tan float'a genişletici dönüşüm:");
        System.out.println("Orijinal long değeri (l): " + l);
        System.out.println("Dönüştürülmüş float değeri (f): " + f);
        System.out.println("----------------");

        // float'tan double'a genişletici dönüşüm
        double d = f;
        System.out.println("float'tan double'a genişletici dönüşüm:");
        System.out.println("Orijinal float değeri (f): " + f);
        System.out.println("Dönüştürülmüş double değeri (d): " + d);
        System.out.println("----------------");

        System.out.println("----- Daraltıcı Dönüşümler -----");

        // double'dan float'a daraltıcı dönüşüm
        d = 12345.6789;
        f = (float) d;
        System.out.println("double'dan float'a daraltıcı dönüşüm:");
        System.out.println("Orijinal double değeri (d): " + d);
        System.out.println("Dönüştürülmüş float değeri (f): " + f);
        System.out.println("----------------");

        // float'tan long'a daraltıcı dönüşüm
        f = 12345.6789f;
        l = (long) f;
        System.out.println("float'tan long'a daraltıcı dönüşüm:");
        System.out.println("Orijinal float değeri (f): " + f);
        System.out.println("Dönüştürülmüş long değeri (l): " + l);
        System.out.println("----------------");

        // long'tan int'e daraltıcı dönüşüm
        l = 10000000000L;
        i = (int) l;
        System.out.println("long'tan int'e daraltıcı dönüşüm:");
        System.out.println("Orijinal long değeri (l): " + l);
        System.out.println("Dönüştürülmüş int değeri (i): " + i);
        System.out.println("----------------");

        // int'ten short'a daraltıcı dönüşüm
        i = 32768;
        s = (short) i;
        System.out.println("int'ten short'a daraltıcı dönüşüm:");
        System.out.println("Orijinal int değeri (i): " + i);
        System.out.println("Dönüştürülmüş short değeri (s): " + s);
        System.out.println("----------------");

        // short'tan byte'a daraltıcı dönüşüm
        s = 128;
        b = (byte) s;
        System.out.println("short'tan byte'a daraltıcı dönüşüm:");
        System.out.println("Orijinal short değeri (s): " + s);
        System.out.println("Dönüştürülmüş byte değeri (b): " + b);
        System.out.println("----------------");

        // int'ten char'a daraltıcı dönüşüm
        i = 65;
        char c = (char) i;
        System.out.println("int'ten char'a daraltıcı dönüşüm:");
        System.out.println("Orijinal int değeri (i): " + i);
        System.out.println("Dönüştürülmüş char değeri (c): " + c);
        System.out.println("----------------");

        // Negatif int'ten char'a daraltıcı dönüşüm (Sorunlu)
        i = -65;
        c = (char) i;
        System.out.println("Negatif int'ten char'a daraltıcı dönüşüm (sorunlu):");
        System.out.println("Orijinal negatif int değeri (i): " + i);
        System.out.println("Dönüştürülmüş char değeri (c): " + c);
        System.out.println("----------------");

        // byte'tan char'a daraltıcı dönüşüm (Sorunlu)
        byte b1 = -10;
        char c1 = (char) b1;
        System.out.println("byte'tan char'a daraltıcı dönüşüm (sorunlu):");
        System.out.println("Orijinal byte değeri (b1): " + b1);
        System.out.println("Dönüştürülmüş char değeri int olarak (c1): " + (int) c1);
        System.out.println("Dönüştürülmüş char değeri (c1): " + c1);
        System.out.println("----------------");
    }
}
