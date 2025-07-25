package payment;

import payment.domain.*;
import payment.paymentmethods.*;
import payment.processors.*;

public class Main {
    public static void main(String[] args) {
        // Setup
        Account checkingAccount = new Account("CHK123", 1000.00);
        Account savingsAccount = new Account("SAV456", 5000.00, true);
        
        // Create payment strategies
        PaymentStrategy cash = new CashStrategy();
        PaymentStrategy debitCard = new CardStrategy(checkingAccount);
        PaymentStrategy creditCard = new CardStrategy(savingsAccount);
        PaymentStrategy paypal = new PayPalStrategy("user@example.com");
        PaymentStrategy crypto = new CryptoStrategy("BTC_WALLET_123");
        
        // Process payments
        PaymentProcessor processor = new PaymentProcessor();
        
        try {
            processor.processPayment(cash, 50.00, 60.00);
            processor.processPayment(debitCard, 100.00);
            processor.processPayment(creditCard, 600.00);
            processor.processPayment(paypal, 30.00);
            processor.processPayment(crypto, 0.005); // 0.005 BTC
        } catch (PaymentException e) {
            System.err.println("Payment failed: " + e.getMessage());
        }
    }
}