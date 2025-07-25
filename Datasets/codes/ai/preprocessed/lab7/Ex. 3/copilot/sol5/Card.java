public abstract class Card {
    protected BankAccount account;

    public Card(BankAccount account) {
        this.account = account;
    }

    public abstract boolean canMakePayment(double amount);
    public abstract void executePayment(double amount);
}