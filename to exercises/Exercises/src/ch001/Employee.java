package ch001;

import java.security.PublicKey;

public class Employee {
    private String fullName;
    private Double salary;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee()
    {

    }


    public Employee(String fullName,Double salary)
    {
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getFullName() +" " +getSalary();
    }
}
