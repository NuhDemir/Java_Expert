package ch005;

public class BreakDemo {

    public static void main(String[] args) {
        for (int i =1; i<=21;i++)
        {
            if (i==12)
                break;//Terminate loop
            System.out.println(i + "\t" + Math.sqrt(i));
        }//end of for loop
        System.out.println("I'm here!");
    }
}
