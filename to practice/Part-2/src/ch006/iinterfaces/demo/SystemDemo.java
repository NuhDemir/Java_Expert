package ch006.iinterfaces.demo;

public class SystemDemo implements ICustomer {

    ICustomer customer;

    @Override
    public void add() {
        System.out.println("Add");
        customer.add();
    }
}
