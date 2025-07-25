public package exercise3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount {
    private static Person holder;
    private static double balance;

    public BankAccount(Person holder, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        BankAccount.holder = holder;
        BankAccount.balance = balance;
    }

    public static Person getHolder() {
        return holder;
    }

    public static double getBalance() {
        return balance;
    }

    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }

    public static boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
            return false;
        }
    }

    public static void printBalance() {
        System.out.println("Current balance for " + holder.getName() + ": " + balance);
    }

    public static void transfer(BankAccount beneficiary, double amount) {
        if (withdraw(amount)) {
            beneficiary.deposit(amount);
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            System.out.println("Transfer successful: " + amount + " transferred to " + beneficiary.getHolder().getName() +
                    " at " + now.format(formatter));
        } else {
            System.out.println("Transfer failed.");
        }
    }
} {
    
}
