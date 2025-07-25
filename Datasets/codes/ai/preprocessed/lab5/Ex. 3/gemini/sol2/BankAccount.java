import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount {
    private Person holder;
    private double balance;

    public BankAccount(Person holder, double balance) {
        this.holder = holder;
        this.balance = Math.max(0, balance); // Balance must be at least 0
    }

    public Person getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("Withdrew " + amount + ". New balance: " + balance);
                return true;
            } else {
                System.out.println("Error: Insufficient funds.");
                return false;
            }
        } else {
            System.out.println("Error: Withdrawal amount must be positive.");
            return false;
        }
    }

    public void printBalance() {
        System.out.println("Current balance for " + holder.getName() + ": " + balance);
    }

    public void transfer(BankAccount beneficiary, double amount) {
        if (this.withdraw(amount)) { // Withdraw from the current account
            beneficiary.deposit(amount); // Deposit into the beneficiary's account
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            System.out.println("Transferred " + amount + " from " + this.holder.getName() + " to " + beneficiary.getHolder().getName() + " at " + formatter.format(now));
        } else {
            System.out.println("Transfer failed.");
        }
    }
}