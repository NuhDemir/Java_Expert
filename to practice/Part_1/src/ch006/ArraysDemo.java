package ch006;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo {

    int[] intArray = new int[20];
    Pizza[] pizzas = new Pizza[4];
    boolean[] flags = {true, false};

    public static void main(String[] args) {
        ArraysDemo demo = new ArraysDemo();
        demo.initialize();
        demo.copy();
        demo.copyRange();
     //   demo.fill(2);
        demo.sort();
        demo.search();

    }

    public void search() {
    }

    public void sort() {
System.out.println("\nSorting an array: ");
Arrays.sort(intArray);
print(intArray);
    }

    public void fill(int key) {
        System.out.println("\nFilling an array with  " + key + ": ");
        Arrays.fill(intArray, key);
        print(intArray);
    }

    public void copy() {
        System.out.println("\nCopying the array: ");
        int[] copy1 = Arrays.copyOf(intArray, 5);
        System.out.println("Whole copy: ");
        print(copy1);

        System.out.print("Only 0 to 4 copy: ");
        int[] copy2 = Arrays.copyOf(intArray, 5);
        print(copy2);
    }

    public void copyRange() {
        System.out.println("\nCopying the range of the array: ");
        int[] copy = Arrays.copyOfRange(intArray, 4, 12);
        System.out.println("Range 5 to  15 copy: ");
        print(copy);
    }

    public void initialize() {
for (int i = 0; i<intArray.length;i++)
{
    Random r = new Random();
    int randomInt = r.nextInt();
    int number = randomInt % 100;
    intArray[i]=number;
}

System.out.println("Original array: ");
print(intArray);
pizzas[0] = new Pizza("Peynirli");
pizzas[1] = new Pizza("Mısırlı");
pizzas[2] = new Pizza("Karışık");

    }

    public void print(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] + " - ");
        }
        System.out.println("---");
    



    }

}
