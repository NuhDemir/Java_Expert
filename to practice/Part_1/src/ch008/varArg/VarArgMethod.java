package ch008.varArg;

public class VarArgMethod {

    //main as var arg method
    public static void main(String[] args) {

    }

    //Method with two arguments
    public static void calculateAverage(int x, int y) {
        System.out.println("Average: " + (double) (x + y) / 2);
    }

    //Method with three arguments and goes on!
    public static void calculateAverage(int x, int y, int z) {
        System.out.println("Average: " + (double) (x + y + z) / 3);
    }

    //Method with array arguments. but it needs to be called by providing an array
    public static void calculateAverageWithArray(int[] array) {
        int sum = 0;
        int i = 0;
        for (int x : array) {
            sum += x;
            i++;
        }
        System.out.println("Average: " + (double) sum / i);
    }

    //That's the solutions.
    public static void average(int... array) {
        int sum = 0;
        int x = 0;
        for (int i : array) {
            sum += i;
            x++;
        }

        System.out.println("Average: " + (double) sum / x);
    }

    public static void anotherAverage(int y, boolean b, int... array) {
        int sum = 0;
        int i = 0;
        for (int x : array) {
            sum += x;
            i++;
        }
        System.out.println("Average: " + (double) sum / i);
        System.out.println("y: " + y);
    }
}
