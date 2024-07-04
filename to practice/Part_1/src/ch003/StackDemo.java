package ch003;

import java.util.Arrays;
import java.util.function.Predicate;

public class StackDemo {
    private static String[] methods = {"a", "b", "c", "d"}; // İzleme yapmak için kullanılan metod isimleri
    private static int uCallCount; // u() metodunun kaç kez çağrıldığını takip eder

    public static void main(String[] args) {
        printStackTrace(1); // Başlangıç noktası
        f(); // f() metodunu çağır
        printStackTrace(7); // f() çağrısından sonra
        u(); // u() metodunu çağır
        printStackTrace(9); // u() çağrısından sonra
    }

    public static void f() {
        printStackTrace(2); // f() başlangıcı
        int i = 3;
        String s1 = new String("Java"); // Yeni String nesnesi
        g(false); // g() metodunu false parametresiyle çağır
        printStackTrace(3); // İlk g() çağrısından sonra
        g(true); // g() metodunu true parametresiyle çağır
        i++; // i'yi artır
    }

    public static void g(boolean b) {
        if (!b)
            printStackTrace(3); // g() false ile çağrıldığında
        else
            printStackTrace(5); // g() true ile çağrıldığında
        int i = 5;
        i++;
        String s1 = new String("Java!");
        if (b)  // b true olduğunda u() metodunu çağır
            u();
    }

    public static void u() {
        if (uCallCount == 0) {
            printStackTrace(6); // İlk u() çağrısı
            uCallCount++;
        } else
            printStackTrace(8); // İkinci ve sonraki u() çağrıları
        int i = 5;
        String s1 = new String("Java!");
    }

    public static void printStackTrace(int breakPoint) {
        // İstif izlemeyi başlatan bir ayraç (separator) yazdır
        System.out.println("=============");
        // İlgili kırılma noktasını belirten bir mesaj yazdır
        System.out.println("Break point " + breakPoint + " ...");

        // Predicate tanımı: Metod adının 'methods' dizisinde olup olmadığını kontrol eder
        Predicate<String> isInArray = s -> Arrays.binarySearch(methods, s) >= 0;

        // Mevcut thread'in (iş parçacığının) istif izleme elemanlarını al
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        // Her bir istif izleme elemanını döngü ile işle
        for (StackTraceElement element : stackTraceElements) {
            // Mevcut elemanın metod adını al
            String methodName = element.getMethodName();

            // Eğer metod adı 'methods' dizisinde mevcutsa
            if (isInArray.test(methodName))
                // Metod adını ve ayıracı formatlı bir şekilde yazdır
                System.out.printf("%-13s %2s\n", methodName, "||");
        }

        // İstif izlemeyi bitiren bir ayraç (separator) yazdır
        System.out.println("============");
    }
}
