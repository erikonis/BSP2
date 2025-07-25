public class NormalAccount extends BankAccount {
    public NormalAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    protected boolean canWithdraw(double amount) {
        return amount <= balance;
    }

    @Override
    protected String withdrawalErrorMessage() {
        return "Insufficient funds";
    }
}