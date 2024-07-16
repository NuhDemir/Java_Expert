## Java'da Değer Aktarımı (Passing)

Java'da, fonksiyonlara veya metotlara değer aktarımı, program akışını ve değişkenlerin nasıl değiştiğini etkileyen önemli bir konudur. İki temel değer aktarım türü vardır:

**1. Değer Gönderme (Pass by Value):**

* Bu yöntemde, fonksiyona aktarılan değişkenin değeri kopyalanır ve fonksiyon bu kopyanın üzerinde işlem yapar.
* **Etkisi:** Fonksiyon içinde yapılan değişiklikler, orijinal değişkeni etkilemez.
* **Örnek:**

```java
public class PassByValue {
    public static void main(String[] args) {
        int x = 5;
        degistir(x);
        System.out.println(x); // 5 yazdırır
    }

    public static void degistir(int y) {
        y = 10;
    }
}
```

Bu örnekte, `main()` fonksiyonundan `degistir()` fonksiyonuna `x` değişkeninin değeri kopyalanır. `degistir()` fonksiyonu kopyanın değerini 10'a değiştirir, ancak bu değişiklik orijinal `x` değişkenini etkilemez.

**2. Referans Gönderme (Pass by Reference):**

* Bu yöntemde, fonksiyona aktarılan değişkenin bellekteki **referansı** gönderilir.
* **Etkisi:** Fonksiyon içinde yapılan değişiklikler, orijinal değişkeni doğrudan etkiler.
* **Örnek:**

```java
public class PassByReference {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        degistir(arr);
        System.out.println(arr[0]); // 10 yazdırır
    }

    public static void degistir(int[] arr) {
        arr[0] = 10;
    }
}
```

Bu örnekte, `main()` fonksiyonundan `degistir()` fonksiyonuna `arr` dizisinin referansı gönderilir. `degistir()` fonksiyonu dizinin ilk elemanını 10'a değiştirir ve bu değişiklik orijinal `arr` dizisini de etkiler.

**Hangi Yöntemi Kullanmalı?**

Genellikle, basit değerler için **değer gönderme** ve nesneler veya diziler gibi karmaşık veri yapıları için **referans gönderme** kullanılması daha iyidir. Referans gönderme, büyük veri yapımlarının kopyalanmasını önleyerek performansı optimize edebilir.

**Dikkat Edilmesi Gerekenler:**

* Değer göndermede, fonksiyon içinde yapılan değişiklikler kalıcı olmaz.
* Referans göndermede, fonksiyon içinde yapılan değişiklikler orijinal değişkeni de etkiler.
* Hangi yöntemi kullanacağınız, programınızın mantığına ve veri türlerine bağlıdır.
