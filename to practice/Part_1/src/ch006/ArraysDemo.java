package ch006;

import java.util.Arrays;

public class ArraysDemo {

    int[] intArray = new int[20];
    Pizza[] pizzas = new Pizza[4];
    boolean[] flags = {true, false};

    public static void main(String[] args) {
        ArraysDemo demo = new ArraysDemo();
        demo.initialize();
        demo.copy();
        demo.copyRange();
        demo.fill();
        demo.sort();
        demo.search();

    }

    public void search() {
    }

    public void sort() {

    }

    public void fill() {

    }

    public void copy() {
        System.out.println("\nCopying the array: ");
        int[] copy1 = Arrays.copyOf(intArray, 5);
        System.out.println("Whole copy: ");
        print(copy1);

        System.out.print("Only 0 to 4 copy: ");
        int[] copy2 = Arrays.copyOf(intArray,5);
        print(copy2);
    }

    public void copyRange() {
System.out.println("\nCopying the range of the array: ");
int[] copy = Arrays.copyOfRange(intArray,4,12);
System.out.println("Range 5 to  15 copy: ");
print(copy);
    }

    public void initialize() {

    }

    public void print(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] + " - ");
        }
        System.out.println("---");
    }

}
