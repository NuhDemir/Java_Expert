package ch006;
import java.util.Random;
public class ArrayDemo {
    static  int[] intArray = new int[10];

    static boolean[] flags = {true,false};

    public static void main(String[] args) {
        initializeArray();
       // printArrays();
        prblems();
    }

    public static void prblems() {
        System.out.println("\nProblems!");

        // Negative array size causes NegativeArraySizeException!
//		int arrayLength = -5;
//		short[] shorty = new short[arrayLength];
    }

    public static void printArrays() {


  System.out.println("Printing arrays: ");
    for (int i = 0; i<intArray.length; i++)
        System.out.println(intArray[i] + " ");

    System.out.println("----");

    System.out.println("\nFifth element of intArray is " +intArray[4]);
        System.out.println("First element of flags is " + flags[0]);

    }

    public static void initializeArray() {
 System.out.println("\nInıtıalizing Arrays: ");

 Random r = new Random();
 for (int i =0; i<intArray.length; i++)
 {
     int randomInt = r.nextInt();
     int number = randomInt %100;
     intArray[i] = number;
 }
    }
}

class Pizza {
    String name;

    Pizza(String name) {
        this.name = name;
    }
}