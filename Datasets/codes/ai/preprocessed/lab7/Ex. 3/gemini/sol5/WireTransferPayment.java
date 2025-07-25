public class WireTransferPayment extends Payment {
    private String receiverAccountNumber;

    public WireTransferPayment(double amount, BankAccount account, String receiverAccountNumber) {
        super(amount, account);
        this.receiverAccountNumber = receiverAccountNumber;
    }

    public String getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    @Override
    public boolean canPay() {
        return getAccount().getBalance() >= getAmount();
    }

    @Override
    public void executePayment() {
        if (canPay()) {
            getAccount().withdraw(getAmount());
            System.out.println("Wire transfer of " + getAmount() + " from account " + getAccount().getAccountNumber() + " to " + receiverAccountNumber + " successful.");
        } else {
            System.out.println("Wire transfer failed due to insufficient funds.");
        }
    }
}