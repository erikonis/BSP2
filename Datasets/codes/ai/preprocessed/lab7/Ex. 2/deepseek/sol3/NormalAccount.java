public class NormalAccount implements Account {
    private double balance;

    public NormalAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void accept(AccountVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}