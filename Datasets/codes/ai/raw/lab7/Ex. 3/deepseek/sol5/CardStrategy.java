package payment.paymentmethods;

import payment.domain.Account;
import payment.domain.PaymentResult;
import payment.exceptions.*;

public class CardStrategy implements PaymentStrategy {
    private final Account linkedAccount;
    
    public CardStrategy(Account account) {
        this.linkedAccount = account;
    }
    
    @Override
    public PaymentResult execute(double amount) throws PaymentException {
        try {
            linkedAccount.withdraw(amount);
            return PaymentResult.success(
                "CARD-" + System.currentTimeMillis(),
                String.format("Card payment of %.2f processed", amount),
                amount,
                0
            );
        } catch (InsufficientFundsException e) {
            return PaymentResult.failure(e.getMessage());
        }
    }
    
    @Override
    public PaymentResult execute(double amount, double cashGiven) throws PaymentException {
        return execute(amount); // Ignore cashGiven for cards
    }
    
    @Override
    public String getPaymentMethodName() {
        return linkedAccount.allowsOverdraft() ? "Credit Card" : "Debit Card";
    }
}