public class OverdraftAccount extends BankAccount {
    private double allowedOverdraft;
    private double monthlyFee;

    public OverdraftAccount(double balance, double allowedOverdraft, double monthlyFee) {
        super(balance);
        this.allowedOverdraft = allowedOverdraft;
        this.monthlyFee = monthlyFee;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -allowedOverdraft) {
            balance -= amount;
        } else {
            System.out.println("Cannot exceed overdraft limit.");
        }
    }

    public void applyMonthlyFee() {
        balance -= monthlyFee;
        System.out.println("Monthly fee applied: " + monthlyFee);
    }
}