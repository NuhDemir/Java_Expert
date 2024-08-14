package ch006.iinterfaces.demo;

public class MySqlCustomerDal implements ICustomer {
    @Override
    public void add() {
        System.out.println("MySql eklendi...");
    }
}
