import java.util.Scanner;


public class IfElse_2 {
	   private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.close();

	   
	        String result = (N % 2 != 0 || (N >= 6 && N <= 20)) ? "Weird" : "Not Weird";
	        System.out.println(result);
	    }
}
