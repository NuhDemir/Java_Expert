package ch010.initialization;

public class InitialValues {

    //Instance variables

    char c;//0
    byte b;//0
    short s;//0
    int i;//0
    long l;//0
    float f;//0.0F
    double d;//0.0D
    String str;//null
    boolean bln;//false

//Class variables
    static int staticInt;
    static char staticChar;
    static String staticString;


    void print(){
        System.out.println("Data type      Initial values for instance variables\n" +
                "boolean        " + bln + "\n" +
                "char           [" + c + "] "+ (int)c +"\n"+
                "byte           " + b + "\n" +
                "short          " + s + "\n" +
                "int            " + i + "\n" +
                "long           " + l + "\n" +
                "float          " + f + "\n" +
                "double         " + d + "\n" +
                "String         " + str + "\n" +
                "\nData type      Initial values for class variables\n" +
                "char           [" + staticChar + "] "+ (int)staticChar +"\n"+
                "int            " + staticInt + "\n" +
                "String         " + staticString);
    }

    public static void main(String[] args) {
        InitialValues initialValues = new InitialValues();
        System.out.println(initialValues.l);
        initialValues.print();
    }

}
