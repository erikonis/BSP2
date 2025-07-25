import payment.domain.PaymentResult;
import payment.exceptions.PaymentException;

public class CashStrategy implements PaymentStrategy {
    @Override
    public PaymentResult execute(double amount) throws PaymentException {
        throw new PaymentException("Cash payments require cashGiven parameter");
    }

    @Override
    public PaymentResult execute(double amount, double cashGiven) throws PaymentException {
        if (cashGiven < amount) {
            return PaymentResult.failure("Insufficient cash provided");
        }

        double change = cashGiven - amount;
        String message = change > 0 ?
            String.format("Paid %.2f with %.2f, change: %.2f", amount, cashGiven, change) :
            String.format("Paid exact amount: %.2f", amount);

        return PaymentResult.success(
            "CASH-" + System.currentTimeMillis(),
            message,
            amount,
            change
        );
    }

    @Override
    public String getPaymentMethodName() {
        return "Cash";
    }
}