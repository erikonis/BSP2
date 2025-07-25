public class CashPayment implements Payment {
    private double cashProvided;

    public CashPayment(double cashProvided) {
        this.cashProvided = cashProvided;
    }

    @Override
    public boolean canMakePayment(double amount) {
        return cashProvided >= amount;
    }

    @Override
    public double executePayment(double amount) throws PaymentException {
        if (!canMakePayment(amount)) {
            throw new PaymentException("Insufficient cash provided");
        }
        cashProvided -= amount;
        return cashProvided; // Return change
    }

    @Override
    public String getPaymentMethod() {
        return "Cash";
    }

    public double getCashProvided() {
        return cashProvided;
    }
}