package ch003;

public class FinalVariables {
    public static void main(String[] args) {

        final int k = 11;
        System.out.println(k);

        //Illegal
        //  i =33
        // i++ , i--

        //Following is not illegal
        final long l; //Blank final
        //System.out.println(l);

        //l=11; //That's illegal
        //System.out.println(l);

        //Following is ok.
        int x = 3;
        int y = 8;
        final int j;

        if (x > y)
            j = 9;
        else
            j = 11;
    }

}
