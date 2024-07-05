package ch003.references;

import java.util.ArrayList;

public class PrimitivesAndReferences {

    public static void main(String[] args) {
        // İlk primitif değişkenleri kullanımı
        handlePrimitiveVariables();

        // Sonra referans değişkenleri kullanımı
        handleReferenceVariables();

        // Dizi ve Liste kullanımı
        handleArrayAndList();

        // Basit sınıf ve nesne oluşturma
        handleCustomClass();
    }

    private static void handlePrimitiveVariables() {
        int i = 3;
        int j = 4;
        i = 9;
        System.out.println("i: " + i + "\t " + "j: " + j);
        System.out.println("==============");
    }

    private static void handleReferenceVariables() {
        String s1 = new String("abcd");
        String s2 = new String("efgh");

        System.out.println("Before switch => s1: " + s1 + " \t " + "s2: " + s2);

        // Referansları değiştir
        String temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println("After switch  => s1: " + s1 + " \t " + "s2: " + s2);

        System.out.println("==================");

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("temp: " + temp);
        System.out.println("s2 starts with: " + s2.charAt(0) + " and ends with: " + s2.charAt(s2.length() - 1));
        System.out.println("temp starts with: " + temp.charAt(0) + " and ends with: " + temp.charAt(temp.length() - 1));
        System.out.println("================");

        // Yeni nesneler oluşturulabilir ve atanabilir.
        s2 = new String("ijkl");
        System.out.println("s2: " + s2 + "\t" + "temp: " + temp);
    }

    private static void handleArrayAndList() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        System.out.println("List elements:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
        System.out.println("================");
    }

    private static void handleCustomClass() {
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Jane", 30);

        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);

        // Nesne referanslarını değiştir
        Person temp = person1;
        person1 = person2;
        person2 = temp;

        System.out.println("After switch => Person 1: " + person1);
        System.out.println("After switch => Person 2: " + person2);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
