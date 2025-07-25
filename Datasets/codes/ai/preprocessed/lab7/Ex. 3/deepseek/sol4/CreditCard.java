import payment_system.model.BankAccount;

public class CreditCard implements Card {
    private final BankAccount linkedAccount;

    public CreditCard(BankAccount account) {
        if (!account.allowsOverdraft()) {
            throw new IllegalArgumentException("Credit cards require overdraft-enabled accounts");
        }
        this.linkedAccount = account;
    }

    @Override
    public boolean authorize(double amount) {
        return amount > 0; // Simplified authorization
    }

    @Override
    public boolean process(double amount) {
        return linkedAccount.withdraw(amount);
    }

    @Override
    public String getCardDetails() {
        return "Credit Card with overdraft on account " + linkedAccount.getAccountNumber();
    }
}