package ch005.polymorphism.logDemo;

import ch006.this_method.bankSystem.Customer;

public class CustomerManager {
    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void Add() {
        System.out.println("Müşteri eklendi");
        this.baseLogger.Log("log message");
    }
}
