package ch010.initialization;

import ch004.control.RandomBounds;

import java.util.Random;

public class InitializerBlocks {
double d;
//d =3.14D;
{
    System.out.println("\nInitializer block-1:");
    d=calculateD();
}

int l;

    {
        long l = 4;
        System.out.println("\ninitializer block-2:");
        Random random = new Random();
        l= random.nextLong();
        this.l=(int)(Math.abs(l)%100);
    }

    static int i;

    static {
        System.out.println("\n static initializer block-1.");
    double d = Math.random();
    int i;
    if (d<0.5){
        i=4;
    }else
        i= 10;
    InitializerBlocks.i=i;
    }
static  int[] ints = new int[10];

    static {
        System.out.println("\ninitializing the static array:");
for (int i=0; i<ints.length;i++)
    ints[i]= (i+1)*10;
    }

    String s;
    {
        //initializing the string
        s=new String("Java 8");
    }


    double calculateD(){
        return Math.random()*10;
    }

    void printInfo(){
        System.out.println("\nVariables:");
        System.out.println("d: "+d);
        System.out.println("l: "+l);
        System.out.println("i: "+i);
        System.out.println("\nArray :");

        for (int i : ints)
            System.out.print(i+"-");
        System.out.println("\ns: "+s);

    }

    public static void main(String[] args) {
        new InitializerBlocks();
        new InitializerBlocks();

        InitializerBlocks initializerBlocks = new InitializerBlocks();
        initializerBlocks.printInfo();
    }

}

