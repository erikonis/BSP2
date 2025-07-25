public abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        if (!canWithdraw(amount)) {
            throw new IllegalArgumentException(withdrawalErrorMessage());
        }
        balance -= amount;
    }

    protected abstract boolean canWithdraw(double amount);
    protected abstract String withdrawalErrorMessage();

    public double getBalance() {
        return balance;
    }
}

