public class OverdraftAccount extends BankAccount {
    private double allowedOverdraft;

    public OverdraftAccount(double balance, double allowedOverdraft) {
        super(balance);
        this.allowedOverdraft = allowedOverdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -allowedOverdraft) {
            balance -= amount;
        } else {
            System.out.println("Cannot exceed overdraft limit.");
        }
    }
}