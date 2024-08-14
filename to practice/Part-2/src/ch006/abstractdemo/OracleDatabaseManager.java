package ch006.abstractdemo;

public class OracleDatabaseManager extends DatabaseManager {
    @Override
    public void getData() {
        System.out.println("veri getirildi. Oracle...");
    }
}
