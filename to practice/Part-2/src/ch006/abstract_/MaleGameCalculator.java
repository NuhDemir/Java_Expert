package ch006.abstract_;

public class MaleGameCalculator extends GameCalcutator {
    @Override
    public double calculate(double point) {
        return 200 * point;
    }
}
