public class OverdraftState implements AccountState {
    private final double allowedOverdraft;

    public OverdraftState(double allowedOverdraft) {
        this.allowedOverdraft = allowedOverdraft;
    }

    @Override
    public void withdraw(double amount, Account account) {
        if (amount > account.getBalance() + allowedOverdraft) {
            throw new IllegalArgumentException("Exceeds overdraft limit");
        }
        account.setBalance(account.getBalance() - amount);
    }
}
