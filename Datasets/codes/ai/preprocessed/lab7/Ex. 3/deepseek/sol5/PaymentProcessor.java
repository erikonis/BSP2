import payment.paymentmethods.PaymentStrategy;
import payment.domain.PaymentResult;
import payment.exceptions.PaymentException;

public class PaymentProcessor {
    private final PaymentValidator validator = new PaymentValidator();

    public PaymentResult processPayment(PaymentStrategy strategy, double amount)
            throws PaymentException {
        validator.validateAmount(amount);
        return strategy.execute(amount);
    }

    public PaymentResult processPayment(PaymentStrategy strategy, double amount, double cashGiven)
            throws PaymentException {
        validator.validateAmount(amount);
        validator.validateCash(cashGiven);
        return strategy.execute(amount, cashGiven);
    }
}