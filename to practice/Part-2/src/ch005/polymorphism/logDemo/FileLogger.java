package ch005.polymorphism.logDemo;

public class FileLogger extends BaseLogger {
    @Override
    public void Log(String message) {
        System.out.println("File logger: " + message);
    }
}
