package calculator_OOP;

public class Mod implements Operated{
    @Override
    public Double getResult(Double... numbers) {
        Double mod =numbers[0];
        for (int i=1;i<numbers.length;i++){
            mod%=numbers[i];
        }
        return mod;
    }
}