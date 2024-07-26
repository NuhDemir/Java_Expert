package ch004.the_final.blank_final;

/*Blank Final:
 * başlatma değerleri olmayan final alanlarıdır.
 * Derleyici, boş final alanlarının kullanılmadan önce ilklendirmesini sağlar.
 * bu tür finallere tanımlama(atama) işlemi->
 * 1- ya bir kurucuda
 * 2- alanın tanımladığı noktada
 *
 * */
class Poppet {
    private int i;

    Poppet(int ii) {
        i = ii;
    }
}

public class BlankFinal {

    private final int i = 0; //Initialized final
    private final int j;//Blank final
    private final Poppet p;//Blank final reference

    public BlankFinal() {
        j = 2;
        p = new Poppet(1);
    }

    public BlankFinal(int x) {
        j = x;//Initialize blank final
        p = new Poppet(x);//Init blank final reference
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(33);
    }

}
