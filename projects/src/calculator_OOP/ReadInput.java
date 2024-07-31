package calculator_OOP;

import java.util.Scanner;

public class ReadInput {
public static String read(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("input expression example");
    String inputLine =scanner.nextLine();
    scanner.close();

    return inputLine;
}

}
