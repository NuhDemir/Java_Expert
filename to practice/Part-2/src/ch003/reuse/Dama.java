package ch003.reuse;
class Game {
    Game(int i){
        System.out.println("Game Constructor.");
    }
}
class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame Constructor.");
    }
}
public class Dama extends BoardGame {
    Dama(){
        super(22);
        System.out.println("Dama Constructor.");
    }

    public static void main(String[] args) {
        Dama dama = new Dama();

    }
}
