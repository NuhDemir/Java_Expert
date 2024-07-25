package ch003.reuse;

class Cleaner {
    private String s = "Cleaner";
    public void append(String a){s+=a;}
public void dilute(){append("dilute()");}
public void apply(){append("apply()");}
public void add(int a,int b){
    int total = a+b;}
public void scrub(){append("scrub()");}

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner();
        cleaner.dilute();
        cleaner.apply();
        cleaner.scrub();
        cleaner.add(1,2);
        System.out.println(cleaner);
    }
}

public class Detergent extends Cleaner {

    @Override
    public void scrub() {
        append("Detergent.scrub()");
super.scrub();    }


    private void foam(){
        append("foam()");
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        detergent.add(3,5);
System.out.println(detergent+"\n");
    System.out.println("testing base class: \n");
    Cleaner.main(args);}
}



