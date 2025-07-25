public class WireTransferPayment extends Payment {
    private String senderAccountNumber;
    private String receiverAccountNumber;
    private BankAccount senderAccount;

    public WireTransferPayment(double amount, String senderAccountNumber, String receiverAccountNumber, BankAccount senderAccount) {
        super(amount);
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.senderAccount = senderAccount;
    }

    public String getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public String getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    @Override
    public boolean canPay() {
        return senderAccount.getBalance() >= getAmount();
    }

    @Override
    public double executePayment() {
        if (canPay()) {
            senderAccount.withdraw(getAmount());
            System.out.println("Wire transfer of " + getAmount() + " from account " + senderAccountNumber + " to " + receiverAccountNumber + " successful.");
            return 0;
        } else {
            System.out.println("Wire transfer failed due to insufficient funds.");
            return -1;
        }
    }
}