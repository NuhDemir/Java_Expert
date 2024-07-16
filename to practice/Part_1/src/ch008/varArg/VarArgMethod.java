package ch008.varArg;

public class VarArgMethod {

    //main as var arg method
    public static void main(String[] args) {

    }

    //Method with two arguments
    public static void  calculateAverage(int x,int y)
    {
        System.out.println("Average: " + (double)(x+y)/2);
    }

    //Method with three arguments and goes on!
public static void calculateAverage(int x,int y,int z)
{
    System.out.println("Average: " +(double)(x+y+z)/3);
}

//

}
