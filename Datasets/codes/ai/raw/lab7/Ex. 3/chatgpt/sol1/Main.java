public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(500);
        DebitCard debitCard = new DebitCard(bankAccount);
        CreditCard creditCard = new CreditCard(bankAccount, 100);
        CashPayment cashPayment = new CashPayment(200);

        PaymentProcessor processor = new PaymentProcessor();
        
        processor.processPayment(cashPayment, 50);
        processor.processPayment(debitCard, 100);
        processor.processPayment(creditCard, 550);
    }
}
