package ch009.enumerated_types.enum_with_switch;

import ch009.enumerated_types.Spiciness;

public class Taco {
    Spiciness degree;
    public Taco(Spiciness degree){
        this.degree=degree;
    }
    public void describe(){
        System.out.print("This taco brother ");
        switch (degree){
            case NOT : System.out.println("not spicy at all.");
            break;
            case PSYCHO:System.out.println("a very hot.");
            break;
            case ATTACK:System.out.println("this is a attack.");
            break;
            default:System.out.println("maybe, maybe too so hot.");
        }


    }

    public static void main(String[] args) {
        Taco
                chillyTaco= new Taco(Spiciness.ATTACK),
                whiteTaco = new Taco(Spiciness.PSYCHO),
                blackTaco = new Taco(Spiciness.NOT);


        chillyTaco.describe();
        whiteTaco.describe();
        blackTaco.describe();
    }
}
