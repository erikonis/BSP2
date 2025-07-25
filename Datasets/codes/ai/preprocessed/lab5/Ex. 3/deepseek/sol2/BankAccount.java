import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount {
    private Person holder;
    private double balance;

    public BankAccount(Person holder, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.holder = holder;
        this.balance = balance;
    }

    public Person getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (isValidAmount(amount)) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (isValidAmount(amount) && hasSufficientFunds(amount)) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
            return false;
        }
    }

    public void printBalance() {
        System.out.println("Current balance for " + holder.getName() + ": " + balance);
    }

    public void transfer(BankAccount beneficiary, double amount) {
        if (withdraw(amount)) {
            beneficiary.deposit(amount);
            logTransfer(beneficiary, amount);
        } else {
            System.out.println("Transfer failed.");
        }
    }

    private boolean isValidAmount(double amount) {
        return amount > 0;
    }

    private boolean hasSufficientFunds(double amount) {
        return balance >= amount;
    }

    private void logTransfer(BankAccount beneficiary, double amount) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Transfer successful: " + amount + " transferred to " + beneficiary.getHolder().getName() +
                " at " + now.format(formatter));
    }
}