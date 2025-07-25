import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class BankAccount {
    private final Person holder;
    private double balance;

    public BankAccount(Person holder, double initialBalance) {
        this.holder = Objects.requireNonNull(holder, "Holder cannot be null");
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
            throw new IllegalArgumentException("Deposit amount must be positive (was " + amount + ").");
        }
        balance += amount;
        System.out.printf("Deposit of %.2f successful. New balance: %.2f%n", amount, balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive (was " + amount + ").");
        }
        if (balance < amount) {
            throw new InsufficientFundsException(balance, amount);
        }
        balance -= amount;
        System.out.printf("Withdrawal of %.2f successful. New balance: %.2f%n", amount, balance);
    }

    public void displayBalance() {
        System.out.printf("Account balance for %s: %.2f%n", holder.getName(), balance);
    }

    public void transfer(BankAccount recipient, double amount) {
        if (recipient == null) {
            throw new IllegalArgumentException("Recipient account cannot be null.");
        }
        try {
            this.withdraw(amount); // Use the improved withdraw method
            recipient.deposit(amount);
            LocalDateTime transferTime = LocalDateTime.now();
            String formattedTime = transferTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.printf("Transfer of %.2f from %s to %s at %s%n", amount, this.holder.getName(), recipient.getHolder().getName(), formattedTime);
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println("Transfer failed: " + e.getMessage()); // Catch and display
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.balance, balance) == 0 && Objects.equals(holder, that.holder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(holder, balance);
    }

    @Override
    public String toString() {
        return "BankAccount {holder=" + holder + ", balance=" + balance + "}";
    }
}

//Custom Exception
class InsufficientFundsException extends RuntimeException {
    private final double balance;
    private final double amount;

    public InsufficientFundsException(double balance, double amount) {
        super("Insufficient funds (balance: " + balance + ", requested: " + amount + ")");
        this.balance = balance;
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getAmount() {
        return amount;
    }
}
