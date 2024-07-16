package ch008.overloading;

public class PrimitiveOverloading2 {
    public static void main(String[] args) {
        byte b1 = 1;
        byte b2 = 33;
print(b1,b2);
    }
public static void print(int i,short j){
    System.out.println("print(short i,short j)");
}
public static void print(short i,int j){
        System.out.println("print(short i,int j)");
}

    public static void print(short i,short j){
        System.out.println("print(short i,short j)");
    }
}
