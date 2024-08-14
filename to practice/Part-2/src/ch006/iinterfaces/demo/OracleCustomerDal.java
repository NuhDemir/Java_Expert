package ch006.iinterfaces.demo;

public class OracleCustomerDal implements ICustomer {
    @Override
    public void add() {
        System.out.println("Oracle eklendi...");
    }
}
