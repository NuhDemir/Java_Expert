package ch002;

public class Blocks {
    static long l;
    {

    }

    //Declaration block
    {
        int j;
    }

    //Definition block
    {
        // b = true;
        l = 0L;
    }

    //Inıtıalization block
    {
        int i = 33;
    }

    //Method block
    public static void main(String[] args) {
        Blocks block = new Blocks();
        System.out.println(l);

        {
            int t = 14;
            System.out.println(t);
        }
        block.f();
    }
        //inner class block
        class InnerClass {
        }

        // Method block
        public void f(){
            // Local class block
            new Blocks(){
                public void sop() {
                    System.out.println(l);
                }
            };
        }

    }

