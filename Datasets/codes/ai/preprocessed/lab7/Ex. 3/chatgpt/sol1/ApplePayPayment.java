public class ApplePayPayment extends Payment {
    private String appleId;

    public ApplePayPayment(String appleId) {
        this.appleId = appleId;
    }

    @Override
    public boolean canPay(double amount) {
        // Assume it can always pay for simplicity
        return true;
    }

    @Override
    public double executePayment(double amount) {
        System.out.println("Paid " + amount + " via Apple Pay with Apple ID: " + appleId);
        return 0; // No change for Apple Pay
    }
}