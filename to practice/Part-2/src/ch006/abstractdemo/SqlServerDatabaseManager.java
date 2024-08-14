package ch006.abstractdemo;

public class SqlServerDatabaseManager extends DatabaseManager {
    @Override
    public void getData() {
        System.out.println("veri getirildi. SQLServer...");
    }
}
