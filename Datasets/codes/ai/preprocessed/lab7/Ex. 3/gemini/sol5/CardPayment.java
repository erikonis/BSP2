public class CardPayment extends Payment {
    private Card card;

    public CardPayment(double amount, BankAccount account, Card card) {
        super(amount, account);
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    @Override
    public boolean canPay() {
        if (card.getCardType().equalsIgnoreCase("debit")) {
            return getAccount().getBalance() >= getAmount();
        } else if (card.getCardType().equalsIgnoreCase("credit")) {
            return true; // Simplified: Assume credit limit is always sufficient
        }
        return false;
    }

    @Override
    public void executePayment() {
        if (card.getCardType().equalsIgnoreCase("debit")) {
            if (getAccount().withdraw(getAmount())) {
                System.out.println("Debit card payment of " + getAmount() + " successful.");
            } else {
                System.out.println("Debit card payment failed.");
            }
        } else if (card.getCardType().equalsIgnoreCase("credit")) {
            if (getAccount().withdraw(getAmount(), card.getOverdraftLimit())) {
                System.out.println("Credit card payment of " + getAmount() + " successful.");
            } else {
                System.out.println("Credit card payment failed.");
            }
        } else {
            System.out.println("Invalid card type.");
        }
    }
}