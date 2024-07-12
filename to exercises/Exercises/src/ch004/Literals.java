package ch004;

public class Literals {
    public static void main(String[] args) {

        int i1 = 0x2f; //Hexadecimal (lowercase)
        System.out.println(
                "i1: " +Integer.toBinaryString(i1)
        );
        int i2 = 0x2F;//Hexadecimal (uppercase)
System.out.println(
        "i2: " +Integer.toBinaryString(i2)
);
int i3 = 0177; //Octal(leading zero)
        System.out.println(
                "i3: " +Integer.toBinaryString(i3)
        );
        char c = 0xffff; //max char hex value
        System.out.println("c: " +Integer.toBinaryString(c));

        byte b = 0x7f; //max byte hex value 10101111
        System.out.println(
"b: " + Integer.toBinaryString(b)
        );

        short s = 0x7fff; //max short hex value
        System.out.println(
                "s: " +Integer.toBinaryString(s)
        );

        long n1 = 200L;//long suffix
        long n2 = 2001; //long suffix canb e confusing
        long n3 = 200;
        //Java 7 binary literals:
        byte binaryByte = (byte)0b00110101;
        System.out.println(
                "binary byte: " +Integer.toBinaryString(binaryByte)
        );

        short binaryShort= (short)0B0010111110101111;
        System.out.println(
                "binary short: " +Integer.toBinaryString(binaryShort)
        );

        int binaryInt = 0b00101111101011111010111110101111;
        System.out.println(
                "Binary int: " +Integer.toBinaryString(binaryInt)
        );
    }


}
