package ch005;

public class UnreachableCode {
    public static void main(String[] args) {
        // Ulaşılabilir kod
        int a = 8;
        int k;
        if (a < 11)
            k = 7;
        else
            k = 9;

        System.out.println(k); // Bu kod çalışır çünkü k değişkeni her durumda bir değer alır.

        // Sonsuz döngü, bir noktada break ile sonlanırsa bu kod çalışır.
        while (true) {
            System.out.println("Hello :)");
            if (k > 3)
                break; // break ifadesi döngüyü sonlandırır.
        }

        // Bu kod unreachable olurdu eğer döngü sonsuz olsaydı ve break olmasaydı.
        int ii = 5;

        int i = 5;

        // Ulaşılmaz kod
    //    while (false) // Bu döngü asla çalışmaz.
      //      System.out.println("Selam :)");

        //int r = 5;

        if (false) {
            // Bu blok asla çalışmaz.
            System.out.println("SLE");
        }

      //  for (int m = 0; false; m++) {
            // Bu döngü asla çalışmaz.
//            System.out.println(m);
//            break;
        }

        // Bu kod unreachable olurdu eğer döngü sonsuz olsaydı ve break olmasaydı.
//        System.out.println("Break!");

//        for (;;) {
//            System.out.println("Selam");
//            break;
//            System.out.println("Bir selam daha."); // break ile unreachable olur
//        }

//        for (;;) {
//            System.out.println("Selam");
//            if (true)
//                break;
//            System.out.println("Bir selam daha.");   // break ile çalışmaz, dead code değil unreachable code
//        }

//        try {
//
//        } catch (IOException e) { // Unreachable code. Try to catch Exception
//            // or RuntimeException and see what happens
//
//        }

        // return sonrası kod unreachable olur.
//        return;
//        System.out.println("Son after return"); // Unreachable code!
    }

  //  public int f() {
   //     if (false) {
  //          System.out.println("In if");
    //        return 8;
      //  } else {
        //    System.out.println("in Else");
          //  return 0;
       // }
        // return sonrası kod unreachable olur.
        // System.out.println("Son"); // Unreachable code!
//    }
//}
//}
