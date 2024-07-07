package ch005.loop;

public class ForAndWhile {
    public static void main(String[] args) {

        double r = Math.random();
        System.out.println("r: " + r);

        System.out.println("while: ");
        while (r < 0.7d) {
            r = Math.random();
            System.out.println("r: " + r);
        }

        r=Math.random();
        System.out.println("for: ");
        for (int i = 0; i>=0;i++)
        {
            r=Math.random();
            System.out.println(r);
            System.out.println("-------------------");
            if (r>=0.8d)
            {
                i = -2;
            }
        }
    }
}
