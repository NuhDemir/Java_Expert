package calculator_OOP;

public class Multiply  implements Operated{
    @Override
    public Double getResult(Double... numbers) {
        Double multiply =1.0;
        for (Double num:numbers){
            multiply*=num;
        }
        return multiply;
    }
}
