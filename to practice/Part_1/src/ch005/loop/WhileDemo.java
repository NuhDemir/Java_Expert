package ch005.loop;

public class WhileDemo {
    public static void main(String[] args) {
        double r = Math.random();

        System.out.println("r: " +r);

        while (r<0.6)
        {
            r=Math.random();
            System.out.println("in while"+r);
        }

        System.out.println("After while");
    }
}
