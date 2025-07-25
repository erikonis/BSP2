public class OverdraftAccount extends BankAccount {
    private final double allowedOverdraft;

    public OverdraftAccount(double initialBalance, double allowedOverdraft) {
        super(initialBalance);
        this.allowedOverdraft = allowedOverdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + allowedOverdraft) {
            throw new IllegalArgumentException("Exceeds overdraft limit");
        }
        balance -= amount;
    }

    public double getAllowedOverdraft() {
        return allowedOverdraft;
    }
}