// CardPayment.java
public class CardPayment extends Payment {
    private Card card;

    public CardPayment(double amount, Card card) {
        super(amount);
        this.card = card;
    }

    @Override
    public boolean canMakePayment() {
        return card.canMakePayment(amount);
    }

    @Override
    public double executePayment() {
        card.executePayment(amount);
        return 0; // No change for card payments
    }
}