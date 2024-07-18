package ch006.HouseKeeping;

import javax.management.ObjectName;

public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        //Can take individual elements:
        printArray(47, (float) 3.14F, 11.11);
        printArray(47, 3.14F, 11.11);
        printArray("one", "two", "three");
        //or an array:
        printArray((Object[]) new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
    printArray();//Empty list is ok
        printArray(1);
        printArray(2);
        printArray(3);
    }
}
