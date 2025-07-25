package lu.uni.programming1.lab5.exercise3;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class BankAccount {
    
    private Person person;

    private double balance;

    BankAccount(Person person, double balance) {
        this.person = person;
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public Person getPerson() {
        return person;
    }
    
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        boolean success = false;

        if (balance >= amount && amount >= 0) {
            balance -= amount;
            success = true;
        } else if (balance < amount) {
            System.out.println("Your funds are insufficient for this operation!");
        }
        return success;
    }

    public void printBalance() {
        System.out.println(person.getName() + "'s balance is: " + balance);
    }

    public void transfer(BankAccount account, double amount) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();

        if (withdraw(amount)) {
            account.deposit(amount);
            System.out.println("The amount of " + amount + " was transferred from your account to " + account.getPerson().getName() + "'s account at " + dateTimeFormatter.format(localDateTime));
        }
    }
}
