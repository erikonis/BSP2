import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount {
    private Person holder;
    private double balance;

    public BankAccount(Person holder, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.holder = holder;
        this.balance = initialBalance;
    }

    public Person getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
            return false;
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        }
        System.out.println("Insufficient funds for withdrawal");
        return false;
    }

    public void printBalance() {
        System.out.printf("Account balance for %s: %.2f%n", holder.getName(), balance);
    }

    public void transfer(BankAccount recipient, double amount) {
        if (this.withdraw(amount)) {
            recipient.deposit(amount);
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.printf("Transferred %.2f from %s to %s at %s%n",
                amount, this.holder.getName(), recipient.holder.getName(), time);
        }
    }
}