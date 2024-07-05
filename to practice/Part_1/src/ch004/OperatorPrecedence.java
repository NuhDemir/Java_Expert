package ch004;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        int c = 10;

        float rs = a + ++b * c / a * b;
        System.out.println("rs: " + rs);
        System.out.println("b: " + b);

        rs = a + (++b) * ((c / a) * b);
        System.out.println("rs: " + rs);

        System.out.println("a: " + a + " b: " + b + " c: " + c);
        a += b += c;
        System.out.println("a: " + a + " b: " + b + " c: " + c);

        System.out.println("---------");
int u = 3;
//System.out.println("u: " + ++u+u--);
System.out.println(++u + u--);
System.out.println("u: " + u);
        System.out.println("---------");

        int i = 5;
        //int k = ++i++;
    int k = ++i + i++;
    System.out.println("i: " + i + " k: " +k);

    int x = 10, y=8,z=3;
    System.out.println("x*y%z: " +x *y % z);
        System.out.println("x*y%z: " + x * (y % z));
        boolean b1 = false, b2 = true, b3 = true;
        boolean bool = b1 & b2 | b3;
        System.out.println("bool: " + bool);

        //The + operator is left associative
        System.out.println("Java " + 1 + 5);//All strings
        System.out.println(1+5 +" Java");
        System.out.println("1" + "6" + "Java");
        System.out.println('1' + '6' + "Java");
        System.out.println("Java" + (1 + 6));

        //Parameter evaluation
        String s = "Java";
        //print(s,s = "Javacı ",s);


    }

    public void print(String a, String b, String c) {
        System.out.println(a + " " + b + " " + c);
    }
}
