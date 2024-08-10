package ch006.this_method.bankSystem;

public class Customer {

    int id;
    String firstName;
    String lastName;

    CreditCard creditCard;

    public Customer(int id,String firstName,String lastName ){
this.id = id;
this.firstName=firstName;
this.lastName=lastName;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
}
