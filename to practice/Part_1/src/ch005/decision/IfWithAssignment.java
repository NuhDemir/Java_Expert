package ch005.decision;

public class IfWithAssignment {
    public static void main(String[] args) {
        boolean b = false;
        if (b=true)//Written by mistake instead of ==
            System.out.println("false");
        else
            System.out.println("true");

        System.out.println();

        int i = (int) (Math.random()*100);
        int j = (int) (Math.random()*100);


        if (b = i <j ? true:false)
        {
            System.out.println(i + " < " +j);
        }
else
        {
            System.out.println(i + " > " +j);

        }

System.out.println();

int x = (int)(Math.random()*1000);
int y = (int)(Math.random()*1000);
int z = (int)(Math.random()*1000);

System.out.println("x: " + x  + " y: " + y+ " z: "+ z);

if (b= x<y ? x<z ? true:false:false)
    System.out.println(x+ " < " + " and " + x + " < " +z);
else
    System.out.println(x + " < " +y );

if (b=x<y? (x<z ? true:false):false)
    System.out.println(x +" < " + y+ " and " +x +" < " +z);
else
    System.out.println(x + " < " + y);




    }
}
