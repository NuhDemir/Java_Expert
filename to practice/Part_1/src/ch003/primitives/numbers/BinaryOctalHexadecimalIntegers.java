package ch003.primitives.numbers;

public class BinaryOctalHexadecimalIntegers {

    public static void main(String[] args) {
        int num1 = 0b1010;
        int num2 = 0132;
        int num3 = 0x5a;

        long num4 =0b1010L;
        byte num5 = 017;
        short num6 = 0x5a;

        System.out.println("num1: " +num1 + " num2: " + num2 + " num3: " + num3);
        System.out.println("num4: " +num4 + " num5: " + num5 + " num6: " + num6);

        int num123 = num1 + num2 + num3;
  int num456 = num1*num2*num3;
  System.out.println(num123);
  System.out.println(num456);
    }
}
