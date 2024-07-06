package ch005;

public class ContinueDemo {

    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            if (i ==12)
                continue; //Skip the rest for this iteration
            System.out.println(i + "\t" +Math.sqrt(i));
        }
    }
}
