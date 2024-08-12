package ch006.iinterfaces.interfacesdemo;

import java.util.Scanner;

public class Worker implements IWorkable, IAdvancedWorkable, IEatable, IPayable {
    private String name;
    private String position;
    private double amount;

    public Worker(String name, String position) {
        this.name = name;
        this.position = position;

    }

    @Override
    public void work() {
        System.out.println(name + " is working as a " + position + ".");
    }

    @Override
    public void manage() {
        System.out.println(name + " is managing tasks.");
    }

    @Override
    public void report() {
        System.out.println(name + " is preparing reports.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void eat(String name) {
        this.name = name;
        System.out.println(name + " is eating a meal.");
    }

    @Override
    public void pay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to pay: ");
        double amount = scanner.nextDouble(); // Değişken türü double olarak okundu
        this.amount = amount * 30;
        System.out.println("Amount paid to " + name + ": " + this.amount + " TL");
    }
}
