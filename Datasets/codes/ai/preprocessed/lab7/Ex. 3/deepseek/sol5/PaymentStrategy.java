import payment.domain.PaymentResult;
import payment.exceptions.PaymentException;

public interface PaymentStrategy {
    PaymentResult execute(double amount) throws PaymentException;
    PaymentResult execute(double amount, double cashGiven) throws PaymentException;
    String getPaymentMethodName();
}