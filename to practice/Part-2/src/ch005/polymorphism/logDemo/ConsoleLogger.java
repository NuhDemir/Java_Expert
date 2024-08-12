package ch005.polymorphism.logDemo;

public class ConsoleLogger extends BaseLogger {
    @Override
    public void Log(String message) {
        System.out.println("Logged to Console: " + message);
    }
}
