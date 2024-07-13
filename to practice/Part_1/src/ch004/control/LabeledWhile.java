package ch004.control;

public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while (true) {
            System.out.println("Outer while loop");
            while (true) {
                i++;
                System.out.println("i = " + i);
                if (i == 1)
                {
                    System.out.println("continue");
                    continue ;
                }
                if (i==3)
                {
                    System.out.println("continue outer");
                    continue outer;
                }
                if (i == 5)
                {
                    System.out.println("break");
                }
                if (i==7)
                {
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
    }
}
/*
Continue:
* 1. Düz bie contıue en içteki dongunun en ustune gider ve devam eder
2.Etiketli bir contınue etikete gider ve bu etiketten hemen sonra donguye yeniden girer.
3.Bir kesme döngünün "altından çıkar".
4.Etiketli bir kesme,etiket tarafından belirtilen döngünün sonunun altından düşer.

*
*
* */