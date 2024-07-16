## Java'da `final` Anahtar Kelimesi: Detaylı İnceleme

Java'da `final` anahtar kelimesi, değişkenlerin, metodların ve sınıfların davranışını etkilemek için kullanılır. Farklı bağlamlarda farklı anlamlara sahip olsa da, genel olarak **değişmezlik** kavramıyla ilişkilendirilir.

**1. Final Değişkenler:**

* Bir değişkene `final` anahtar kelimesi eklendiğinde, o değişkene **sadece bir kez değer atanabilir** ve **atanmadan sonra değeri değiştirilemez**.
* Değer ataması, değişkenin tanımlandığı yerde veya ilk kullanıldığı yerde yapılmalıdır.
* `final` değişkenler, **sınıf sabiti** olarak da adlandırılır ve tüm nesneler tarafından aynı değeri paylaşır.
* **Örnek:**

```java
final int PI = 3.14159;
```

Bu kodda, `PI` değişkenine `final` anahtar kelimesi eklenmiştir. Bu, değişkene yalnızca bir kez değer atanabileceği ve değerinin 3.14159 olarak kalacağı anlamına gelir. Değişkenin değerini sonradan değiştirmek mümkün değildir.

**2. Final Metot Parametreleri:**

* Bir metodun parametresine `final` anahtar kelimesi eklendiğinde, o parametreye **sadece bir kez değer atanabilir** ve **metod gövdesinde değeri değiştirilemez**.
* Bu, metoda gönderilen argümanların metodun çalışması boyunca sabit kalmasını sağlar.
* **Örnek:**

```java
public void yazdir(final String mesaj) {
  System.out.println(mesaj);
}
```

Bu kodda, `yazdir` metodunun `mesaj` parametresine `final` anahtar kelimesi eklenmiştir. Bu, metoda gönderilen metin değerinin metodun çalışması boyunca değişmeyeceği anlamına gelir. Metod gövdesinde `mesaj` değişkeninin değeri değiştirilemez.

**3. Final Metotlar:**

* Bir metoda `final` anahtar kelimesi eklendiğinde, o metot **alt sınıflar tarafından geçersiz kılınamaz (override edilemez)**.
* Bu, metodun davranışının tüm alt sınıflar için aynı kalmasını sağlar ve kod tutarlılığını korur.
* **Örnek:**

```java
final class Islem {
  public final void calistir() {
    System.out.println("İşlem gerçekleştiriliyor...");
  }
}
```

Bu kodda, `Islem` sınıfı ve `calistir` metodu `final` olarak tanımlanmıştır. Bu, hiçbir alt sınıfın `calistir` metodunun davranışını değiştiremeyeceği anlamına gelir. Tüm alt sınıflar için `calistir` metodu aynı şekilde çalışacaktır.

**4. Final Sınıflar:**

* Bir sınıfa `final` anahtar kelimesi eklendiğinde, o sınıf **alt sınıflandırılamaz (extend edilemez)**.
* Bu, sınıfın hiyerarşisini en üst seviyede tutar ve yeni alt sınıflar oluşturulmasını engeller.
* **Örnek:**

```java
final class Matematik {
  // ...
}
```

Bu kodda, `Matematik` sınıfı `final` olarak tanımlanmıştır. Bu, hiçbir sınıfın `Matematik` sınıfından kalıtım alamayacağı anlamına gelir.

**Özet:**

`final` anahtar kelimesi, Java'da değişkenlerin, metodların ve sınıfların davranışını kontrol etmek için güçlü bir araçtır. Değişmezlik kavramını kullanarak kodunuzu daha sağlam, tutarlı ve hataya karşı daha az duyarlı hale getirebilirsiniz.

**Dikkat Edilmesi Gerekenler:**

* `final` anahtar kelimesi, performans optimizasyonu için JVM tarafından kullanılabilir.
* `final` değişkenler için hafıza tahsisi statik olarak yapılır.
* Gereksiz yere `final` anahtar kelimesi kullanmaktan kaçının, zira bu kodun esnekliğini sınırlayabilir.

