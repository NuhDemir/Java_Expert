package ch005;

public class BreakAndContinueWithLabel {
    public static void main(String[] args) {
        int[][] arrayOfInts = {
                {20, 30, 40, 50},
                {12, 13, 14, 15},
                {1, 2, 3, 4}
        };

        int searchfor = 12;

        int i = 0;
        int j = 0;
        boolean foundIt = false;

        here:
        for (; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i][j] == searchfor) {
                foundIt = true;
                System.out.println("Found " + searchfor + " at " + i + ", " + j);

         continue ; }
            }
        if (!foundIt)
            System.out.println(searchfor + " not in the array");
        }

    }


