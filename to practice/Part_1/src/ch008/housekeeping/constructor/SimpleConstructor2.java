package ch008.housekeeping.constructor;
class Leaf2 {
    Leaf2(int i){
        System.out.println("Leaf "+ i +" - ");
    }
}
public class SimpleConstructor2 {

    public static void main(String[] args) {
        for(int i = 0; i<8; i++)
        {
            new Leaf2(i);
        }
    }
}
