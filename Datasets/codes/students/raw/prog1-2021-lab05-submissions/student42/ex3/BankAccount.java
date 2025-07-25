package lu.uni.programming1.lab5.ex3;

import java.util.Date;

public class BankAccount {
    private Person holder;
    private double balance = 0.0;

    public BankAccount(Person holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public Person getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Please enter positive amount!");
        } else {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Please enter positive amount!");
            return false;
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println(" Operation is successfull!");
            return true;
        } else {
            System.out.println("You don't have sufficient money!");
            System.out.println("Operation is failed!");
            return false;
        }

    }

    public void printBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    public void transfer(BankAccount b1, double amount) {
        if (balance > amount) {
            this.withdraw(amount);
            b1.deposit(amount);
            Date trfDate = new Date();
            System.err.println(amount + " transferred on " + trfDate);
        } else {
            System.out.println(" Not enough balance!");
        }

    }
}