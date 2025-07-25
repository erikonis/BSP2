import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount {
    private Person holder;
    private double balance;

    public BankAccount(Person holder, double balance) {
        this.holder = holder;
        this.balance = Math.max(balance, 0); // Ensure balance is at least 0
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
            System.out.println(holder.getName() + " deposited " + amount + "€. New balance: " + balance + "€.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holder.getName() + " withdrew " + amount + "€. New balance: " + balance + "€.");
            return true;
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
            return false;
        }
    }

    public void printBalance() {
        System.out.println(holder.getName() + "'s current balance: " + balance + "€.");
    }

    public void transfer(BankAccount beneficiary, double amount) {
        if (withdraw(amount)) {
            beneficiary.deposit(amount);
            String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.println("Transfer successful! " + amount + "€ transferred from " + holder.getName() +
                    " to " + beneficiary.getHolder().getName() + " on " + timeStamp + ".");
        } else {
            System.out.println("Transfer failed due to insufficient funds.");
        }
    }
}
