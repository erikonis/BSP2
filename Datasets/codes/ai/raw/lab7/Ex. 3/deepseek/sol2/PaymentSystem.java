import java.util.ArrayList;
import java.util.List;

// Main class to test the payment system
public class PaymentSystem {
    public static void main(String[] args) {
        // Create bank accounts
        BankAccount regularAccount = new BankAccount("123456", 1000.0, false);
        BankAccount overdraftAccount = new BankAccount("654321", 500.0, true);
        
        // Create payment methods
        PaymentMethod cash = new CashPayment();
        PaymentMethod debitCard = new CardPayment(new DebitCard(regularAccount));
        PaymentMethod creditCard = new CardPayment(new CreditCard(overdraftAccount));
        
        // Test payments
        testPayment(cash, 50.0, 60.0); // Cash payment with change
        testPayment(cash, 50.0, 50.0); // Exact cash payment
        testPayment(debitCard, 100.0, 0); // Debit card payment
        testPayment(creditCard, 600.0, 0); // Credit card payment (using overdraft)
        testPayment(debitCard, 2000.0, 0); // Attempt payment beyond balance
        
        // Additional payment methods
        PaymentMethod paypal = new PayPalPayment("user@example.com");
        testPayment(paypal, 30.0, 0);
    }
    
    private static void testPayment(PaymentMethod method, double amount, double moneyGiven) {
        System.out.println("\nAttempting to pay " + amount + " with " + method.getClass().getSimpleName());
        
        if (method.canPay(amount, moneyGiven)) {
            double change = method.executePayment(amount, moneyGiven);
            if (change > 0) {
                System.out.println("Payment successful! Change: " + change);
            } else {
                System.out.println("Payment successful!");
            }
        } else {
            System.out.println("Payment failed: Insufficient funds or invalid payment method");
        }
    }
}

// Bank Account class (from Exercise 2)
class BankAccount {
    private String accountNumber;
    private double balance;
    private boolean allowsOverdraft;
    
    public BankAccount(String accountNumber, double initialBalance, boolean allowsOverdraft) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.allowsOverdraft = allowsOverdraft;
    }
    
    public boolean withdraw(double amount) {
        if (amount <= 0) return false;
        
        if (balance >= amount || allowsOverdraft) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
}

// Card interface
interface Card {
    boolean authorizePayment(double amount);
    boolean processPayment(double amount);
    String getCardType();
}

// Debit Card implementation
class DebitCard implements Card {
    private BankAccount linkedAccount;
    
    public DebitCard(BankAccount account) {
        this.linkedAccount = account;
    }
    
    @Override
    public boolean authorizePayment(double amount) {
        return linkedAccount.getBalance() >= amount;
    }
    
    @Override
    public boolean processPayment(double amount) {
        return linkedAccount.withdraw(amount);
    }
    
    @Override
    public String getCardType() {
        return "Debit Card";
    }
}

// Credit Card implementation
class CreditCard implements Card {
    private BankAccount linkedAccount;
    
    public CreditCard(BankAccount account) {
        if (!account.allowsOverdraft) {
            throw new IllegalArgumentException("Credit cards must be linked to overdraft-allowed accounts");
        }
        this.linkedAccount = account;
    }
    
    @Override
    public boolean authorizePayment(double amount) {
        // Credit cards always authorize (up to their limit)
        return true;
    }
    
    @Override
    public boolean processPayment(double amount) {
        return linkedAccount.withdraw(amount);
    }
    
    @Override
    public String getCardType() {
        return "Credit Card";
    }
}

// Payment Method interface
interface PaymentMethod {
    boolean canPay(double amount, double moneyGiven);
    double executePayment(double amount, double moneyGiven);
}

// Cash Payment implementation
class CashPayment implements PaymentMethod {
    @Override
    public boolean canPay(double amount, double moneyGiven) {
        return moneyGiven >= amount;
    }
    
    @Override
    public double executePayment(double amount, double moneyGiven) {
        if (canPay(amount, moneyGiven)) {
            return moneyGiven - amount;
        }
        throw new IllegalStateException("Payment cannot be executed");
    }
}

// Card Payment implementation
class CardPayment implements PaymentMethod {
    private Card card;
    
    public CardPayment(Card card) {
        this.card = card;
    }
    
    @Override
    public boolean canPay(double amount, double moneyGiven) {
        // moneyGiven is ignored for card payments
        return card.authorizePayment(amount);
    }
    
    @Override
    public double executePayment(double amount, double moneyGiven) {
        if (canPay(amount, moneyGiven)) {
            if (card.processPayment(amount)) {
                return 0; // No change for card payments
            }
        }
        throw new IllegalStateException("Payment cannot be executed");
    }
    
    @Override
    public String toString() {
        return card.getCardType();
    }
}

// PayPal Payment implementation
class PayPalPayment implements PaymentMethod {
    private String email;
    private static final List<String> VALID_DOMAINS = List.of("gmail.com", "yahoo.com", "outlook.com");
    
    public PayPalPayment(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }
    
    private boolean isValidEmail(String email) {
        String[] parts = email.split("@");
        if (parts.length != 2) return false;
        return VALID_DOMAINS.contains(parts[1]);
    }
    
    @Override
    public boolean canPay(double amount, double moneyGiven) {
        // Simplified - in reality would check PayPal balance or linked funding sources
        return true;
    }
    
    @Override
    public double executePayment(double amount, double moneyGiven) {
        if (canPay(amount, moneyGiven)) {
            System.out.println("Processing PayPal payment from " + email);
            return 0;
        }
        throw new IllegalStateException("Payment cannot be executed");
    }
}