## Java'da Tekli Yükseltme (Unary Promotion):

**Tekli yükseltme (Unary Promotion)**, Java'da bir **ifadenin tipini** otomatik olarak **daha geniş bir tipe** dönüştürme işlemidir. Bu işlem, bir ifadenin değerinin **daha büyük bir aralığa** sığmasını veya **daha fazla bilgi** saklamasını sağlamak için kullanılır.

**Ne Zaman Gerçekleşir?**

Tekli yükseltme, aşağıdaki durumlarda gerçekleşir:

* Bir ifade, bir atamada veya bir yöntem çağrısında **daha geniş bir tipte bir değişkene** atanır.
* Bir ifade, **koşullu bir ifadenin** veya **döngünün** koşulunda kullanılır.
* Bir ifade, **matematiksel bir işlemde** kullanılır.

**Örnekler:**

```java
byte b = 10;
int i = b; // Tekli yükseltme gerçekleşir, b değeri int tipine dönüştürülür.

boolean kosul = b > 5; // Tekli yükseltme gerçekleşir, b değeri int tipine dönüştürülür.

int sonuc = b + 5; // Tekli yükseltme gerçekleşir, b değeri int tipine dönüştürülür.
```

**Avantajlar:**

* Kodun daha okunabilir ve anlaşılır hale gelmesini sağlar.
* Tip dönüştürme işlemlerini manuel olarak yapma ihtiyacını ortadan kaldırır.
* Kodun daha kısa ve öz hale gelmesini sağlar.

**Dezavantajlar:**

* Veri kaybına yol açabilir.
* Kodun performansını etkileyebilir.

**Dikkat Edilmesi Gerekenler:**

* Tekli yükseltme, **sadece veri kaybına yol açmayacak durumlarda** kullanılmalıdır.
* Karmaşık ifadelerde tekli yükseltmenin kullanımı, kodun okunabilirliğini **azaltabilir**.
* Tekli yükseltmenin performans etkisi, **kullanılan Java sürümüne** ve **derleyicinin optimizasyon ayarlarına** bağlıdır.

**Özet Tablo:**

| Özellik | Açıklama |
|---|---|
| Tanım | Bir ifadenin tipini otomatik olarak daha geniş bir tipe dönüştürme. |
| Ne Zaman Gerçekleşir? | Atamalar, koşullar, döngüler ve matematiksel işlemler. |
| Avantajlar | Okunabilirlik, kod kısalığı, otomatik tip dönüştürme. |
| Dezavantajlar | Veri kaybı, performans etkisi. |
| Dikkat Edilmesi Gerekenler | Veri kaybı riski, kod okunabilirliği, performans. |
