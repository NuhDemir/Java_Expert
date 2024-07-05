## Java'da Dize Birleştirme (String Concat)

Java'da dize birleştirmek için birden fazla yöntem mevcuttur. En yaygın kullanılan yöntemler şunlardır:

**1. Toplama Operatörü (+):**

* En basit ve kullanışlı yöntemdir.
* İki veya daha fazla dizeyi birleştirebilir.
* Dize değişkenleri ve sabit metinleri birleştirebilir.
* Null değerlerle birleştirirken dikkatli olunmalıdır.

**Örnek:**

```java
String isim = "Ali";
String soyisim = "Veli";
String tamIsim = isim + " " + soyisim;

System.out.println(tamIsim); // Ali Veli
```

**2. concat() Metodu:**

* `String` sınıfında bulunan bir metottur.
* Bir dizeye başka bir dizeyi ekler.
* Null değerlerle güvenli bir şekilde kullanılabilir.

**Örnek:**

```java
String isim = "Ali";
String soyisim = "Veli";
String tamIsim = isim.concat(" ").concat(soyisim);

System.out.println(tamIsim); // Ali Veli
```

**3. Format() Metodu:**

* `String` sınıfında bulunan bir metottur.
* Dizeleri biçimlendirmek için kullanılır.
* Dize birleştirme için de kullanılabilir.

**Örnek:**

```java
String isim = "Ali";
String soyisim = "Veli";
String tamIsim = String.format("%s %s", isim, soyisim);

System.out.println(tamIsim); // Ali Veli
```

**4. String.join() Metodu (Java 8 ve üzeri):**

* `String` sınıfında bulunan bir metottur.
* Birden fazla dizeyi birleştirmek için kullanılır.
* Ayrıştırıcı karakter belirleme imkanı sunar.

**Örnek:**

```java
String isim = "Ali";
String soyisim = "Veli";
String tamIsim = String.join("-", isim, soyisim);

System.out.println(tamIsim); // Ali-Veli
```

**5. StringBuilder Sınıfı:**

* Büyük miktarda dize birleştirme işlemi için daha performanslıdır.
* Değiştirilebilir dizeler oluşturmak için kullanılır.
* Thread-safe değildir.

**Örnek:**

```java
StringBuilder sb = new StringBuilder();
sb.append("Ali");
sb.append(" ");
sb.append("Veli");

String tamIsim = sb.toString();

System.out.println(tamIsim); // Ali Veli
```

**Hangi Yöntemi Kullanmalıyım?**

Kullanılacak yöntem, birleştirme işleminin karmaşıklığına ve performans gereksinimlerine bağlıdır.

* Basit ve kısa dize birleştirmeleri için `+` operatörü veya `concat()` metodu kullanılabilir.
* Biçimlendirme ile birlikte dize birleştirmeleri için `format()` metodu kullanılabilir.
* Birden fazla dizeyi ve ayrıştırıcı karakteri kullanarak birleştirmek için `String.join()` metodu kullanılabilir.
* Büyük miktarda dize birleştirme işlemi için `StringBuilder` sınıfı kullanılabilir.

**Dikkat Edilmesi Gerekenler:**

* Dize birleştirirken null değerlerle dikkatli olunmalıdır.
* Birleştirme işleminin sonucu yeni bir dizedir, orijinal dizeler değişmez.
* Performans kritik bir faktörse, `StringBuilder` sınıfının kullanılması daha uygun olabilir.
