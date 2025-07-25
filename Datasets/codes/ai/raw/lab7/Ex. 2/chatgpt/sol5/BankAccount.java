public class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = Math.max(initialBalance, 0); // Prevent negative initial balance
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        }

        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "BankAccount | Balance: €" + balance;
    }
}
