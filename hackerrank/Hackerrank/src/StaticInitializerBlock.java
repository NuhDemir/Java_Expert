import java.io.*;
import java.util.*;

public class StaticInitializerBlock  { static int B; static int H; static int A;

    public static void main(String[] args) {
        try {
            Scanner c = new Scanner(System.in);
            B = c.nextInt();
            H = c.nextInt();
            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            } else {
                A = B * H;
                System.out.println(A);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
