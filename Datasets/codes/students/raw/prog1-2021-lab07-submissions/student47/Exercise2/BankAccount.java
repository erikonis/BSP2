package Exercise2;

public abstract class BankAccount {
    private Person holder;
    protected double balance;

    BankAccount(Person holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public Person getHolder() {
        return holder;
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
