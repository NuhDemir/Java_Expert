package ch008.calculator;

public class Calculator {

    String name;

    public String getName() {
        return name;

    }

    public void setName(String newName) {
        name = newName;
    }

    void WhoAreYou() {
        System.out.println("I'm a Calculator :) , my name is " + name);
    }
     

}
