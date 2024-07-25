package ch003.reuse;
class Art{
    Art(){
        System.out.println("Art Constructor.");
    }

}
class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing Constructor.");
    }
}
public class Cartoon extends Drawing {

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
