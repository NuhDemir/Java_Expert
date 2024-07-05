## Java'da Üçlü Operatör (Ternary Operator):

**Üçlü operatör**, Java'da **koşullu ifadeleri** daha kısa ve öz bir şekilde yazmak için kullanılan bir operatördür. Koşula bağlı olarak iki farklı değerden birini seçmenizi sağlar. Aynı zamanda **if-else** ifadesinin kısaltılmış bir halidir.

**Sözdizimi:**

```java
koşul ? değer1 : değer2;
```

**Burada:**

* `koşul`: Boolean bir ifadedir.
* `değer1`: Koşul doğruysa döndürülecek değer.
* `değer2`: Koşul yanlışsa döndürülecek değer.

**Örnek:**

```java
int sayi = 10;
String mesaj = sayi >= 18 ? "Yetişkin" : "Çocuk";
System.out.println(mesaj); // Çıktı: Yetişkin
```

**Üçlü operatörün avantajları:**

* **Kod daha kısa ve öz hale gelir.**
* **Koşullu ifadeleri daha okunabilir hale getirir.**
* **Basit if-else ifadelerine göre daha performanslı olabilir.**

**Üçlü operatörün dezavantajları:**

* **Karmaşık ifadelerde kullanımı zor olabilir.**
* **Kodun okunabilirliğini azaltabilir.**

**Dikkat Edilmesi Gerekenler:**

* Üçlü operatör sadece Boolean ifadelerle kullanılabilir.
* Koşuldan sonra virgül koymak zorunludur.
* Her iki değer de aynı tipte olmalıdır.
* Karmaşık ifadelerde parantez kullanımıyla okunabilirlik artırılabilir.

**Özet Tablo:**

| Özellik | Açıklama |
|---|---|
| Sözdizimi | koşul ? değer1 : değer2; |
| Koşul | Boolean bir ifade. |
| Değer1 | Koşul doğruysa döndürülecek değer. |
| Değer2 | Koşul yanlışsa döndürülecek değer. |
| Avantajlar | Kod daha kısa ve öz, daha okunabilir, daha performanslı. |
| Dezavantajlar | Karmaşık ifadelerde kullanımı zor, okunabilirliği azaltabilir. |
| Dikkat Edilmesi Gerekenler | Sadece Boolean ifadelerle kullanılır, virgül zorunludur, değerler aynı tipte olmalı. |

