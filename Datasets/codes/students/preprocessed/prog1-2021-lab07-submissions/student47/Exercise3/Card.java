public abstract class Card {
    protected BankAccount acc;

    public Card(BankAccount acc) {
        this.acc = acc;
    }

    public abstract BankAccount getAcc();

}
