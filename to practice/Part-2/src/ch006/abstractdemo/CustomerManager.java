package ch006.abstractdemo;

import ch005.polymorphism.overriding_.BaseCreditManager;

public class CustomerManager {

    DatabaseManager databaseManager;

    public void getCustomers(){
    databaseManager.getData();
    }
}
