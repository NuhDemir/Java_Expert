package ch008.passing;

import ch006.MainDemo;

public class PassByObjectExample {

    public static void main(String[] args) {
        MyObject obj = new MyObject();
        System.out.println("before calling modify object: " +obj.value);
        modifyObject(obj);
        System.out.println("before calling modify object: " +obj.value);


    }

    public static  void modifyObject(MyObject o) {
        o.value = 20;
        System.out.println("Insıde modify object: " +o.value);
    }
}

class MyObject {
    int value;
}