package calculator_OOP;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Calculator {

    public static void main(String[] args){
        final String inputExport = ReadInput.read();

        Queue<String> operations;
        Queue<String> numbers;

        String[] numbersArr = inputExport.split("[-+*/%]");
//        String[] operArr = inputExp.split("[0-9]+");
        String[] operatorArr = inputExport.split("\\d+");
        numbers = new LinkedList<>(Arrays.asList(numbersArr));
        operations = new LinkedList<>(Arrays.asList(operatorArr));

        Double res = Double.parseDouble(Objects.requireNonNull(numbers.poll()));

        while(!numbers.isEmpty()){
            String operator = operations.poll();

            Operated operate;
            switch(Objects.requireNonNull(operator)){
                case "+":
                    operate = new Add();
                    break;
                case "-":
                    operate = new Sub();
                    break;
                case "*":
                    operate = new Multiply();
                    break;
                case "/":
                    operate = new Divide();
                    break;
                case "%":
                    operate = new Mod();
                    break;
                default:
                    continue;
            }
            Double num = Double.parseDouble(Objects.requireNonNull(numbers.poll()));
            res = operate.getResult(res, num);
        }

        System.out.println(res);
    }
}