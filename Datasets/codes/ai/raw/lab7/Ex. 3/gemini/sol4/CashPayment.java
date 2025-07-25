public class CashPayment implements IPayable {
    private double amount;
    private double givenMoney;

    public CashPayment(double amount, double givenMoney) {
        this.amount = amount;
        this.givenMoney = givenMoney;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public double getGivenMoney() {
        return givenMoney;
    }

    @Override
    public boolean canPay() {
        return givenMoney >= amount;
    }

    @Override
    public double executePayment() {
        if (canPay()) {
            double change = givenMoney - amount;
            System.out.println("Cash payment of " + amount + " successful. Change: " + change);
            return change;
        } else {
            System.out.println("Insufficient cash provided.");
            return -1;
        }
    }
}