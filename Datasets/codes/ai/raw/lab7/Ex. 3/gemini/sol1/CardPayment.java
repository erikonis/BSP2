// CardPayment.java
public class CardPayment extends Payment {
    private Card card;

    public CardPayment(double amount, Card card) {
        super(amount);
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    @Override
    public boolean canPay() {
        return card.getBankAccount().getBalance() >= amount ||
               (card instanceof CreditCard &&
                card.getBankAccount().getBalance() - amount >= -((OverdraftAccount) card.getBankAccount()).getAllowedOverdraft());
    }

    @Override
    public double executePayment() {
        if (canPay()) {
            if (card.getBankAccount().withdraw(amount)) {
                return 0.0; // No change for card payment
            } else {
                System.out.println("Error during card payment execution.");
                return -1.0; // Indicate failure
            }
        } else {
            System.out.println("Card payment cannot be processed due to insufficient funds/overdraft limit.");
            return -1.0; // Indicate failure
        }
    }
}