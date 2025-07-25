public abstract class CardPayment implements Payment {
    protected BankAccount account;
    protected String cardNumber;

    public CardPayment(BankAccount account, String cardNumber) {
        this.account = account;
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean canMakePayment(double amount) {
        try {
            account.withdraw(amount);
            account.deposit(amount); // Test transaction
            return true;
        } catch (InsufficientFundsException e) {
            return false;
        }
    }

    @Override
    public double executePayment(double amount) throws PaymentException {
        try {
            account.withdraw(amount);
            return 0; // No change for card payments
        } catch (InsufficientFundsException e) {
            throw new PaymentException("Card payment failed: " + e.getMessage());
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }
}