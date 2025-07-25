// WireTransferPayment.java
public class WireTransferPayment extends Payment {
    private String senderAccountNumber;
    private String receiverAccountNumber;
    private String bankCode;

    public WireTransferPayment(double amount, String senderAccountNumber, String receiverAccountNumber, String bankCode) {
        super(amount);
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.bankCode = bankCode;
    }

    public String getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public String getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public String getBankCode() {
        return bankCode;
    }

    @Override
    public boolean canPay() {
        // In a real system, this would involve checking the balance of the sender's account
        // For this example, we'll just assume it can always be initiated.
        System.out.println("Initiating wire transfer from account " + senderAccountNumber + " to " + receiverAccountNumber + " at bank " + bankCode + " for amount " + amount);
        return true;
    }

    @Override
    public double executePayment() {
        if (canPay()) {
            System.out.println("Wire transfer of " + amount + " successfully executed.");
            // In a real system, this would involve interacting with banking APIs
            return 0.0; // No change for wire transfer
        } else {
            System.out.println("Wire transfer could not be initiated.");
            return -1.0; // Indicate failure
        }
    }
}