import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount {
    private Person holder;
    private double balance;

    // Constructor to initialize holder and balance
    public BankAccount(Person holder, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.holder = holder;
        this.balance = balance;
    }

    // Getter for holder
    public Person getHolder() {
        return holder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }

    // Method to withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
            return false;
        }
    }

    // Method to print balance
    public void printBalance() {
        System.out.println("Current balance for " + holder.getName() + ": " + balance);
    }

    // Method to transfer money to another account
    public void transfer(BankAccount beneficiary, double amount) {
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
}