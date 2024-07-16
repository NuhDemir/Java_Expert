package ch008.passing;

public class PassingExample {
    public static void main(String[] args) {
        // Temel veri türleri (primitive types) ile geçiş örneği
        int number = 10;
        System.out.println("Metod çağrılmadan önce number: " + number);
        modifyPrimitive(number);
        System.out.println("Metod çağrıldıktan sonra number: " + number);

        // Nesne referansı (object reference) ile geçiş örneği
        MyObject obj = new MyObject();
        obj.value = 10;
        System.out.println("\nMetod çağrılmadan önce obj.value: " + obj.value);
        modifyObject(obj);
        System.out.println("Metod çağrıldıktan sonra obj.value: " + obj.value);

        // Nesne referansının değiştirilmesi örneği
        MyObject anotherObj = new MyObject();
        anotherObj.value = 10;
        System.out.println("\nMetod çağrılmadan önce anotherObj.value: " + anotherObj.value);
        changeReference(anotherObj);
        System.out.println("Metod çağrıldıktan sonra anotherObj.value: " + anotherObj.value);
    }

    // Temel veri türlerini (primitive types) değiştirmeye çalışan metod
    public static void modifyPrimitive(int value) {
        // Burada 'value' değişkeninin kopyası ile çalışıyoruz
        value = 20;
        System.out.println("modifyPrimitive metodunda value: " + value);
    }

    // Nesne referansını (object reference) değiştirmeye çalışan metod
    public static void modifyObject(MyObject o) {
        // Burada 'o' referansının kopyası ile çalışıyoruz, ama aynı nesneyi işaret ediyor
        o.value = 20;
        System.out.println("modifyObject metodunda o.value: " + o.value);
    }

    // Nesne referansını değiştirmeye çalışan metod
    public static void changeReference(MyObject o) {
        // Yeni bir nesne oluşturup 'o' referansını buna yönlendiriyoruz
        o = new MyObject();
        o.value = 30;
        System.out.println("changeReference metodunda o.value: " + o.value);
    }
}
