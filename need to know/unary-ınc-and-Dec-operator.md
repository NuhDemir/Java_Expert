## Java'da Tekli Artırma ve Azaltma Operatörleri (UnaryIncAndDecOperators)

**Tekli artırma ve azaltma operatörleri**, Java'da bir değişkenin değerini **bir** birim **arttırmak** veya **azaltmak** için kullanılan operatörlerdir. Bu operatörler **ön ek** veya **son ek** olarak kullanılabilir.

**Operatörler:**

* **Ön ek artırma operatörü:** `++x`
* **Son ek artırma operatörü:** `x++`
* **Ön ek azaltma operatörü:** `--x`
* **Son ek azaltma operatörü:** `x--`

**Fark Nedir?**

* **Ön ek operatörler:** Değişkenin değerini **arttırır** veya **azaltır** ve **sonra** atamayı gerçekleştirir.
* **Son ek operatörler:** Atamayı gerçekleştirir ve **sonra** değişkenin değerini **arttırır** veya **azaltır**.

**Örnekler:**

```java
int sayi = 10;

// Ön ek artırma
int sonuc1 = ++sayi;
System.out.println(sonuc1); // Çıktı: 11
System.out.println(sayi);   // Çıktı: 11

// Son ek artırma
int sonuc2 = sayi++;
System.out.println(sonuc2); // Çıktı: 11
System.out.println(sayi);   // Çıktı: 12

// Ön ek azaltma
int sonuc3 = --sayi;
System.out.println(sonuc3); // Çıktı: 11
System.out.println(sayi);   // Çıktı: 10

// Son ek azaltma
int sonuc4 = sayi--;
System.out.println(sonuc4); // Çıktı: 10
System.out.println(sayi);   // Çıktı: 9
```

**Kullanım Alanları:**

* Döngülerde sayaç değerlerini güncellemek için.
* Koşullu ifadelerde basit değer güncellemeleri yapmak için.
* Kodun daha kısa ve öz hale getirilmesi için.

**Dikkat Edilmesi Gerekenler:**

* Tekli artırma ve azaltma operatörleri sadece **sayısal** değişkenlerle kullanılabilir.
* Bu operatörler **mantıksal** değişkenlerle kullanılamaz.
* Operatörlerin ön ek veya son ek olarak kullanımı, kodun işleyişini değiştirebilir.

**Özet:**

Tekli artırma ve azaltma operatörleri, Java'da kodunuzu daha kısa ve öz hale getirmek için kullanabileceğiniz kullanışlı araçlardır. Bu operatörleri kullanırken, ön ek ve son ek kullanımının arasındaki farkı ve hangi durumlarda kullanılabileceklerini göz önünde bulundurmanız önemlidir.
