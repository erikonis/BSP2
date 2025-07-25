public class OverdraftAccount extends BankAccount {
    private double allowedOverdraft;

    public OverdraftAccount(double initialBalance, double allowedOverdraft) {
        super(initialBalance);
        this.allowedOverdraft = allowedOverdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -allowedOverdraft) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". Current balance: " + balance);
        } else {
            System.out.println("Cannot exceed overdraft limit.");
        }
    }
}