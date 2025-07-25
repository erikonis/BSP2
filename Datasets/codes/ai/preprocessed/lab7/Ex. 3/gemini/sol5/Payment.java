public abstract class Payment {
    private double amount;
    private BankAccount account; // Added BankAccount here

    public Payment(double amount, BankAccount account) {
        this.amount = amount;
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public BankAccount getAccount() {
        return account;
    }

    public abstract boolean canPay();
    public abstract void executePayment(); // Changed return type to void
}