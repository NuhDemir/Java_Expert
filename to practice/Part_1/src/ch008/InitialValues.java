package ch008;

public class InitialValues {
    //member initialization
//    void f()
//    {
//        int i;
//        i++;
//    }
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    InitialValues reference;

    void printInitialValues() {
        System.out.println("Data type----Initial Value");
        System.out.println("boolean     -> " + t);
        System.out.println("char        ->[" + c + "]");
        System.out.println("byte        -> " + b);
        System.out.println("short       -> " + s);
        System.out.println("int         -> " + i);
        System.out.println("long        -> " +l);
        System.out.println("float       -> " +f);
        System.out.println("double      -> " +d);
        System.out.println("refernce    -> " +reference);
    }

    public static void main(String[] args) {
        new InitialValues().printInitialValues();
    }
}
