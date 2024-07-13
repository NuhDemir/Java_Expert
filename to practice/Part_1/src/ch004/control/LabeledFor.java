package ch004.control;

public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
//Can't have statements here
        for (; true; )//infinite loop
            inner://Can't have statements here
                    for (; i < 10; i++) {
                        System.out.println("i = " + i);
                        if (i == 2) {
                            System.out.println("Continue");
                            continue;
                        }
                        if (i == 3) {
                            System.out.println("break");
                            i++;//Otherwise i never
                            //gets incremented.
                            break;
                        }
                        if (i == 4) {
                            System.out.println("continue outer");
                            i++;//otherwise i never
                            //gets incremented.
                            continue outer;
                        }

                        if (i == 8) {
                            System.out.println("break outer");
                            break outer;
                        }

                        for (int k = 0; k < 5; k++) {
                            if (k == 4)
                                System.out.println("continue inner");
                            continue inner;
                        }
                    }
    }
}
