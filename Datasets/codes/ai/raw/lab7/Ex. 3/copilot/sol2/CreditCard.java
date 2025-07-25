// CreditCard.java
public class CreditCard extends Card {
    private double overdraftLimit;

    public CreditCard(BankAccount account, double overdraftLimit) {
        super(account);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean canMakePayment(double amount) {
        return account.getBalance() + overdraftLimit >= amount;
    }

    @Override
    public void executePayment(double amount) {
        if (canMakePayment(amount)) {
            account.withdraw(amount);
        } else {
            throw new IllegalArgumentException("Payment exceeds overdraft limit.");
        }
    }
}