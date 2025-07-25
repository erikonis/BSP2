public class CashPayment extends Payment {
    private double givenMoney;

    public CashPayment(double amount, double givenMoney) {
        super(amount);
        this.givenMoney = givenMoney;
    }

    public double getGivenMoney() {
        return givenMoney;
    }

    @Override
    public boolean canPay() {
        return givenMoney >= getAmount();
    }

    @Override
    public double executePayment() {
        if (canPay()) {
            double change = givenMoney - getAmount();
            System.out.println("Cash payment of " + getAmount() + " successful. Change: " + change);
            return change;
        } else {
            System.out.println("Insufficient cash provided.");
            return -1;
        }
    }
}