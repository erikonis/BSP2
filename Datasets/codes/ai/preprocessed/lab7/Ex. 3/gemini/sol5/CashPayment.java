public class CashPayment extends Payment {
    private double givenMoney;

    public CashPayment(double amount, BankAccount account, double givenMoney) {
        super(amount, account);
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
    public void executePayment() {
        if (canPay()) {
            double change = givenMoney - getAmount();
            System.out.println("Cash payment of " + getAmount() + " successful. Change: " + change);
        } else {
            System.out.println("Insufficient cash provided.");
        }
    }
}