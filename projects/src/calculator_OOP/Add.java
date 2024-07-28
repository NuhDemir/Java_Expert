package calculator_OOP;

public class Add implements Operated{

    @Override
   public Double getResult(Double... numbers) {
        Double sum = 0.0;

        for (Double num:  numbers) {
            sum+=num;
        }
        return sum;
    }
}
