public class Main {
    public static void main(String[] args) {
        BankAccount debitAccount = new BankAccount(1000);
        BankAccount creditAccount = new BankAccount(500);
        CreditCard creditCard = new CreditCard(creditAccount, 1000);
        DebitCard debitCard = new DebitCard(debitAccount);

        Payment cashPayment = new CashPayment(200, 250);
        Payment cardPayment = new Payment(300) {
            @Override
            public boolean canMakePayment() {
                return creditCard.canMakePayment(amount);
            }

            @Override
            public double executePayment() {
                creditCard.executePayment(amount);
                return 0; // No change for card payments
            }
        };

        System.out.println("Cash Payment:");
        if (cashPayment.canMakePayment()) {
            System.out.println("Change: " + cashPayment.executePayment());
        } else {
            System.out.println("Cannot make cash payment.");
        }

        System.out.println("Card Payment:");
        if (cardPayment.canMakePayment()) {
            cardPayment.executePayment();
            System.out.println("Card payment executed.");
        } else {
            System.out.println("Cannot make card payment.");
        }
    }
}
