package ch002;

public class Naming {

    private int anIntegerVariable;
    private double aDOubleVariable;


    public static void main(String[] args) {
        Naming namingDemo = new Naming();
        namingDemo.anIntegerVariable = 99;
        namingDemo.aDOubleVariable = 0.13;
        namingDemo.aSimpleMethod(1,3);
        namingDemo.anotherSimpleMethod(2,3);

    }

        public void aSimpleMethod(int aParameter,int anotherParameter)
        {
            System.out.println("in aSimpleMethod(int aParameter, int anotherParameter)");
        }

        public void anotherSimpleMethod(int aParameter,int anotherParameter)
        {
            System.out.println("...");
        }






}
