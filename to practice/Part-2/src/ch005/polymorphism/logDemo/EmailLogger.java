package ch005.polymorphism.logDemo;

public class EmailLogger extends BaseLogger {

    @Override
    public void Log(String message) {
        System.out.println("Email logger: " + message);
    }
}
