package ch007;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName,String lastName,String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String name){
        this.firstName= firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "first name: " +firstName +"\nlastname: " +lastName +" phone number: "+phoneNumber;

    }
}
