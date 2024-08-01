package calculator_2;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    // Strategy Interfaces
    public interface BiOperatorStrategy {
        double apply(double a, double b);
    }

    public interface MonoOperatorStrategy {
        double apply(double a);
    }

    // BiOperator Implementations
    public static class Add implements BiOperatorStrategy {
        public double apply(double a, double b) {
            return a + b;
        }
    }

    public static class Subtract implements BiOperatorStrategy {
        public double apply(double a, double b) {
            return a - b;
        }
    }

    public static class Multiply implements BiOperatorStrategy {
        public double apply(double a, double b) {
            return a * b;
        }
    }

    public static class Divide implements BiOperatorStrategy {
        public double apply(double a, double b) {
            return a / b;
        }
    }

    public static class Power implements BiOperatorStrategy {
        public double apply(double a, double b) {
            return Math.pow(a, b);
        }
    }

    // MonoOperator Implementations
    public static class Square implements MonoOperatorStrategy {
        public double apply(double a) {
            return a * a;
        }
    }

    public static class SquareRoot implements MonoOperatorStrategy {
        public double apply(double a) {
            return Math.sqrt(a);
        }
    }

    public static class OneDividedBy implements MonoOperatorStrategy {
        public double apply(double a) {
            return 1 / a;
        }
    }

    public static class Cosine implements MonoOperatorStrategy {
        public double apply(double a) {
            return Math.cos(Math.toRadians(a));
        }
    }

    public static class Sine implements MonoOperatorStrategy {
        public double apply(double a) {
            return Math.sin(Math.toRadians(a));
        }
    }

    public static class Tangent implements MonoOperatorStrategy {
        public double apply(double a) {
            if (a % 180 == 0) {
                return 0.0;
            } else if (a % 90 == 0) {
                return Double.NaN;
            }
            return Math.tan(Math.toRadians(a));
        }
    }

    public static class Logarithm implements MonoOperatorStrategy {
        public double apply(double a) {
            return Math.log10(a);
        }
    }

    public static class Rate implements MonoOperatorStrategy {
        public double apply(double a) {
            return a / 100;
        }
    }

    public static class Absolute implements MonoOperatorStrategy {
        public double apply(double a) {
            return Math.abs(a);
        }
    }

    // Operator Maps
    private Map<BiOperatorModes, BiOperatorStrategy> biOperatorMap;
    private Map<MonoOperatorModes, MonoOperatorStrategy> monoOperatorMap;

    // Constructor
    public Calculator() {
        biOperatorMap = new HashMap<>();
        monoOperatorMap = new HashMap<>();

        // Register BiOperators
        biOperatorMap.put(BiOperatorModes.add, new Add());
        biOperatorMap.put(BiOperatorModes.minus, new Subtract());
        biOperatorMap.put(BiOperatorModes.multiply, new Multiply());
        biOperatorMap.put(BiOperatorModes.divide, new Divide());
        biOperatorMap.put(BiOperatorModes.xpowerofy, new Power());

        // Register MonoOperators
        monoOperatorMap.put(MonoOperatorModes.square, new Square());
        monoOperatorMap.put(MonoOperatorModes.squareRoot, new SquareRoot());
        monoOperatorMap.put(MonoOperatorModes.oneDividedBy, new OneDividedBy());
        monoOperatorMap.put(MonoOperatorModes.cos, new Cosine());
        monoOperatorMap.put(MonoOperatorModes.sin, new Sine());
        monoOperatorMap.put(MonoOperatorModes.tan, new Tangent());
        monoOperatorMap.put(MonoOperatorModes.log, new Logarithm());
        monoOperatorMap.put(MonoOperatorModes.rate, new Rate());
        monoOperatorMap.put(MonoOperatorModes.abs, new Absolute());
    }

    // Enum for BiOperators
    public enum BiOperatorModes {
        normal, add, minus, multiply, divide, xpowerofy
    }

    // Enum for MonoOperators
    public enum MonoOperatorModes {
        square, squareRoot, oneDividedBy, cos, sin, tan, log, rate, abs
    }

    private double num1, num2;
    private BiOperatorModes mode = BiOperatorModes.normal;

    private double calculateBiImpl() {
        return biOperatorMap.getOrDefault(mode, (a, b) -> b).apply(num1, num2);
    }

    public Double calculateBi(BiOperatorModes newMode, Double num) {
        if (mode == BiOperatorModes.normal) {
            num2 = 0.0;
            num1 = num;
            mode = newMode;
            return Double.NaN;
        } else {
            num2 = num;
            num1 = calculateBiImpl();
            mode = newMode;
            return num1;
        }
    }

    public Double calculateEqual(Double num) {
        return calculateBi(BiOperatorModes.normal, num);
    }

    public Double reset() {
        num2 = 0.0;
        num1 = 0.0;
        mode = BiOperatorModes.normal;
        return Double.NaN;
    }

    public Double calculateMono(MonoOperatorModes newMode, Double num) {
        return monoOperatorMap.getOrDefault(newMode, a -> Double.NaN).apply(num);
    }
}
