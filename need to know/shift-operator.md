## Java'da Kaydırma Operatörleri (Shift Operators)

Java'da iki tür kaydırma operatörü bulunur:

**1. Sola Kaydırma (<<):**

* Bir sayıyı belirtilen sayıda bit sola kaydırır.
* En soldaki bitler kaybolur ve yerine sıfırlar eklenir.
* Sayıyı 2 ile çarpmaya (baz istenilen kaydırma miktarına kadar) benzetilebilir.

**Örnek:**

```java
int sayi = 10; // İkili gösterimi: 1010
int sonuc = sayi << 2; // 101000

System.out.println(sonuc); // 40 (ikili gösterimi: 101000)
```

**2. Sağa Kaydırma (>>):**

* Bir sayıyı belirtilen sayıda bit sağa kaydırır.
* En sağdaki bitler kaybolur.
* Tamsayı türünde, kaybolan bitler sıfırlarla doldurulur.
* Kayan nokta türünde, kaybolan bitler işaret bitine göre belirlenir (pozitif ise sıfırlarla, negatif ise 1'lerle doldurulur).
* Sayıyı 2 ile bölmeye (baz istenilen kaydırma miktarına kadar) benzetilebilir.

**Örnek:**

```java
int sayi = 40; // İkili gösterimi: 101000
int sonuc = sayi >> 2; // 1010

System.out.println(sonuc); // 10 (ikili gösterimi: 1010)
```

**Dikkat Edilmesi Gerekenler:**

* Kaydırma operatörleri, bitsel işlemler için kullanılır ve aritmetik işlemlerden farklıdır.
* Kaydırma miktarı negatif olamaz.
* Kaydırma işlemi, sayının veri türünü değiştirebilir.

**Kullanım Alanları:**

* Bitsel işlemler
* Veri sıkıştırma ve açma
* Veri gizleme
* Grafik programlama
* Donanım ile etkileşim

## Kaynaklar:

* [https://codegym.cc/quests/lectures](https://codegym.cc/quests/lectures)
* [https://m.youtube.com/watch?v=IxKL4W3hpAA](https://m.youtube.com/watch?v=IxKL4W3hpAA)
* [https://emrecelen.com.tr/java/](https://emrecelen.com.tr/java/)

