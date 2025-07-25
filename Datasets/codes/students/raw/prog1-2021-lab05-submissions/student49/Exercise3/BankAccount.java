package Exercise3;

import java.time.LocalTime;

public class BankAccount {
    private Person holder;
    private double balance;

    BankAccount(Person holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public Person getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double d) {
        if (d > 0)
            balance += d;
        else
            System.out.println("You cannot deposit a negative amount ;/");

    }

    public boolean withdraw(double w) {
        if (w > 0)
            if (balance >= w) {
                balance -= w;
                return true;
            } else {
                System.out.println("Insufficient funds!");
                return false;
            }
        else {
            System.out.println("You cannot withdraw a negative amount ;/");
            return false;
        }

    }

    public void printBalance() {
        System.out.println("The current balance of " + getHolder().getName() + " is:" + balance);
    }

    public void transfer(BankAccount x, double amount) {
        if (amount <= x.getBalance()) {
            x.deposit(amount);
            withdraw(amount);
            System.out.println("The sum of " + amount + " was transferred at " + LocalTime.now());
        } else
            System.out.println("Insufficient funds!");

    }
}
