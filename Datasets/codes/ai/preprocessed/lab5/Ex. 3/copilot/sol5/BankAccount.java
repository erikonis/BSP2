import java.time.LocalDateTime;

public class BankAccount {
    private Person holder;
    private double balance;

    // Constructor to initialize holder and balance
    public BankAccount(Person holder, double balance) {
        this.holder = holder;
        this.balance = Math.max(balance, 0); // Ensure balance is at least 0
    }

    // Getter methods for holder and balance
    public Person getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                return true;
            } else {
                System.out.println("Insufficient funds.");
                return false;
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
    }

    // Method to print the current balance
    public void printBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Method to transfer money to another account
    public void transfer(BankAccount beneficiary, double amount) {
        if (withdraw(amount)) {
            beneficiary.deposit(amount);
            System.out.println("Transferred " + amount + " to " + beneficiary.getHolder().getName() + " on " + LocalDateTime.now());
        }
    }
}