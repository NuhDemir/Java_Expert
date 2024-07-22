package ch009;

//Varargs kullanımı autoboxing e bağlo değildir.
//ancak aslında ilkel türleri kullandığını doğrular.
//varargs otomatik paketleme için otomatik olarak çalışır.
public class VarargType {
    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println("character length: " + args.length);
    }

    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println("int length: " + args.length);
    }

    static void j(String... args) {
        System.out.print(args.getClass());
        System.out.println("String length: " + args.length);
    }

    static void w(long... args) {
        System.out.print(args.getClass());
        System.out.println("long length: " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        j("Ali");
        j();
        w(11111);
        w();
        System.out.println("int[]: " + new int[0].getClass());
    }


}
