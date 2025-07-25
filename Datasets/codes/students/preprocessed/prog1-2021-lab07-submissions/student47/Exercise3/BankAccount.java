public abstract class BankAccount {

    protected double balance;

    BankAccount(double balance) {

        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double d) {
        if (d > 0)
            balance += d;
        else
            System.out.println("You cannot deposit a negative amount ;/");

    }

    public abstract boolean withdraw(double amount);

    public abstract double getAllowedOverdraft();

    public abstract void printBalance();

    // public void transfer(BankAccount x, double amount) {
    // if (amount <= x.getBalance()) {
    // x.deposit(amount);
    // withdraw(amount);
    // System.out.println("The sum of " + amount + " was transferred at " +
    // LocalTime.now());
    // } else
    // System.out.println("Insufficient funds!");

    // }
}
