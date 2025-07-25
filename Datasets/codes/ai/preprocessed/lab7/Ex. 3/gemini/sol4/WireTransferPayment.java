public class WireTransferPayment implements IPayable {
    private double amount;
    private String senderAccountNumber;
    private String receiverAccountNumber;
    private BankAccount senderAccount;

    public WireTransferPayment(double amount, String senderAccountNumber, String receiverAccountNumber, BankAccount senderAccount) {
        this.amount = amount;
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.senderAccount = senderAccount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public String getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public String getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public BankAccount getSenderAccount() {
        return senderAccount;
    }

    @Override
    public boolean canPay() {
        return senderAccount.getBalance() >= amount;
    }

    @Override
    public double executePayment() {
        if (canPay()) {
            senderAccount.withdraw(amount);
            System.out.println("Wire transfer of " + amount + " from account " + senderAccountNumber + " to " + receiverAccountNumber + " successful.");
            return 0;
        } else {
            System.out.println("Wire transfer failed due to insufficient funds.");
            return -1;
        }
    }
}