import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount {
    private Person holder;
    private double balance;

    public BankAccount(Person holder, double balance) {
        this.holder = holder;
        this.balance = Math.max(0, balance); // Ensure balance isn't negative
    }

    public Person getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited €" + amount + " to " + holder.getName());
        } else {
            System.out.println("Deposit must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be positive.");
            return false;
        }
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew €" + amount + " from " + holder.getName());
            return true;
        } else {
            System.out.println("Insufficient funds for " + holder.getName());
            return false;
        }
    }

    public void printBalance() {
        System.out.printf("%s's Balance: €%.2f%n", holder.getName(), balance);
    }

    public void transfer(BankAccount receiver, double amount) {
        if (withdraw(amount)) {
            receiver.deposit(amount);
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.printf("Transferred €%.2f from %s to %s at %s%n",
                amount, holder.getName(), receiver.getHolder().getName(), time);
        } else {
            System.out.println("Transfer failed.");
        }
    }
}