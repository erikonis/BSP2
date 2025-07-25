package payment_system.model.payments;

public class CashPayment implements PaymentMethod {
    @Override
    public boolean authorize(double amount, double moneyGiven) {
        return moneyGiven >= amount;
    }
    
    @Override
    public PaymentResult process(double amount, double moneyGiven) {
        if (authorize(amount, moneyGiven)) {
            double change = moneyGiven - amount;
            return new PaymentResult(true, 
                change > 0 ? "Change: " + change : "Exact amount received",
                change);
        }
        return new PaymentResult(false, "Insufficient cash provided", 0);
    }
    
    @Override
    public String getDescription() {
        return "Cash Payment";
    }
}