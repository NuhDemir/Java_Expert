package ch009.variable_arguments_lists;

class A {

}

public class VarArgs {
    static void printArray(Object[] args) {
        for (Object object : args) {
            System.out.println(object.toString() + " ");
            System.out.println("---------------");
        }
    }

    public static void main(String[] args) {
        printArray(new Object[]{33, (float) 3.14, 11.11});
        printArray(new Object[]{1, 2, 3, 4, 5});
        printArray(new Object[]{new A(), new A(), new A(), new A()});
    }

}
