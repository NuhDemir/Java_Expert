package ch008.varArg;

public class VarArgMethodProblem {
    public static void main(String[] args) {
       // f(1, 2, 3); // Çağrı: f(int i, int... args)
        int a[] = {1, 2, 3, 4, 5, 6};
        f(1, a); // Çağrı: f(int i, int... args)
        f(1, 2, a); // Çağrı: f(int i, int j, int... args)
    }

    // Varargs kullanan metot
    public static void f(int... args) {
        System.out.println("f(int ...args)");
    }

    // Aşağıdaki metot hatalı çünkü varargs parametresinden sonra başka bir parametre olamaz
    // public static void f(int ...args, int k) {
    //    System.out.println("f(int ... args)");
    // }

    // İlk argüman sabit, geri kalanı varargs
    public static void f(int i, int... args) {
        System.out.println("f(int i, int ... args)");
    }

    // İlk iki argüman sabit, geri kalanı varargs
    public static void f(int i, int j, int... args) {
        System.out.println("f(int i, int j, int ... args)");
    }
}
