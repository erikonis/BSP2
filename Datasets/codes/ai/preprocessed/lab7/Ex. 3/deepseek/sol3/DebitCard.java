public class DebitCard extends Card {
    public DebitCard(BankAccount account) {
        super(account);
    }

    @Override
    public boolean canMakePayment(double amount) {
        return account.getBalance() >= amount;
    }

    @Override
    public void executePayment(double amount) {
        if (canMakePayment(amount)) {
            account.withdraw(amount);
        } else {
            throw new IllegalArgumentException("Insufficient funds in the account.");
        }
    }
}