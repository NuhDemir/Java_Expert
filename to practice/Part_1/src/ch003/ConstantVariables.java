package ch003;

public class ConstantVariables {

    public static void main(String[] args) {

        // Sabit Değişken Tanımlama ve Başlatma
        final int i = 4; // Sabit değişken
        System.out.println("i: " + i);

        // Aşağıdaki satırlar yasa dışıdır çünkü sabit değişkenlerin değeri değiştirilemez
        // i = 8;
        // i++;

        // Sabit fakat başlangıçta başlatılmamış değişken (Blank final)
        final long l;
        l = 9;
        System.out.println("l: " + l);

        // Aşağıdaki satır yasa dışıdır çünkü sabit değişken zaten başlatılmıştır
        // l = 12;

        // Diğer sabit değişken örnekleri
        final boolean b = !true;
        final int k = 1 * 2 * 3 * 4 * 5;
        System.out.println("k: " + k);

        final float f = (float) (4 * Math.PI) / 2;
        final double d = 1.0 * Math.PI;

        final String s1 = "Java is good!"; // Sabit değişken
        final String s2 = "The integer is " + 22; // Sabit değişken
        final String s3 = new String("Java is good!"); // Sabit değişken değil

        // Aşağıdaki değişkenlerin değerleri sonradan atanabilir
        int x = 2;
        int y = 1;
        final int j; // Başlangıçta başlatılmamış ama sabit değişken

        // Koşullu atama
        if (x > y) {
            j = 2;
        } else {
            j = 12;
        }
        System.out.println("j: " + j);

        // Sabit dizi (Array)
        final int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Initial array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Dizi öğeleri değiştirilebilir, ama dizinin kendisi değiştirilemez
        arr[0] = 10;
        System.out.println("Modified array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Diziye yeni bir referans atamak yasa dışıdır
        // arr = new int[]{6, 7, 8, 9, 10};

        // Sabit nesne (Object)
        final MyClass myObject = new MyClass(5);
        System.out.println("Initial object value: " + myObject.getValue());

        // Nesne içeriği değiştirilebilir, ama nesnenin kendisi değiştirilemez
        myObject.setValue(10);
        System.out.println("Modified object value: " + myObject.getValue());

        // Nesneye yeni bir referans atamak yasa dışıdır
        // myObject = new MyClass(20);
    }
}

// Örnek bir sınıf
class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }




    }

