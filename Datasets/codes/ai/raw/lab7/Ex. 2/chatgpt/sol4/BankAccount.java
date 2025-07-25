public class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Not enough balance.");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
