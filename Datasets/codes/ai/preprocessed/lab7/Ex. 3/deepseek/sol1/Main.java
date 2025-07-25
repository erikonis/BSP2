public class Main {
    public static void main(String[] args) {
        try {
            // Create accounts
            BankAccount regularAccount = new BankAccount(1000);
            OverdraftAccount creditAccount = new OverdraftAccount(1000, 500);

            // Create payment methods
            Payment cash = new CashPayment(500);
            Payment debitCard = new DebitCardPayment(regularAccount, "1111-2222-3333-4444");
            Payment creditCard = new CreditCardPayment(creditAccount, "5555-6666-7777-8888");

            // Test payments
            testPayment(cash, 450);
            testPayment(debitCard, 800);
            testPayment(creditCard, 1200);
            testPayment(creditCard, 400); // Should fail (overdraft exhausted)

        } catch (PaymentException e) {
            System.out.println("Payment error: " + e.getMessage());
        }
    }

    private static void testPayment(Payment payment, double amount) throws PaymentException {
        System.out.println("\nAttempting " + payment.getPaymentMethod() + " payment of $" + amount);

        if (payment.canMakePayment(amount)) {
            double change = payment.executePayment(amount);
            System.out.println("Payment successful! Change: $" + change);

            if (payment instanceof CardPayment) {
                CardPayment card = (CardPayment) payment;
                System.out.println("Remaining balance: $" + card.account.getBalance());
            }
        } else {
            System.out.println("Payment cannot be processed");
        }
    }
}