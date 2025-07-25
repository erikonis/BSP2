public class CardPayment implements IPayable {
    private CardInterface card;
    private double amount;

    public CardPayment(double amount, CardInterface card) {
        this.amount = amount;
        this.card = card;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public CardInterface getCard() {
        return card;
    }

    @Override
    public boolean canPay() {
        if (card.getCardType().equalsIgnoreCase("debit")) {
            return card.getBankAccount().getBalance() >= amount;
        } else if (card.getCardType().equalsIgnoreCase("credit")) {
            return true; // Simplified: Assume credit limit is always sufficient
        }
        return false;
    }

    @Override
    public double executePayment() {
        if (card.getCardType().equalsIgnoreCase("debit")) {
            if (card.getBankAccount().withdraw(amount)) {
                System.out.println("Debit card payment of " + amount + " successful.");
                return 0;
            } else {
                System.out.println("Debit card payment failed.");
                return -1;
            }
        } else if (card.getCardType().equalsIgnoreCase("credit")) {
            double overdraftLimit = 500; //Or get it from the bank account.
            if (card.getBankAccount().withdraw(amount, overdraftLimit)) {
                System.out.println("Credit card payment of " + amount + " successful.");
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