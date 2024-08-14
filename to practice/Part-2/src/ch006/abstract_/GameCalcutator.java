package ch006.abstract_;

public abstract class GameCalcutator {

    public abstract double calculate(double point);

    public final void gameOver() {
        System.out.println("Game Over...");
    }
}
