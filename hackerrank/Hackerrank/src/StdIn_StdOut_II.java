import java.util.Scanner;

public class StdIn_StdOut_II {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        
        scan.nextLine(); // Consume newline left-over
        
        String s = scan.nextLine();
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
