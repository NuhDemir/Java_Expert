package ch006;

public class MultiDimArray {

    public static void main(String[] args) {
        print(x);
    }

    public static void print(int[][] array) {
   System.out.println("\nPrinting the 2-dim array: ");
   for (int i = 0;i< array.length;i++)
   {
       for (int j = 0; j<array.length; i++)
           System.out.println("[" + i + ", " + j +"] : " + array[i][j]);
   }

    }

    public static void print(int[][][] array) {
  System.out.println("\nPrinting the 3-dim array: ");
  for (int i = 0; i< array.length;i++)
  {
      for (int j= 0; j< array[i].length;j++)
      {
          for (int k = 0; k< array[i][j].length; k++)
              System.out.println("[" + i +", " +j +", " + k + "] : "+ array[i][j][k]);
      }
  }
    }
}
