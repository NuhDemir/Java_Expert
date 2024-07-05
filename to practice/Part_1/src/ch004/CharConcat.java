package ch004;

public class CharConcat {

    public static void main(String[] args) {
        char a = 'a' , b = 'b';
        char c1 = (char) (a + b);
        System.out.println("c1: " + c1);

        int c2 = a + b;
        System.out.println("c2: " +c2);

        System.out.println(a + b);
        System.out.println("a + b : " + 'a' + 'b');
        System.out.println('a' + 'b');
    }
}
