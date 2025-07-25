package payment_system;

import payment_system.model.BankAccount;
import payment_system.model.cards.*;
import payment_system.model.payments.*;

public class Main {
    public static void main(String[] args) {
        // Create bank accounts
        BankAccount regularAccount = new BankAccount("123456", 1000.0, false);
        BankAccount overdraftAccount = new BankAccount("654321", 500.0, true);
        
        // Create payment processors
        PaymentProcessor processor = new PaymentProcessor();
        
        // Test different payment methods
        processor.testPayment(new CashPayment(), 50.0, 60.0);
        processor.testPayment(new CardPayment(new DebitCard(regularAccount)), 100.0, 0);
        processor.testPayment(new CardPayment(new CreditCard(overdraftAccount)), 600.0, 0);
        processor.testPayment(new PayPalPayment("user@example.com"), 30.0, 0);
    }
}

class PaymentProcessor {
    public void testPayment(PaymentMethod method, double amount, double moneyGiven) {
        System.out.println("\nAttempting to pay " + amount + " with " + method.getDescription());
        
        if (method.authorize(amount, moneyGiven)) {
            PaymentResult result = method.process(amount, moneyGiven);
            if (result.isSuccess()) {
                System.out.println("Payment successful! " + result.getMessage());
            } else {
                System.out.println("Payment failed: " + result.getMessage());
            }
        } else {
            System.out.println("Authorization failed: Insufficient funds or invalid payment method");
        }
    }
}