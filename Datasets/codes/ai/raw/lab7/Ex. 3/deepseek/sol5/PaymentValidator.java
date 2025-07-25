package payment.processors;

import payment.exceptions.PaymentException;

public class PaymentValidator {
    public void validateAmount(double amount) throws PaymentException {
        if (amount <= 0) {
            throw new PaymentException("Amount must be positive");
        }
    }
    
    public void validateCash(double cashGiven) throws PaymentException {
        if (cashGiven < 0) {
            throw new PaymentException("Cash given cannot be negative");
        }
    }
}