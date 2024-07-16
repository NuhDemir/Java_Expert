package ch008.passing;

public class ParameterPassing {

    public void f(A aa)
    {
        aa.i++;
    }
    public void f(int j) {
        //j=i;

        j++;
    }

    public static void main(String[] args) {
        ParameterPassing o = new ParameterPassing();

        //Passing primitive
        int i = 5;
        System.out.println("i: " +i);
        o.f(i);
        System.out.println("i: " +i);
        System.out.println("---------------");

        //Passing a reference
        A a = new A();
        System.out.println("a.i: "+ a.i);
        o.f(a);
        System.out.println("a.i: "+ a.i);
    }
}
class A  {
    int i = 5;
}