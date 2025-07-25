import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount {
    private Person holder;
    private double balance;

    public BankAccount(Person holder, double initialBalance) {
        this.holder = holder;
        this.balance = Math.max(0, initialBalance); // Ensures non-negative balance
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
            System.out.printf("%s deposited €%.2f%n", holder.getName(), amount);
        } else {
            System.out.println("Deposit must be a positive value.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be positive.");
            return false;
        }

        if (amount <= balance) {
            balance -= amount;
            System.out.printf("%s withdrew €%.2f%n", holder.getName(), amount);
            return true;
        } else {
            System.out.printf("Insufficient funds for %s. Withdrawal failed.%n", holder.getName());
            return false;
        }
    }

    public void printBalance() {
        System.out.printf("%s's current balance: €%.2f%n", holder.getName(), balance);
    }

    public void transfer(BankAccount targetAccount, double amount) {
        if (withdraw(amount)) {
            targetAccount.deposit(amount);
            String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.printf("Transferred €%.2f from %s to %s at %s%n",
                    amount, holder.getName(), targetAccount.getHolder().getName(), timeStamp);
        } else {
            System.out.println("Transfer failed due to insufficient funds.");
        }
    }
}
