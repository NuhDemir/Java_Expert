package ch005.polymorphism.logDemo;

public class DatabaseLogger extends BaseLogger{
    @Override
    public void Log(String message) {
        System.out.println("Logged to database: "+message);
    }
}
