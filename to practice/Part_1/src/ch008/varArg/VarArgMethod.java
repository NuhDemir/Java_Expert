package ch008.varArg;

public class VarArgMethod {

    //main as var arg method
    public static void main(String[] args) {
calculateAverage(4,3);
calculateAverage(4,3,2);
int a[] = {10,20,30,40,50,60,70,80,90,100};
calculateAverageWithArray(a);
int b[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
calculateAverageWithArray(b);

average();//Call with no argument
        average(4);
        average(1,2,3,4);
        average(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
average(0xAB);
average(b);
anotherAverage(2,true,5,10,15);

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
