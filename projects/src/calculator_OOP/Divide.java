package calculator_OOP;

public class Divide implements Operated {
    @Override
    public Double getResult(Double... numbers) {
        Double div = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            div /= numbers[i];
        }
        return div;
    }
}
