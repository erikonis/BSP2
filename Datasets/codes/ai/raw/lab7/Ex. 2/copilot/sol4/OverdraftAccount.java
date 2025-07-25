// OverdraftAccount.java
public class OverdraftAccount extends Account {
    private double allowedOverdraft;

    public OverdraftAccount(double initialBalance, double allowedOverdraft) {
        super(initialBalance);
        this.allowedOverdraft = allowedOverdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= -allowedOverdraft) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded or invalid amount.");
        }
    }

    public double getAllowedOverdraft() {
        return allowedOverdraft;
    }
}
