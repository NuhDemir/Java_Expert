package ch006.HouseKeeping;
class Rock2 {
    Rock2(int i){
        System.out.print("Rock: " +i + "-");
    }
}
public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i<8; i++)
            new Rock2(i);
    }
}
