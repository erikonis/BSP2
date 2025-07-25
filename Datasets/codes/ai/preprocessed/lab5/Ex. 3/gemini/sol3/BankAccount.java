import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount {
    private Person accountHolder;
    private double accountBalance;

    public BankAccount(Person holder, double balance) {
        this.accountHolder = holder;
        this.accountBalance = Math.max(0, balance);
    }

    public Person getHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit of " + amount + " successful. New balance: " + accountBalance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
            return false;
        }
        if (accountBalance >= amount) {
            accountBalance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + accountBalance);
            return true;
        } else {
            System.out.println("Error: Insufficient funds for withdrawal of " + amount + ".");
            return false;
        }
    }

    public void displayBalance() {
        System.out.println("Account balance for " + accountHolder.getName() + ": " + accountBalance);
    }

    public void transfer(BankAccount recipient, double amount) {
        if (this.withdraw(amount)) {
            recipient.deposit(amount);
            LocalDateTime transferTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            System.out.println(amount + " transferred from " + this.accountHolder.getName() + "'s account to " + recipient.getHolder().getName() + "'s account at " + formatter.format(transferTime));
        } else {
            System.out.println("Transfer of " + amount + " failed.");
        }
    }

     @Override
    public String toString() {
        return "BankAccount{" +
                "holder=" + accountHolder +
                ", balance=" + accountBalance +
                '}';
    }
}