package ch003.primitives.characters;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.*;

public class EnvironmentInfo {

    public static void main(String[] args) throws IOException {
        // InputStreamReader sınıfı, karakter kodlaması hakkında bilgi almak için kullanılır.
        InputStreamReader isr = new InputStreamReader(System.in);
        System.out.println("Encoding (Karakter Kodlaması): \t\t" + isr.getEncoding());

        // Locale sınıfı, sistemin varsayılan yerel ayar bilgilerini almak için kullanılır.
        Locale locale = Locale.getDefault();
        System.out.println("Country (Ülke): \t\t" + locale.getCountry());
        System.out.println("Display language (Görüntülenen Dil): \t" + locale.getDisplayLanguage());
        System.out.println("Language (Dil): \t\t" + locale.getLanguage());
        System.out.println("Display name (Görüntülenen Ad): \t\t" + locale.getDisplayName());
        System.out.println("ISO3 Language (ISO3 Dil Kodu):  \t" + locale.getISO3Language());

        // Sistemde mevcut tüm karakter setlerini listeleyen metodu çağırma.
        listCharSets();
    }

    /**
     * Sistemde mevcut tüm karakter setlerini listeleyen metod.
     */
    public static void listCharSets() {
        // Charset.availableCharsets() metodu, tüm mevcut karakter setlerini alır ve bir SortedMap döndürür.
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        // Karakter setlerinin isimlerini içeren anahtar seti alınır.
        Set<String> names = charsets.keySet();
        // Her bir karakter seti için döngü
        for (String name : names) {
            // Karakter seti adı kullanılarak Charset nesnesi alınır.
            Charset charset = charsets.get(name);
            // Karakter seti adı yazdırılır.
            System.out.println("Charset (Karakter Seti): " + charset);
            // Karakter setine ait takma adlar alınır.
            Set<String> aliases = charset.aliases();
            // Her bir takma ad için döngü
            for (String alias : aliases) {
                // Takma ad yazdırılır.
                System.out.println("    Alias (Takma Ad): " + alias);
            }
        }
    }
}
