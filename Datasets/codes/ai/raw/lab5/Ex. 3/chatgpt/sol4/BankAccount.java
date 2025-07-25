import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount {
    private Person holder;
    private double balance;

    public BankAccount(Person holder, double balance) {
        this.holder = holder;
        this.balance = Math.max(0, balance);  // Ensure non-negative balance
    }

    // Getters
    public Person getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holder.getName() + " deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }

        if (amount <= balance) {
            balance -= amount;
            System.out.println(holder.getName() + " withdrew: " + amount);
            return true;
        } else {
            System.out.println("Insufficient funds for " + holder.getName());
            return false;
        }
    }

    // Print balance
    public void printBalance() {
        System.out.printf("Balance for %s: €%.2f\n", holder.getName(), balance);
    }

    // Transfer
    public void transfer(BankAccount receiver, double amount) {
        if (withdraw(amount)) {
            receiver.deposit(amount);

            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.printf("Transferred €%.2f from %s to %s on %s\n",
                    amount, holder.getName(), receiver.getHolder().getName(), timestamp);
        } else {
            System.out.println("Transfer failed due to insufficient funds.");
        }
    }
}
