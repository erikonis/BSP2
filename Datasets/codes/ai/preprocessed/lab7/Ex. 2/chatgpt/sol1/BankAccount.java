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
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(BankAccount target, double amount) {
        if (this.balance >= amount) {
            this.withdraw(amount);
            target.deposit(amount);
            System.out.println("Transferred " + amount + " to target account.");
        } else {
            System.out.println("Insufficient funds to transfer.");
        }
    }
}