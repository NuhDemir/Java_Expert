package ch006.this_method;

public class DemoThis {
    int a = 3;
    int b = 4;
    int c = 5;

    int d= this.a*b;

    public DemoThis() {}

    public DemoThis(int a,int b,int c,int d){
        this.a=a;
        this.b=b;
        this.d=d;
    }

    void setA(int a){
        this.a=a;
    }

    void xMethod(){
        this.printMethod();
    }

    void printMethod(){
        System.out.println(this.a+" "+this.b+" "+this.c+" "+this.d);
    }

    public static void main(String[] args) {
        DemoThis demo = new DemoThis();
        demo.setA(1);
        demo.xMethod();
        
    }
}
