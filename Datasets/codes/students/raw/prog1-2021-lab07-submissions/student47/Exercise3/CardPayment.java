package Exercise3;

public class CardPayment extends Payment {

    public CardPayment(Person from, Person to, double amount) {
        super(from, to, amount);
    }

    public boolean check() {
        if (from.getCard() instanceof CreditCard)
            if (from.getCard().acc.getBalance() + from.getCard().acc.getAllowedOverdraft() >= amount) {
                System.out.println("Card payment possible!");
                return true;
            } else {
                System.out.println("Card payment impossible!");
                return false;
            }

        else if (from.getCard().acc.getBalance() >= amount) {
            System.out.println("Card payment possible!");
            return true;
        } else {
            System.out.println("Card payment impossible!");
            return false;
        }
    }

    public void execute() {
        if (check()) {
            from.card.acc.withdraw(amount);
            to.card.acc.balance += amount;
            System.out.println("Payment executed! \n" + to.getName() + " received " + amount + " from " + from.getName()
                    + " by card.");

        }

    }

}
