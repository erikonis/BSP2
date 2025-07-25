package payment.paymentmethods;

import payment.domain.PaymentResult;
import payment.exceptions.PaymentException;

public class CryptoStrategy implements PaymentStrategy {
    private final String walletAddress;
    
    public CryptoStrategy(String walletAddress) {
        this.walletAddress = walletAddress;
    }
    
    @Override
    public PaymentResult execute(double amount) throws PaymentException {
        // In real implementation, amount would be in crypto units
        return PaymentResult.success(
            "CRYPTO-" + System.currentTimeMillis(),
            String.format("Crypto payment of %.8f BTC processed", amount),
            amount,
            0
        );
    }
    
    @Override
    public PaymentResult execute(double amount, double cashGiven) throws PaymentException {
        return execute(amount); // Ignore cashGiven for crypto
    }
    
    @Override
    public String getPaymentMethodName() {
        return "Cryptocurrency";
    }
}