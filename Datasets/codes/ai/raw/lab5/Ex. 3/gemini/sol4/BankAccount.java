import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class BankAccount {
    private Person holder;
    private double balance;

    public BankAccount(Person holder, double initialBalance) {
        this.holder = holder;
        this.balance = Math.max(0, initialBalance); // Ensure non-negative balance
    }

    public Person getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive (was " + amount + ").");
            return;
        }
        balance += amount;
        System.out.printf("Deposit of %.2f successful. New balance: %.2f%n", amount, balance);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive (was " + amount + ").");
            return false;
        }
        if (balance < amount) {
            System.out.printf("Error: Insufficient funds (balance: %.2f, requested: %.2f).%n", balance, amount);
            return false;
        }
        balance -= amount;
        System.out.printf("Withdrawal of %.2f successful. New balance: %.2f%n", amount, balance);
        return true;
    }

    public void displayBalance() {
        System.out.printf("Account balance for %s: %.2f%n", holder.getName(), balance);
    }

    public void transfer(BankAccount recipient, double amount) {
        if (recipient == null) {
            System.out.println("Error: Recipient account cannot be null.");
            return;
        }
        if (this.withdraw(amount)) {
            recipient.deposit(amount);
            LocalDateTime transferTime = LocalDateTime.now();
            String formattedTime = transferTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.printf("Transfer of %.2f from %s to %s at %s%n", amount, this.holder.getName(), recipient.getHolder().getName(), formattedTime);
        } else {
            System.out.printf("Transfer of %.2f failed.%n", amount);
        }
    }

    @Override
    public String toString() {
        return "BankAccount {holder=" + holder + ", balance=" + balance + "}";
    }

     @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BankAccount that = (BankAccount) obj;
        return Double.compare(that.balance, balance) == 0 &&
                Objects.equals(holder, that.holder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(holder, balance);
    }
}