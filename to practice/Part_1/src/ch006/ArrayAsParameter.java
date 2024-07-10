package ch006;

public class ArrayAsParameter {

    public static void main(String[] args) {
        int[] array1 = new int[3];
        array1[0] = 17;
        array1[1] = 22;
        array1[2] = -8;

        calculateAvverage(array1);
        int[] array2 = {1,5,3,7,2};
        calculateAvverage(array2);
        calculateAvverage(new int[] {55,66,77});
        calculateAvverage(new int[3]);
    }


       public static void calculateAvverage(int[] array)
        {
            double total = 0;
            for (int i: array)
                total +=i;
            System.out.println("Average is "+ total / array.length);
        }

}
