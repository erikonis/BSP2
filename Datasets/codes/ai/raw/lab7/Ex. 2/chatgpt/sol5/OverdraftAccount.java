public class OverdraftAccount extends BankAccount {
    private final double allowedOverdraft;

    public OverdraftAccount(double initialBalance, double allowedOverdraft) {
        super(initialBalance);
        this.allowedOverdraft = Math.abs(allowedOverdraft); // Always positive
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
            return false;
        }

        if (balance - amount < -allowedOverdraft) {
            System.out.println("Withdrawal denied. Overdraft limit exceeded.");
            return false;
        }

        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "OverdraftAccount | Balance: €" + balance + " | Overdraft allowed: €" + allowedOverdraft;
    }
}
