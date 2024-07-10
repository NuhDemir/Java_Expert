package ch006;

public class MultiDimArray {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 9, 0, 3, 8},
                {4, 1, 6, 7, 5}};
        System.out.println("a's length: " + a.length);
        System.out.println("a[0] length: " + a[0].length);
        System.out.println("a[1] length: " + a[1].length);

        System.out.println("\nCoordinates: ");
        int[][] coordinates = {{3, 7},
                {13, 2}, {8, 3}};

        int[] coordinates1 = coordinates[0]; //{3,7}
        int[] coordinates2 = coordinates[1]; //{13,2}
        int[] coordinates3 = coordinates[2]; //{8,3}


        System.out.println("coordinates[0][0]: " + coordinates[0][0]);
        System.out.println("coordinates[0][0]: " + coordinates[0][1]);
        System.out.println("coordinates[0][0]: " + coordinates[1][0]);
        System.out.println("coordinates[0][0]: " + coordinates[1][1]);
        System.out.println("coordinates[0][0]: " + coordinates[2][0]);
        System.out.println("coordinates[0][0]: " + coordinates[2][1]);

        print(coordinates);

        int[] a1 = {2, 7, 8, 3, 9};
        int[] a2 = {5, 0, 6, 8, 3};
        int[] a3 = {21, 11, 0, 4, 1};
        int[][] m = {a1, a2, a3};

        int[][] b = new int[2][];
        b[0] = new int[3];
        b[1] = new int[5];


        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b[i].length; j++)
            b[i][j] = (i+1)*(j+1)*((int) (Math.random()*100));

        print(b);

        // 3-D array with fixed length:
        int[][][] x = new int[2][4][6];
        int[][][] y = new int[323][][];

        // Can't do that!
//		int[][][] z = new int[][][11];

        // Lengths
        System.out.println("\nx.length is " + x.length);
        System.out.println("x[0].length is " + x[0].length);
        System.out.println("x[1].length is " + x[1].length);
        System.out.println("x[0][0].length is " + x[0][0].length);
        System.out.println("x[0][1].length is " + x[0][1].length);
        System.out.println("x[1][0].length is " + x[1][0].length);
        System.out.println("x[1][1].length is " + x[1][1].length);

        // Initialize 3-dim array
        System.out.println("Initialize 3-dim array");
        int counter = 0;
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[i].length; j++)
                for (int k = 0; k < x[i][j].length; k++)
                    x[i][j][k] = ++counter;

        print(x);
    }

    public static void print(int[][] array) {
        System.out.println("\nPrinting the 2-dim array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; i++)
                System.out.println("[" + i + ", " + j + "] : " + array[i][j]);
        }

    }

    public static void print(int[][][] array) {
        System.out.println("\nPrinting the 3-dim array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++)
                    System.out.println("[" + i + ", " + j + ", " + k + "] : " + array[i][j][k]);
            }
        }
    }
}
