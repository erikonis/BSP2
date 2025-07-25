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
        if (card.getCardType().equalsIgnoreCase("debit")) {
            return card.getBankAccount().getBalance() >= getAmount();
        } else if (card.getCardType().equalsIgnoreCase("credit")) {
            // For credit cards, check against balance + overdraft
            return true; // Assume overdraft is always sufficient in this simplified model.
        }
        return false; //Should not reach here
    }

    @Override
    public double executePayment() {
        if (card.getCardType().equalsIgnoreCase("debit")) {
            if (card.getBankAccount().withdraw(getAmount())) {
                System.out.println("Debit card payment of " + getAmount() + " successful.");
                return 0;
            } else {
                System.out.println("Debit card payment failed.");
                return -1;
            }
        } else if (card.getCardType().equalsIgnoreCase("credit")) {
            double overdraftLimit = 500;
            if (card.getBankAccount().withdraw(getAmount(), overdraftLimit)) {
                System.out.println("Credit card payment of " + getAmount() + " successful.");
                return 0;
            } else {
                System.out.println("Credit card payment failed.");
                return -1;
            }

        } else {
            System.out.println("Invalid card type.");
            return -1;
        }
    }
}