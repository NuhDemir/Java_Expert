package ch010.initialization;

public class InitializerMethods {

    boolean isOpen = isDoorOpen();
    //boolean isOpen = isDoorOperStatic();

    //static double pi = getPi();//Error
    static double pi = getPiStatic();


    int i = getJ();//i=0
    int j = 10;

    public static void main(String[] args) {
        InitializerBlocks initializerBlocks = new InitializerBlocks();
        System.out.println("i: "+initializerBlocks.i);
    //    System.out.println("j: "+initializerBlocks.j);
    //    System.out.println("isOpen: "+ initializerBlocks.isOpen);
        System.out.println("Pi: "+pi);
     //   System.out.println(initializerBlocks.getPi());
    }


    double getPi(){
        return Math.PI;
    }


    static double getPiStatic(){
        return  Math.PI;
    }

    Boolean isDoorOpen(){
        if (i> pi)
            return true;
        else
            return false;
    }

    static boolean isDoorOpenStatic(){
        return true;
    }

    public int getJ(){
        return j;
    }
}
