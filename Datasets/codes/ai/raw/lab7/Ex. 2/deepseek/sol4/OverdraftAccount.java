public class OverdraftAccount extends BankAccount {
    private final double allowedOverdraft;

    public OverdraftAccount(double initialBalance, double allowedOverdraft) {
        super(initialBalance);
        this.allowedOverdraft = allowedOverdraft;
    }

    @Override
    protected boolean canWithdraw(double amount) {
        return amount <= balance + allowedOverdraft;
    }

    @Override
    protected String withdrawalErrorMessage() {
        return "Exceeds overdraft limit";
    }

    public double getAllowedOverdraft() {
        return allowedOverdraft;
    }
}