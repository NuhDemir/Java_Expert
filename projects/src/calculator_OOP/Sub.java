package calculator_OOP;

public class Sub  implements Operated{
    @Override
    public Double getResult(Double... numbers) {
        Double sub = numbers[0];

        for (int i = 1; i<numbers.length;i++){
                  sub +=numbers[i];
        }
        return sub;
    }
}
