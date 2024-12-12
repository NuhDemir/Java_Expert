### Nerede Kullanılır?

Java'da set ve get metotları, **nesne yönelimli programlama (OOP)** prensiplerinden biri olan **kapsülleme (encapsulation)** kavramını uygulamak için kullanılır. Bu metotlar sayesinde, bir sınıfın değişkenlerine dışarıdan doğrudan erişim engellenir ve bu değişkenlerin değerleri bu metotlar aracılığıyla kontrol edilir.

**Kapsülleme neden önemlidir?**

- **Veri gizleme:** Sınıfın iç durumu dışarıdan gizlenir, böylece yanlışlıkla veya kasıtlı olarak değişkenlerin değerlerinin bozulması önlenir.
- **Kod güvenliği:** Sınıfın kullanımı kolaylaşır ve hataların önlenmesine yardımcı olur.
- **Bakım kolaylığı:** Sınıfın yapısı değiştirilse bile, dışarıdan erişim sağlayan kodlar etkilenmez.

### Nasıl Kullanılır?

**Set metodu:** Bir değişkenin değerini dışarıdan değiştirmek için kullanılır.

```java
public void setDeger(int yeniDeger) {
    this.deger = yeniDeger;
}
```

- `setDeger`: Metodun adı (isteğe bağlı olarak değişken adına göre ayarlanır).
- `int yeniDeger`: Metoda dışarıdan gönderilen yeni değer.
- `this.deger`: Sınıf içindeki değişkene yeni değerin atanması.

**Get metodu:** Bir değişkenin değerini dışarıdan almak için kullanılır.

```java
public int getDeger() {
    return deger;
}
```

- `getDeger`: Metodun adı.
- `return deger`: Değişkenin değeri geri döndürülür.

### Neden Kullanılır?

- **Veri doğrulama:** Set metodu içerisinde, atanan değerin geçerli olup olmadığı kontrol edilebilir (örneğin, negatif bir sayı atanmaya çalışılıyorsa hata verebilir).
- **Hesaplamalar:** Değer alındığında veya atandığında bazı hesaplamalar yapılabilir (örneğin, bir yaş hesaplaması).
- **Olay tetikleme:** Değer değiştiğinde başka bir metod çağrılabilir (örneğin, bir veri tabanına kayıt güncellenebilir).

### Ne Zaman Kullanılır?

- **Tüm değişkenler için değil:** Genellikle private olarak tanımlanan değişkenler için kullanılır. Public değişkenlere doğrudan erişim sağlanabilir.
- **Gerekli durumlarda:** Eğer bir değişkenin değerinin dışarıdan değiştirilmesi veya okunması gerekiyorsa set ve get metotları kullanılır.
- **Kapsülleme prensibine uygun olarak:** Sınıfın iç durumu dışarıdan gizlenerek kodun daha güvenli ve bakımı kolay hale getirilmesi istendiğinde kullanılır.

### Örnek

```java
public class Kisi {
    private String ad;
    private int yas;

    public void setAd(String yeniAd) {
        this.ad = yeniAd;
    }

    public String getAd() {
        return ad;
    }

    public void setYas(int yeniYas) {
        if (yeniYas >= 0) {
            this.yas = yeniYas;
        } else {
            System.out.println("Yaş negatif olamaz.");
        }
    }

    public int getYas() {
        return yas;
    }
}
```

Bu örnekte, `Kisi` sınıfında `ad` ve `yas` değişkenleri private olarak tanımlanmıştır. `setAd` ve `getAd` metotları ile bu değişkenlere dışarıdan erişim sağlanır. `setYas` metodunda ise yaşı negatif bir değere eşitlemek istediğimizde bir hata mesajı verilir.

### Sonuç

Set ve get metotları, Java'da nesne yönelimli programlamanın temel yapı taşlarından biridir. Bu metotlar sayesinde kodunuz daha güvenli, daha bakımı kolay ve daha anlaşılır hale gelir.

**Özetle:**

- **Nerede:** Nesnelerin özelliklerini (değişkenlerini) kapsüllemek için.
- **Nasıl:** Set metodu ile değer atamak, get metodu ile değer almak.
- **Neden:** Veri gizleme, kod güvenliği, bakım kolaylığı.
- **Ne zaman:** Private değişkenler için, dışarıdan erişim gerektiğinde.

**Ek Bilgiler:**

- **IDE'ler:** Birçok IDE, set ve get metotlarını otomatik olarak oluşturma özelliğine sahiptir.
- **Lombok:** Lombok gibi kütüphaneler, bu metotları daha kısa bir şekilde yazmanıza olanak tanır.

**Bu anlatım, set ve get metotlarının temel kullanımını açıklamaktadır. Daha detaylı bilgi için Java dökümantasyonuna veya ilgili kaynaklara başvurabilirsiniz.**
