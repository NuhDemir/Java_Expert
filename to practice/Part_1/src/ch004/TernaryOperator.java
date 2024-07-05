package ch004;

public class TernaryOperator {

    public static void main(String[] args) {

    }

    public static void basics() {

    }

    public static void ifElseEquivalnce() {

        int i = 8;
        int j = 11;
        int min = (i <= j) ? i : j;
        System.out.println("Min: " +min);

        if (i<=j)
            min = i;
        else
            min = j;
        System.out.println("Min: " +min);

        String string1 = "I love Java very much!";
        String string2 = "I love nothing!";
        String string3 = (string1.matches("Java.*")) ? string1 : string2;
        System.out.println("String3: " +string3);

        if (string1.matches(".*Java.*"))
            string3 = string1;
        else string3 =string2;
        System.out.println("String 3: " +string3);


    }

    public static void evaluation() {
        System.out.println(true ? "true" : "false");
        System.out.println(false ? "true" : "false");

        System.out.println(true ? returnTrue() : returnFalse());
        System.out.println(false ? returnTrue() : returnFalse());
    }

    public static String returnTrue() {
        System.out.println("in returnTrue()");
        return "true";
    }

    public static String returnFalse() {
        System.out.println("in returnFalse()");
        return "false";
    }

    private static void hard() {
        boolean b = false;

        int x = (int) (Math.random() * 1000);
        int y = (int) (Math.random() * 1000);
        int z = (int) (Math.random() * 1000);
        // x = 100;
        //y=200;
        //z= 300;

        System.out.println("x: " + x + "y: " + y + "z: " + z);

        b = x < y ? x < z ? true : false : false; //Either x is smaller than both y and z at the same time or x isnot smaller than y

        b = (x < y ? (x < z ? true : false) : false);
        System.out.println(b);
    }

    private static void errors() {
        int i = 8;
        int j = 11;
        //(i<j) ? System.out.println(i): System.out.println(j);//Can't do this.

        int x = 0;
        int y;
        int z;

        //     (x == 2 ? y:z) = 5; //The left-hand side of an assignment must v

    }


}
