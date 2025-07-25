public class NormalState implements AccountState {
    @Override
    public void withdraw(double amount, Account account) {
        if (amount > account.getBalance()) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        account.setBalance(account.getBalance() - amount);
    }
}

