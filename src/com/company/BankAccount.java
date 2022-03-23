package com.company;

public class BankAccount {
    String name;
    String iban;
    double balance;

    public BankAccount(String n, String i, double b){
        this.name = n;
        this.iban = i;
        this.balance = b;

    }
    public BankAccount(String n, String i){
        this.name = n;
        this.iban = i;
        this.balance = 0.0;


}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
