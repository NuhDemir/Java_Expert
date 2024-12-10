package ch008;

public class encapsulation_class_control {
    public int publicVar = 1; //Her yerden erişilebilir.
    protected int protectedVar = 2;//Aynı paket veya alt sınıflardan erişilebilir.
    int defaultVar = 3; //Aynı paket içinde erişilebilir.
    private int privateVar = 4; //Sadece aynı sınıfta erişilebilir.


    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod(){
        System.out.println("Protected Method");
    }

    void defaultMethod(){
        System.out.println("Default Method");
    }

    private void privateMethod(){
        System.out.println("Private Method");
    }
}