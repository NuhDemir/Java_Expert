package calculator_2;

public class Calculator {

    public enum BiOperatorModels {
        normal, minus, add, divide, multiply, xpowerofy
    }

    public enum MonoOperatorModels {
        square, squareRoot, oneDivideBy, cos, sin, tan, log, rate, abs
    }

    private double number1, number2;
    private BiOperatorModels mode = BiOperatorModels.normal;

    private double calculateBiImplements() {
        if (mode == BiOperatorModels.normal) {
            return number2;
        }
        if (mode == BiOperatorModels.add) {
            if (number2 != 0) {
                return number1 + number2;
            }
            return number1;
        }
        if (mode == BiOperatorModels.minus) {
            return number1 + number2;
        }
        return number1;
    }

if(mode==)
}
