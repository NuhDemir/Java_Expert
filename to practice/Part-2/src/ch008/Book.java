package ch008;

// Kitap sınıfını tanımlıyoruz
public class Book {
    // Özel (private) alanlar
    private String title;     // Kitap adı
    private String author;    // Yazar adı
    private int publicationYear; // Yayın yılı

    // Parametresiz yapıcı (constructor)
    public Book() {
        this.title = "Bilinmiyor";
        this.author = "Bilinmiyor";
        this.publicationYear = 0;
    }

    // Parametreli yapıcı
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getter ve Setter metodları

    // Kitap adı için getter
    public String getTitle() {
        return title;
    }

    // Kitap adı için setter
    public void setTitle(String title) {
        this.title = title;
    }

    // Yazar adı için getter
    public String getAuthor() {
        return author;
    }

    // Yazar adı için setter
    public void setAuthor(String author) {
        this.author = author;
    }

    // Yayın yılı için getter
    public int getPublicationYear() {
        return publicationYear;
    }

    // Yayın yılı için setter
    public void setPublicationYear(int publicationYear) {
        if (publicationYear > 1450 && publicationYear <= 2024) { // Geçerli bir yıl kontrolü
            this.publicationYear = publicationYear;
        } else {
            System.out.println("Geçersiz yıl! 1450 ile 2024 arasında bir değer giriniz.");
        }
    }

    // Kitap bilgilerini yazdıran bir metod
    public void printBookDetails() {
        System.out.println("Kitap Adı: " + getTitle());
        System.out.println("Yazar: " + getAuthor());
        System.out.println("Yayın Yılı: " + getPublicationYear());
    }
}

// Ana sınıf (main metodu içeren sınıf)
 class LibrarySystem {
    public static void main(String[] args) {
        // Parametresiz yapıcı ile bir kitap oluşturuyoruz
        Book book1 = new Book();
        book1.printBookDetails();

        // Parametreli yapıcı ile başka bir kitap oluşturuyoruz
        Book book2 = new Book("1984", "George Orwell", 1949);
        book2.printBookDetails();

        // Getter ve Setter'ları kullanarak bilgileri değiştirme
        book1.setTitle("Suç ve Ceza");
        book1.setAuthor("Fyodor Dostoyevski");
        book1.setPublicationYear(1866);

        System.out.println("\nGüncellenmiş Kitap Bilgileri:");
        book1.printBookDetails();

        // Geçersiz bir yıl ayarlama denemesi
        book1.setPublicationYear(3000); // Bu işlem geçersiz olacak
    }
}
