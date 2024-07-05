package ch004;

import static ch004.BitwiseLogicalOperators.getBinary;

public class ShiftOperators {
    public static void main(String[] args) {
        // Pozitif sayılarla shift operasyonları
        makePositiveShifts();
        // Negatif sayılarla shift operasyonları
        makeNegativeShifts();
        // İşaretsiz (unsigned) shift operasyonları
        makeUnsignedShifts();
        // Dairesel (circular) shift operasyonları
        shiftCircular();
    }

    // Pozitif sayılarla shift operasyonlarını gerçekleştiren metot
    private static void makePositiveShifts() {
        int i = 1; // 0000 0000 0000 0001
        System.out.println("i:         " + i + "    İkili (Binary): " + getBinary(i));
        i = i << 1; // 0000 0000 0000 0010
        System.out.println("i << 1:    " + i + "    İkili (Binary): " + getBinary(i));
        i = i << 6; // 0000 0000 1000 0000
        System.out.println("i << 6:  " + i + "    İkili (Binary): " + getBinary(i));
        i = i >> 1; // 0000 0000 0100 0000
        System.out.println("i >> 1:   " + i + "    İkili (Binary): " + getBinary(i));
        i = i >> 7; // 0000 0000 0000 0000
        System.out.println("i >> 7:    " + i + "    İkili (Binary): " + getBinary(i));

        System.out.println();

        // Sayı tek ise sağa kaydırma (right shift) sonucu farklı olacaktır
        i = 139; // 0000 0000 1000 1011
        System.out.println("i:         " + i + "    İkili (Binary): " + getBinary(i));
        i = i >> 1; // 0000 0000 0100 0101
        System.out.println("i >> 1:     " + i + "    İkili (Binary): " + getBinary(i));
        i = i >> 1; // 0000 0000 0010 0010
        System.out.println("i >> 1:     " + i + "    İkili (Binary): " + getBinary(i));
    }

    // Negatif sayılarla shift operasyonlarını gerçekleştiren metot
    private static void makeNegativeShifts() {
        int i = -1; // 1111 1111 1111 1111
        System.out.println("i:         " + i + "    İkili (Binary): " + getBinary(i));
        i = i << 1; // 1111 1111 1111 1110
        System.out.println("i << 1:    " + i + "    İkili (Binary): " + getBinary(i));
        i = i << 6; // 1111 1110 0000 0000
        System.out.println("i << 6:    " + i + "    İkili (Binary): " + getBinary(i));
        i = i >> 6; // 1111 1111 1111 1110
        System.out.println("i >> 6:    " + i + "    İkili (Binary): " + getBinary(i));
        i = i >> 1; // 1111 1111 1111 1111
        System.out.println("i >> 1:    " + i + "    İkili (Binary): " + getBinary(i));
    }

    // İşaretsiz (unsigned) shift operasyonlarını gerçekleştiren metot
    private static void makeUnsignedShifts() {
        int i = 64; // 0000 0000 0100 0000
        System.out.println("i:         " + i + "    İkili (Binary): " + getBinary(i));
        i = i >>> 5; // 0000 0000 0000 0010
        System.out.println("i >>> 5:   " + i + "    İkili (Binary): " + getBinary(i));

        i = -64; // 1111 1111 1100 0000
        System.out.println("i:        " + i + "    İkili (Binary): " + getBinary(i));
        i = i >>> 5; // 0000 0111 1111 1110
        System.out.println("i >>> 5:  " + i + "    İkili (Binary): " + getBinary(i));
    }

    // Dairesel (circular) shift operasyonlarını gerçekleştiren metot
    public static void shiftCircular() {
        System.out.println("\nDairesel Kaydırma (Shifting Circular): ");
        int i = 64; // 0000 0000 0100 0000
        System.out.println("i:    " + i + " İkili (Binary): " + getBinary(i));
        i = i >> 5; // 0000 0000 0000 0010
        System.out.println("i >> 5:  " + i + " İkili (Binary): " + getBinary(i));
        i = 64; // 0000 0000 0100 0000
        System.out.println("i:         " + i + "    İkili (Binary): " + getBinary(i));
        i = i >> 37; // 0000 0000 0000 0010 (Dairesel olarak kayar)
        System.out.println("i >> 37:    " + i + "    İkili (Binary): " + getBinary(i));
    }

    // Diğer shift örnekleri
    public void shifts() {
        System.out.println("İmzalık Kaydırmalar (Signed Shifts)");
        int i = 512; // 0000 0010 0000 0000
        System.out.println("i: " + i);
        i = i >> 1; // 0000 0001 0000 0000
        System.out.println("i >> 1: " + i); // 256

        i = i >> 3; // 0000 0000 0010 0000
        System.out.println("i >> 3: " + i); // 32

        i = i << 5; // 0000 1000 0000 0000
        System.out.println("i << 5: " + i); // 1024

        System.out.println("\nİmzalık Kaydırmalar Bit Kalıpları (Signed Shifts Bit Patterns)");
        i = 512; // 0000 0010 0000 0000
        System.out.println("i:      " + i + " " + getBinary(i));
        i = i >> 1; // 0000 0001 0000 0000
        System.out.println("i >> 1: " + i + " " + getBinary(i)); // 256
        i = i >> 1; // 0000 0000 1000 0000
        System.out.println("i >> 1: " + i + " " + getBinary(i)); // 128
        i = i >> 7; // 0000 0000 0000 0001
        System.out.println("i >> 7:   " + i + " " + getBinary(i)); // 1
        i = i >> 1; // 0000 0000 0000 0000
        System.out.println("i >> 1:   " + i + " " + getBinary(i)); // 0
        i = i >> 1; // 0000 0000 0000 0000
        System.out.println("i >> 1:   " + i + " " + getBinary(i)); // 0

        System.out.println();

        i = 1; // 0000 0000 0000 0001
        System.out.println("i:         " + i + " " + getBinary(i)); // 1
        i = i << 1; // 0000 0000 0000 0010
        System.out.println("i << 1:    " + i + " " + getBinary(i)); // 2
        i = i << 1; // 0000 0000 0000 0100
        System.out.println("i << 1:    " + i + " " + getBinary(i)); // 4
        i = i << 7; // 0000 0010 0000 0000
        System.out.println("i << 7:  " + i + " " + getBinary(i)); // 512
        i = i << 1; // 0000 0100 0000 0000
        System.out.println("i << 1: " + i + " " + getBinary(i)); // 1024
        i = i << 1; // 0000 1000 0000 0000
        System.out.println("i << 1: " + i + " " + getBinary(i)); // 2048

        System.out.println("\nNegatif Bir Sayının İmzalık Kaydırılması (Signed Shift of A Negative)");

        i = -1; // 1111 1111 1111 1111
        System.out.println("i:         " + i + " " + getBinary(i)); // -1
        i = i << 1; // 1111 1111 1111 1110
        System.out.println("i << 1:    " + i + " " + getBinary(i)); // -2
        i = i << 3; // 1111 1111 1111 0000
        System.out.println("i << 3:    " + i + " " + getBinary(i)); // -16
    }
}
