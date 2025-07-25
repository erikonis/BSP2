// OverdraftAccount.java
public class OverdraftAccount extends BankAccount {
    private double allowedOverdraft;

    public OverdraftAccount(double initialBalance, double allowedOverdraft) {
        super(initialBalance);
        this.allowedOverdraft = allowedOverdraft;
    }

    public double getAllowedOverdraft() {
        return allowedOverdraft;
    }

    public void setAllowedOverdraft(double allowedOverdraft) {
        this.allowedOverdraft = allowedOverdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -allowedOverdraft) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Cannot exceed allowed overdraft of " + allowedOverdraft + ".");
        }
    }
}