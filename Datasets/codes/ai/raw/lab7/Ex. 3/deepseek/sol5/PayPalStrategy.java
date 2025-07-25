package payment.paymentmethods;

import payment.domain.PaymentResult;
import payment.exceptions.PaymentException;

public class PayPalStrategy implements PaymentStrategy {
    private final String email;
    
    public PayPalStrategy(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid PayPal email");
        }
        this.email = email;
    }
    
    private boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }
    
    @Override
    public PaymentResult execute(double amount) throws PaymentException {
        // Simulate PayPal processing
        if (amount > 1000) {
            return PaymentResult.failure("PayPal transaction limit exceeded");
        }
        
        return PaymentResult.success(
            "PYPL-" + System.currentTimeMillis(),
            String.format("PayPal payment of %.2f from %s processed", amount, email),
            amount,
            0
        );
    }
    
    @Override
    public PaymentResult execute(double amount, double cashGiven) throws PaymentException {
        return execute(amount); // Ignore cashGiven for PayPal
    }
    
    @Override
    public String getPaymentMethodName() {
        return "PayPal";
    }
}