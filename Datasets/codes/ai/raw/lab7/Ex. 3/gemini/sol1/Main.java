// Main.java
public class Main {
    public static void main(String[] args) {
        // Create bank accounts
        NormalAccount userNormalAccount = new NormalAccount(100.0);
        OverdraftAccount userOverdraftAccount = new OverdraftAccount(50.0, 100.0);

        // Create cards
        DebitCard userDebitCard = new DebitCard("1234-5678-9012-3456", userNormalAccount);
        CreditCard userCreditCard = new CreditCard("9876-5432-1098-7654", userOverdraftAccount);

        // Test cash payment
        System.out.println("--- Cash Payment ---");
        CashPayment cashPayment1 = new CashPayment(25.0);
        System.out.println("Can pay with cash: " + cashPayment1.canPay());
        double change1 = cashPayment1.executePayment();
        if (change1 >= 0) {
            System.out.println("Change: " + change1);
        }

        System.out.println("\n--- Debit Card Payment ---");
        CardPayment debitCardPayment1 = new CardPayment(75.0, userDebitCard);
        System.out.println("Can pay with debit card: " + debitCardPayment1.canPay());
        double change2 = debitCardPayment1.executePayment();
        if (change2 >= 0) {
            System.out.println("Debit card payment successful.");
        }

        CardPayment debitCardPayment2 = new CardPayment(150.0, userDebitCard);
        System.out.println("Can pay with debit card (insufficient funds): " + debitCardPayment2.canPay());
        double change3 = debitCardPayment2.executePayment();
        if (change3 >= 0) {
            System.out.println("Debit card payment successful.");
        }

        System.out.println("\n--- Credit Card Payment ---");
        CardPayment creditCardPayment1 = new CardPayment(120.0, userCreditCard);
        System.out.println("Can pay with credit card: " + creditCardPayment1.canPay());
        double change4 = creditCardPayment1.executePayment();
        if (change4 >= 0) {
            System.out.println("Credit card payment successful.");
        }

        CardPayment creditCardPayment2 = new CardPayment(200.0, userCreditCard);
        System.out.println("Can pay with credit card (exceeds overdraft): " + creditCardPayment2.canPay());
        double change5 = creditCardPayment2.executePayment();
        if (change5 >= 0) {
            System.out.println("Credit card payment successful.");
        }

        System.out.println("\n--- Wire Transfer Payment ---");
        WireTransferPayment wireTransferPayment1 = new WireTransferPayment(1000.0, "SENDER123", "RECEIVER456", "BANKXYZ");
        System.out.println("Can initiate wire transfer: " + wireTransferPayment1.canPay());
        double change6 = wireTransferPayment1.executePayment();
        if (change6 >= 0) {
            System.out.println("Wire transfer initiated.");
        }

        // Check final balances
        System.out.println("\n--- Final Balances ---");
        System.out.println("User Normal Account Balance: " + userNormalAccount.getBalance());
        System.out.println("User Overdraft Account Balance: " + userOverdraftAccount.getBalance());
    }
}