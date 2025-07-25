public class CashPayment extends Payment {
    private double givenMoney;

    public CashPayment(double amount, double givenMoney) {
        super(amount);
        this.givenMoney = givenMoney;
    }

    @Override
    public boolean canMakePayment() {
        return givenMoney >= amount;
    }

    @Override
    public double executePayment() {
        if (canMakePayment()) {
            return givenMoney - amount; // Return change
        } else {
            throw new IllegalArgumentException("Insufficient cash provided.");
        }
    }
}
