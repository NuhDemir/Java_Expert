package ch006.abstractdemo;

public class MySqlServerDatabaseManager extends DatabaseManager {
    @Override
    public void getData() {
        System.out.println("veri getirildi. MySQLServer...");
    }
}
