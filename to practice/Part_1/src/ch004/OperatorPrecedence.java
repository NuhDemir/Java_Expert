package ch004;

public class OperatorPrecedence {
    public static void main(String[] args) {
int a = 6;
int b = 5;
int c = 10;

float rs = a+ ++b * c /a*b;
System.out.println("rs: " +rs);

    }

    public void print(String a, String b, String c)
    {
        System.out.println(a+ " " +b +" " + c);
    }
}
