## Sarmalama (Encapsulation) ve Bilgi Saklama

### Giriş

Nesneye yönelik programlamada **sarmalama** (encapsulation), bir nesnenin veri ve davranışlarını tek bir birim altında toplayarak dış dünyadan soyutlama işlemidir. Bu sayede, bir nesnenin iç yapısı dışarıdan gizlenir ve sadece belirli bir arayüz üzerinden erişilebilir. Bu yaklaşım, yazılım sistemlerinin daha modüler, güvenilir ve bakımı kolay olmasını sağlar.

### Neden Sarmalama?

- **Bilgi Saklama:** Nesnenin iç detaylarının dışarıdan gizlenmesi, yanlışlıkla veri bozulmalarını önler ve kodun daha güvenli olmasını sağlar.
- **Arayüz-Gerçekleştirme Ayrımı:** Arayüz, bir nesnenin dış dünyaya sunduğu sözleşmedir. Gerçekleştirme ise bu sözleşmenin nasıl yerine getirildiğini belirler. Bu ayrım, kodun daha esnek ve genişletilebilir olmasını sağlar.
- **Bağımlılık Azaltma:** Bir nesnenin sadece arayüzüne bağımlı olmak, kodun daha az birbirine bağlı olmasını sağlar. Bu da değişikliklerin daha kolay yapılabilmesini ve hataların daha hızlı bulunabilmesini sağlar.
- **Soyutlama:** Arayüzler, karmaşıklığı gizleyerek daha yüksek seviyede düşünmemizi sağlar.

### İnsanlarda Arayüz

İnsanlar için arayüz, diğer insanlarla iletişim kurarken kullandığımız dil, jestler ve mimikler gibi unsurlardır. İç dünyamızı tamamen açığa vurmak yerine, dışarıya sadece belirli bir görüntü sunarız.

### Java'da Arayüz Örnekleri

Java'da arayüzler, bir sınıfın sahip olması gereken metotların imzalarını (metodun adı, parametreleri ve dönüş tipi) belirtir. Bir sınıf bir arayüzü uygularsa, o arayüzdeki tüm metotları uygulamak zorundadır.

```java
interface IShape {
    double getArea();
    double getPerimeter();
}

class Circle implements IShape {
    // ...
}

class Rectangle implements IShape {
    // ...
}
```

### Diğer Programlama Dillerinde Arayüzler

Diğer birçok programlama dili de arayüz benzeri kavramlara sahiptir. Örneğin, C++'ta saf sanal fonksiyonlar, Python'da ABC'ler (Abstract Base Classes) ve C#'ta arayüzler benzer amaçlarla kullanılır.

### Yazılım Projelerinde Arayüzlerin Kullanımı

Arayüzler, yazılım projelerinde şu alanlarda kullanılır:

- **Modülerlik:** Büyük projeleri daha küçük, yönetilebilir parçalara ayırmak.
- **Çok biçimlilik:** Aynı arayüzü uygulayan farklı sınıfları aynı şekilde kullanmak.
- **Test edilebilirlik:** Kodun farklı parçalarını bağımsız olarak test etmek.
- **Genişletilebilirlik:** Yeni özellikler eklemek veya mevcut özellikleri değiştirmek.

### Cohesion ve Coupling

- **Cohesion:** Bir modülün içindeki elemanların birbirleriyle ne kadar sıkı ilişkili olduğu. Yüksek cohesion, modülün tek bir göreve odaklandığını gösterir.
- **Coupling:** Modüller arasındaki bağımlılık düzeyi. Düşük coupling, modüllerin birbirinden bağımsız olduğunu gösterir.

Ideal bir sistem, yüksek cohesion ve düşük coupling özelliklerine sahip olmalıdır. Bu sayede sistem daha anlaşılır, bakımı kolay ve değişikliklere açık hale gelir.

### API (Application Programming Interface)

API, bir yazılım sisteminin veya bileşeninin diğer yazılımlar tarafından kullanılabilen bir arayüzüdür. API'ler, bir sistemin iç işleyişini gizleyerek sadece gerekli bilgileri sunar.

### Sonuç

Sarmalama, nesneye yönelik programlamanın temel kavramlarından biridir. Bilgiyi saklayarak, kodun daha güvenli, bakımı kolay ve genişletilebilir olmasını sağlar. Arayüzler, bu süreçte önemli bir rol oynar. Yazılım projelerinde arayüzleri etkin bir şekilde kullanmak, daha iyi yazılımlar geliştirmeye yardımcı olur.

**Ek Başlık Önerileri:**

- Sarmalama ve Bilgi Gizleme
- Arayüzlerin Önemi
- Cohesion ve Coupling Kavramları
- API'lerin Rolü
- Sarmalama ile İlgili Pratik Örnekler

**Not:** Bu metni daha da geliştirmek için, spesifik örnekler, diyagramlar ve kod parçaları ekleyebilirsiniz. Ayrıca, farklı programlama dillerindeki arayüz uygulamalarına daha derinlemesine inebilirsiniz.

**Bu metin, sarmalama ve bilgi saklama konularını kapsamlı bir şekilde ele almaktadır. Ancak, daha spesifik konulara odaklanmak veya farklı açılardan ele almak isterseniz, lütfen belirtiniz.**

**Özellikle şu konular üzerinde daha detaylı bilgi verebilirim:**

- **Farklı programlama dillerindeki arayüz uygulamaları**
- **Sarmalama ve güvenlik**
- **Sarmalamanın tasarım desenleri ile ilişkisi**
- **Sarmalama ve test edilebilirlik**

**Hangi konuya daha fazla ilgi duyuyorsunuz?**
