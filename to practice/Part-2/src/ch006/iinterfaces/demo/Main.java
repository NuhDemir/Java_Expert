package ch006.iinterfaces.demo;

public class Main {
    public static void main(String[] args) {
SystemDemo systemDemo = new SystemDemo();
systemDemo.customer = new OracleCustomerDal();
systemDemo.add();
    }
}
