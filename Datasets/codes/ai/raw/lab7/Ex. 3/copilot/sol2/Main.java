// Main.java
public class Main {
    public static void main(String[] args) {
        // Test Cash Payment
        Payment cashPayment = new CashPayment(50, 100);
        if (cashPayment.canMakePayment()) {
            System.out.println("Cash Payment executed. Change: " + cashPayment.executePayment());
        }

        // Test Debit Card Payment
        BankAccount debitAccount = new BankAccount(200);
        Card debitCard = new DebitCard(debitAccount);
        Payment debitPayment = new CardPayment(150, debitCard);
        if (debitPayment.canMakePayment()) {
            debitPayment.executePayment();
            System.out.println("Debit Card Payment executed. Remaining balance: " + debitAccount.getBalance());
        }

        // Test Credit Card Payment
        BankAccount creditAccount = new BankAccount(100);
        Card creditCard = new CreditCard(creditAccount, 200);
        Payment creditPayment = new CardPayment(250, creditCard);
        if (creditPayment.canMakePayment()) {
            creditPayment.executePayment();
            System.out.println("Credit Card Payment executed. Remaining balance: " + creditAccount.getBalance());
        }
    }
}