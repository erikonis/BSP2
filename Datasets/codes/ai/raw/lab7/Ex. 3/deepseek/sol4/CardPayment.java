package payment_system.model.payments;
import payment_system.model.cards.Card;

public class CardPayment implements PaymentMethod {
    private final Card card;
    
    public CardPayment(Card card) {
        this.card = card;
    }
    
    @Override
    public boolean authorize(double amount, double moneyGiven) {
        return card.authorize(amount);
    }
    
    @Override
    public PaymentResult process(double amount, double moneyGiven) {
        if (authorize(amount, moneyGiven) && card.process(amount)) {
            return new PaymentResult(true, "Card payment processed", 0);
        }
        return new PaymentResult(false, "Card payment failed", 0);
    }
    
    @Override
    public String getDescription() {
        return card.getCardDetails();
    }
}