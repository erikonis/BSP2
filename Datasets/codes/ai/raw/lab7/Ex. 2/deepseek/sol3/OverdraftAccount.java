public class OverdraftAccount implements Account {
    private double balance;
    private final double allowedOverdraft;

    public OverdraftAccount(double initialBalance, double allowedOverdraft) {
        this.balance = initialBalance;
        this.allowedOverdraft = allowedOverdraft;
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
        if (amount > balance + allowedOverdraft) {
            throw new IllegalArgumentException("Exceeds overdraft limit");
        }
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public double getAllowedOverdraft() {
        return allowedOverdraft;
    }
}